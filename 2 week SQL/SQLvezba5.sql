select * from film;

select * from inventory;

select film.film_id, film.title, inventory.inventory_id from film left join inventory on inventory.film_id=film.film_id where inventory.inventory_id is NULL;

SELECT * from customer;
SELECT * from payment;

SELECT customer.customer_id, customer.first_name, customer.last_name, payment.amount 
from customer inner join payment on customer.customer_id=payment.customer_id 
order by customer.customer_id; 

SELECT customer.customer_id, customer.first_name, customer.last_name, payment.amount 
from customer left join payment on customer.customer_id=payment.customer_id
where payment.amount is not null
order by customer.customer_id;

select * from staff;

SELECT customer.customer_id,customer.first_name AS customer_first_name,
customer.last_name AS customer_last_name, customer.email,
staff.first_name AS staff_first_name,staff.last_name AS staff_last_name,amount,payment_date 
FROM customer INNER JOIN payment ON payment.customer_id=customer.customer_id 
INNER JOIN staff ON payment.staff_id=staff.staff_id;

select staff.first_name RadnikIme, staff.last_name RadnikPrezime, customer.first_name , customer.last_name 
from staff inner join payment on staff.staff_id = payment.staff_id 
inner join customer on payment.customer_id = customer.customer_id;