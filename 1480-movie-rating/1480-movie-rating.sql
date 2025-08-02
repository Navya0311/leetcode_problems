# Write your MySQL query statement below
(select name as results from movierating join users using(user_id)
group by name order by count(*) desc,name limit 1)
union all
(select title as results from movierating join movies using(movie_id) WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
group by title order by avg(rating) desc,title limit 1);