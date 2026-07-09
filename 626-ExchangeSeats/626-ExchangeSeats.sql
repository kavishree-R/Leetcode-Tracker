-- Last updated: 7/9/2026, 3:09:45 PM
select 
case when id % 2 = 1 and id !=(select max(id)from seat)
        then id+1 
    when id % 2 = 0 
        then id - 1
    else id 
end as id,student from seat order by id;