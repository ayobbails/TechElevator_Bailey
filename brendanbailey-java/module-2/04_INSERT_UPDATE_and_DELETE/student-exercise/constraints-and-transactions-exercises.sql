-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table


BEGIN TRANSACTION;

INSERT INTO actor 
(first_name, last_name)
VALUES ('Lisa', 'Byway')
;
INSERT INTO actor 
(first_name, last_name)
VALUES ('Hampton', 'Avenue')
;
SELECT *
FROM actor
WHERE first_name = 'Lisa' AND last_name = 'Byway'
and first_name = 'Hampton' and last_name = 'Avenue'
;
ROLLBACK;

COMMIT;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

BEGIN TRANSACTION;

insert into film 
(title
,description
,release_year
,language_id
,length)

values
('Euclidean PI'
,'The epic story of Euclid as a pizza delivery boy in ancient Greece'
,2008
,(Select language_id From language Where name = 'English')
,198)
;        
SELECT *
FROM film
WHERE title = 'Euclidean PI' AND description = 'The epic story of Euclid as a pizza delivery boy in ancient Greece'
;   
ROLLBACK;
COMMIT;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
Begin Transaction;
insert into film_actor
(actor_id
,film_id)

values
((Select actor_id From actor Where first_name = 'Hampton' and last_name = 'Avenue')
,(Select film_id From film Where title = 'Euclidean PI'))
;
Rollback;
Commit;
-- 4. Add Mathmagical to the category table.
Insert into category
(name)
Values
('Mathmagical')
;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
begin transaction;
insert into film_category
(category_id, film_id)
values((Select category_id from category where name = 'Mathmagical'),(Select film_id from film where title = 'Euclidean PI'))
;
insert into film_category
(category_id, film_id)
values((Select category_id from category where name = 'Mathmagical'),(Select film_id from film where title = 'EGG IGBY'))
;
insert into film_category
(category_id, film_id)
values((Select category_id from category where name = 'Mathmagical'),(Select film_id from film where title = 'KARATE MOON'))
;
insert into film_category
(category_id, film_id)
values((Select category_id from category where name = 'Mathmagical'),(Select film_id from film where title = 'RANDOM GO'))
;
insert into film_category
(category_id, film_id)
values((Select category_id from category where name = 'Mathmagical'),(Select film_id from film where title = 'YOUNG LANGUAGE'))
;
commit;
rollback;


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
update film
set rating = 'G' 
from category where name = 'Mathmagical'
;
-- 7. Add a copy of "Euclidean PI" to all the stores.
begin transaction;
insert into inventory
(film_id, store_id)
values
((select film_id from film where title = 'Euclidean PI'),1)
;
insert into inventory
(film_id, store_id)
values
((select film_id from film where title = 'Euclidean PI'),2)
;
commit;
rollback;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <no, key film_id is still referenced from table film_actor>
delete from film
where title = 'Euclidean PI'
;
rollback;
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <no, key category_id is still referenced from table film_category>
delete from category
where name = 'Mathmagical'
;
rollback;
-- 10. Delete all links to Mathmagical in the film_category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
begin transaction;
delete from film_category
where category_id = 18
;
rollback;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
begin transaction;
--delete from category
--where name = 'Mathmagical'
--;
delete from film
where title = 'Euclidean PI'
;
rollback;
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
