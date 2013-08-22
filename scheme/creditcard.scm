(define (char-to-digit char)
	(- (char->integer char) (char->integer #\0)))

(define (string-to-digit values)
	(map 
		(lambda (each) (char-to-digit each)) values		
	)
)

(define	(doubleValue values)
	(map 
		(lambda (each) (* 2 each)) values
	)
)

(define (ret-odds lst)
  (cond ((null? lst) lst)
        ((null? (cdr lst)) lst)
        (else (cons (car lst) (ret-odds (cddr lst))))))

(define (ret-evens lst)
  (cond ((null? lst) lst)
        ((null? (cdr lst)) (cdr lst))
        (else (cons (cadr lst) (ret-evens (cddr lst))))))

(define 
	(list-sum list)
	(cond 
		((null? list) 0)
		((null? (cdr list)) (car list))
		(else (+ (car list) (list-sum (cdr list))))
	)
)

(define (sum-over-ten value)
	(list-sum (string-to-digit (string->list (number->string value))))
)


(define (convert-two-to-one values)
	(map (lambda (each) 
			(cond
				((< each 10) each)
				(else (sum-over-ten each))
			))
		values
	)
)

(define (next-ten-value value)
	(+ 10 (- value (remainder value 10)))
)

(define (subtract-next-ten-value value)
	(- (next-ten-value value) value)
)

(define (calculate-validate-creditcard creditcard-no)
	(subtract-next-ten-value (list-sum (append
		(convert-two-to-one (doubleValue 
			(ret-evens (reverse 
				(string-to-digit (string->list creditcard-no))
			))
		))
		(ret-odds (reverse (string-to-digit (string->list creditcard-no))))
	)))
)

(calculate-validate-creditcard "345678")