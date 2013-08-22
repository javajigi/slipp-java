(load "test-manager/load.scm")

(define (char-to-int number) 
	(- 
		(char->integer number)
		(char->integer #\0)
	)
)

(define (string-to-digit-list creditcard-no)
	(map 
		(lambda (each) (char-to-int each))
		creditcard-no
	)
)

(char-to-int #\4)
(string-to-digit-list (string->list "3456"))

(in-test-group
	mypractice

	(define-test (car) 
		(check (= (car '(1 2 3)) 1))
	)

	(define-test (car) 
		(check (= (car '(1 2 3)) 1))
	)

	(run-registered-tests)
)