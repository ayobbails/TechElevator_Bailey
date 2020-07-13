-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
select title
      ,first_name
      ,last_name
from actor      act
     inner join
     film_actor fa
  on act.actor_id = fa.actor_id
     inner join
     film       fl
  on fl.film_id = fa.film_id
 where first_name = 'NICK'
   and last_name  = 'STALLONE'
;
  
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select title
      ,first_name
      ,last_name
from actor      act
     inner join
     film_actor fa
  on act.actor_id = fa.actor_id
     inner join
     film       fl
  on fl.film_id = fa.film_id
 where first_name = 'RITA'
   and last_name  = 'REYNOLDS'
;
  
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
select title
      ,first_name
      ,last_name
from actor      act
     inner join
     film_actor fa
  on act.actor_id = fa.actor_id
     inner join
     film       fl
  on fl.film_id = fa.film_id
 where (first_name = 'JUDY'
   and last_name  = 'DEAN')
    or (first_name = 'RIVER'
   and last_name  = 'DEAN')
;
  
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select title
      ,name
from category cat
     inner join
     film_category fc
  on cat.category_id = fc.category_id
     inner join
     film       fl
  on fl.film_id = fc.category_id
 where name = 'Documentary'
;


-- 5. All of the ‘Comedy’ films
-- (58 rows)
select title
      ,name
from category cat
     inner join
     film_category fc
  on cat.category_id = fc.category_id
     inner join
     film       fl
  on fl.film_id = fc.category_id
 where name = 'Comedy'
;

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT  cat.name 
       ,fl.title
       ,fl.rating 
FROM category cat
        INNER JOIN
     film_category fc
     ON cat.category_id =  fc.category_id
        INNER JOIN
     film fl
     ON fc.film_id = fl.film_id      
WHERE fl.rating = 'G'
        AND cat.name = 'Children'
;
       
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT cat.name
        ,fl.rating
        ,fl.length
FROM category cat
        INNER JOIN
      film_category fc
      ON cat.category_id = fc.category_id
        INNER JOIN
      film fl
      ON fc.film_id = fl.film_id
WHERE cat.name = 'Family' AND fl.rating = 'G' and fl.length <  120
;     
        

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT ac.first_name
      ,ac.last_name
      ,fl.rating
      ,fl.title
FROM actor ac
      INNER JOIN
     film_actor fa
     ON ac.actor_id = fa.actor_id
      INNER JOIN
     film fl
     ON fa.film_id = fl.film_id
WHERE ac.first_name = 'MATTHEW' AND ac.last_name = 'LEIGH' AND fl.rating = 'G'
;      
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT cat.name
      ,fl.release_year
FROM category cat
        INNER JOIN
      film_category fc
      ON cat.category_id = fc.category_id
        INNER JOIN
      film fl
      ON fl.film_id = fc.film_id
WHERE cat.name = 'Sci-Fi' and  fl.release_year = 2006
;       
      

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select title     
from actor          act
   inner join
     film_actor     fa
on act.actor_id = fa.actor_id
   inner join
     film           fl
on fl.film_id = fa.film_id
   inner join
     film_category  fc
on fc.film_id = fl.film_id
   inner join
     category       c
on c.category_id = fc.category_id     
where c.name = 'Action' and first_name = 'NICK'
and last_name  = 'STALLONE'
;

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT store.store_id
      ,ct.country
      ,c.city
      ,a.district
      ,a.address
FROM country ct
        INNER JOIN
        city c   
ON   c.country_id = ct.country_id         
        INNER JOIN
        address a
ON   a.city_id = c.city_id
;        
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select store.store_id, address, first_name, last_name
from store
inner join address on store.address_id = address.address_id
inner join staff on store.store_id = staff.staff_id
;     
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

--
--
--
--
--
--
--
--
--
--