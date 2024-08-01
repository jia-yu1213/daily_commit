-- 코드를 작성해주세요
select sum(a.SCORE) as SCORE, a.EMP_NO, b.EMP_NAME, b.POSITION, b.EMAIL
from HR_GRADE a, HR_EMPLOYEES b
where a.EMP_NO = b.EMP_NO
group by a.EMP_NO
order by score desc limit 1;
