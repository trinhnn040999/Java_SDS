
-- Cau 1:
select EMP_NUM, EMP_LNAME, EMP_NITIAL, EMP_FNAME
from employee
where EMP_LNAME like 'Smith%';
-- Cau 2:
select PROJ_NAME, proj_value, proj_balance, EMP_LNAME, EMP_FNAME, EMP_NITIAL, e.JOB_CODE, JOB_DESCRIPTION, JOB_CHG_HOUR 
from job as j inner join employee as e on j.JOB_CODE = e.JOB_CODE
				inner join project as p on e.EMP_NUM = p.EMP_NUM
order by proj_value;
-- cau 3:
select PROJ_NAME, proj_value, proj_balance, EMP_LNAME, EMP_FNAME, EMP_NITIAL, e.JOB_CODE, JOB_DESCRIPTION, JOB_CHG_HOUR 
from job as j inner join employee as e on j.JOB_CODE = e.JOB_CODE
				inner join project as p on e.EMP_NUM = p.EMP_NUM
order by EMP_LNAME;
-- cau 4:
select distinct PROJ_NUM
from assignment;
-- cau 5:
select ASSIGNMENT_NUM, EMP_NUM, PROJ_NUM, ASSIGNMENT_CHARGE, ASSIGNMENT_CHG_HR * ASSIGNMENT_HOURS as xacthuc
from assignment;

-- cau 6:
select e.EMP_NUM, EMP_LNAME, sum(ASSIGNMENT_HOURS) as TongGio, sum(ASSIGNMENT_CHARGE) as TongTien
from employee as e inner join assignment as a on e.EMP_NUM = a.EMP_NUM
group by EMP_NUM, EMP_LNAME
order by EMP_NUM;
-- cau 7:
select PROJ_NUM, sum(ASSIGNMENT_HOURS) as TongGio, sum(ASSIGNMENT_CHARGE) as TongTien
from assignment as a
group by PROJ_NUM
order by PROJ_NUM;