(load "test-manager/load.scm")

; 조건 식과 술어
(define (abs x)
	(cond ((< x 0) (- x))
		  (else x)))

(define (average x y)
	(/ (+ x y) 2))

(define (square x)
	(* x x))

(define (good-enough? guess x)
	(< (abs (- (square guess) x)) 0.001))

(in-test-group
	sqrt

	(define-test (good-enough?)
		(assert-true (good-enough? 1.4 2) #t) "this valus should be true")
	)

	(define-test (square) 
		(check (= (square 3) 9) "square should be 9")
	)

	(define-test (average) 
		(check (= (average 2 3) 2.5) "averge should be 2.5")
	)

	(define-test (abs-positive) 
		(check (= (abs 3) 3) "abs should be 3")
	)

	(define-test (abs-negative) 
		(check (= (abs -3) 3) "abs should be 3")
	)

	(run-registered-tests)
)