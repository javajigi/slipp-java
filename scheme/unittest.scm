(load "test-manager/load.scm")

(define (sum x y)
	(+ x y))


(in-test-group
	calculator

	(define-test (add) 
		(check (= (sum 3 5) 8) "sum should be 8")
	)

	(run-registered-tests)
)