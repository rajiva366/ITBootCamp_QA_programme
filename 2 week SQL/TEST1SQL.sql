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










