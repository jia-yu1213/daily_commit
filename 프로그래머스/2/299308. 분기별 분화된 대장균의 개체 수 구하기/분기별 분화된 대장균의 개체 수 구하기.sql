-- 코드를 작성해주세요

select 
case when substring(DIFFERENTIATION_DATE,6,2) < '04' then '1Q'
     when substring(DIFFERENTIATION_DATE,6,2) < '07' then '2Q'
     when substring(DIFFERENTIATION_DATE,6,2) < '10' then '3Q'
else '4Q'
end as QUARTER,
count(id) as ECOLI_COUNT
from ECOLI_DATA
group by QUARTER
order by 1