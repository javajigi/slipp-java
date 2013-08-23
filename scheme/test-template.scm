(load "test-manager/load.scm")

(in-test-group
	mypractice	

	(define-test (length) 
		(assert-equal 3 (length '(1 2 3)))
	)

	(run-registered-tests)
)