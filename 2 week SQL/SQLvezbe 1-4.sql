select * from actor;

SELECT actor_id, first_name
FROM actor;

SELECT * from actor where first_name like'__ck';

SELECT * from customer;

SELECT first_name, last_name, email from customer;

select * from rental;

select rental_id, return_date from rental where customer_id not in (1,2);

SELECT customer_id, rental_id, return_date FROM rental WHERE customer_id NOT IN (1, 2);

select * from payment;

SELECT customer_id, amount from payment  where amount between 8 and 9;

select first_name, last_name from customer where first_name like '%er%';


select * from customer where first_name like 'Jamie';

select * from customer where first_name like 'Jamie' or last_name like 'Rice';

select * from payment;

select customer_id from payment where amount <1 or amount >8;

select * from customer;

select first_name, last_name from customer order by first_name asc;

SELECT first_name, last_name from customer order by last_name DEsC;

SELECT AVG (AMOUNT) from payment;

SELECT min (amount) from payment;
SELECT max (amount) from payment;

select count(amount) from payment;

select * from payment;

select sum (amount) from payment;

select count (first_name) from customer where first_name = 'Janet';

select * from customer;

select * from payment;

select count(amount) from payment where(amount)>5.99 ;

SELECT customer_id, sum (amount) from payment GROUP by customer_id;

SELECT customer_id, sum (amount) from payment GROUP by customer_id order by sum (amount) desc;

SELECT staff_id, count (payment_id) from payment group by staff_id;

SELECT customer_id, sum (amount) from payment GROUP by customer_id having sum (amount)>200;

select * from film;

select film_id, title, length from film where length > all(select (avg(length)) from film group by rating) order by length;



