(load "test-manager/load.scm")

(define 
	(char->number value)
	(- (char->integer value) (char->integer #\0))
)

(in-test-group
	mypractice

	(define-test (char-integer) 
		(assert-equal (char->number #\0) 0)
	)	

	(define-test (car) 
		(assert-equal (car '(1 2 3)) 1)
	)

	(define-test (cdr) 
		(assert-equal (cdr '(1 2 3)) '(2 3))
	)

	(define-test (cddr) 
		(assert-equal (cddr '(1 2 3)) '(3))
	)

	(define-test (null) 
		(assert-equal (null? '()) #t)
	)

	(define-test (cdr-null) 
		(assert-equal (null? (cdr '(1))) #t)
	)

	(define-test (cons) 
		(assert-equal (cons (car '(1)) '(2 3)) '(1 2 3))
	)	

	(run-registered-tests)
)