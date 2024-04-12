-- 코드를 작성해주세요
select count(id) as FISH_COUNT, CAST(date_format(time,'%m') AS UNSIGNED) as MONTH 
from fish_info 
group by MONTH
order by MONTH