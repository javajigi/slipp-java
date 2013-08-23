(load "test-manager/load.scm")

(define 
	(char->number value)
	(- (char->integer value) (char->integer #\0))
)

(in-test-group
	mypractice

	(define-test (char-integer) 
		(assert-equal 0 (char->number #\0))
	)	

	(define-test (car) 
		(assert-equal 1 (car '(1 2 3)))
	)

	(define-test (cdr) 
		(assert-equal '(2 3) (cdr '(1 2 3)))
	)

	(define-test (cddr) 
		(assert-equal '(3) (cddr '(1 2 3)))
	)

	(define-test (cadr) 
		(assert-equal '(3 4) (cdar '((1 3 4) 2 3)))
	)

	(define-test (null) 
		(assert-equal #t (null? '()))
	)

	(define-test (cdr-null) 
		(assert-equal #t (null? (cdr '(1))))
	)

	(define-test (cons) 
		(assert-equal '(1 2 3) (cons (car '(1)) '(2 3)))
	)	

	(run-registered-tests)
)