SELECT 
  ROUND(
    COUNT(DISTINCT a.player_id) / 
    (SELECT COUNT(DISTINCT player_id) FROM Activity), 
  2) AS fraction
FROM Activity a
JOIN (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) first_login_table
ON a.player_id = first_login_table.player_id
WHERE DATEDIFF(a.event_date, first_login_table.first_login) = 1;
