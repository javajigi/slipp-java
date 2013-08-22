(load "test-manager/load.scm")

(define 
	(list-sum list)
	(cond 
		((null? list) 0)
		((null? (cdr list)) (car list))
		(else (+ (car list) (list-sum (cdr list))))
	)
)

(in-test-group
	list-sum

	(define-test (add-empty) 
		(check (= (list-sum '()) 0) "sum should be 0")
	)

	(define-test (add-one-element) 
		(check (= (list-sum '(1)) 1) "sum should be 1")
	)

	(define-test (add-two-element) 
		(check (= (list-sum '(1 2)) 3) "sum should be 3")
	)

	(define-test (add-element-over-three) 
		(check (= (list-sum '(1 2 3)) 6) "sum should be 6")
	)

	(run-registered-tests)
)