(string? "javajigi")

(string? 'javajigi)

(string-length "123")

(string->number "567")

(substring "abcd" 1 3)

(string->list "1234")

(reverse '(1 2 3 4))

(define(myif value) 
	(if (> value 3) (value) )
)

(integer? 4)



(map (lambda (number) (+ 1 number)) '(1 2 3 4 5) )


(map 
	(lambda (each)
		(even? each)
	)
	'(3 5 8 2 3)
)

(number->string 13)

(define (charToDigit char)
	(- (char->integer char) (char->integer #\0)))

(define 
	(stringToDigit values)
	(map 
		(lambda (each) (charToDigit each)) 
		values		
	)
)

(define (list-sum lst)
   (cond
     ((null? lst)
       0)
     ((pair? (car lst))
      (+(list-sum (car lst)) (list-sum (cdr lst))))
     (else
       (+ (car lst) (list-sum (cdr lst))))))

(list-sum '(1 2))

(list-sum '(1 2 3 4))

(list-sum (stringToDigit (string->list "134")))

(define (next-ten-value value)
	(+ 10 (- value (remainder value 10)))
)

(next-ten-value 35)


(define (sum-over-ten value)
	(list-sum (stringToDigit (string->list (number->string value))))
)

(sum-over-ten 18)

(define (sum values)
	(map (lambda (each) 
			(cond
				((< each 10) each)
				(else (sum-over-ten each))
			))
		values
	)
)

(sum '(18 5 8))
