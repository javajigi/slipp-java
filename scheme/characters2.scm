(define (neweven? n)
	(= (remainder n 2) 0))

(neweven? 3)

(define (newif n)
	(if (neweven? n) n))

(newif 4)
(newif 3)

(list-ref (list 'a 'b 'c) 0)

(filter positive? '(1 -2 3 4 -5))

(define (ret-odds lst)
  (cond ((null? lst) lst)
        ((null? (cdr lst)) lst)
        (else (cons (car lst) (ret-odds (cddr lst))))))

(ret-odds (list 2 5 7 8 9))

(car (list 2 3 5))
(cdr (list 2 3 4 5 6 7))
(cons 1 (list 3 4 5))

(cddr (list 2 3 4))

(cadr '(2 4 5))

(define (ret-evens lst)
  (cond ((null? lst) lst)
        ((null? (cdr lst)) (cdr lst))
        (else (cons (cadr lst) (ret-evens (cddr lst))))))

(ret-evens (list 2))
(ret-evens (list 2 4))
(ret-evens (list 2 4 5))
(ret-evens (list 2 4 5 6))