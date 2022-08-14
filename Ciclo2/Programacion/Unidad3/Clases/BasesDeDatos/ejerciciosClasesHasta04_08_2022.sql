-- muestre el id empleado, nombre y apellido del empleado en una columna, id job,
-- el titulo del trabajo, salario
-- donde salario > 5000 y su job sean programamdores
--NATURAL JOIN --Lo utilizamos cuando los campos por los cuales se enlazan
-- las tablas tienen el mismo nombre en la columna 

SELECT e.employee_id,
       e.first_name || ' ' || e.last_name AS [Nombres y Apellidos],
       e.job_id,
       j.job_title,
       e.salary
  FROM employees e
       NATURAL JOIN
       jobs j
 WHERE e.salary > 5000 AND 
       e.job_id = 9;
       
SELECT e.employee_id,
       e.first_name || ' ' || e.last_name AS [Nombres y Apellidos],
       e.job_id,
       j.job_title,
       e.salary
  FROM employees e
       NATURAL JOIN
       jobs j
 WHERE e.salary > 5000 AND 
       j.job_title = 'Programmer';
       
--- Mostrar el id del empleado, el apellido , el id de la localidad, 
--el id del departamento

SELECT e.employee_id,
       e.last_name,
       d.location_id,
       e.department_id,
       d.department_name
  FROM employees e
       JOIN
       departments d USING (
           department_id
       );

-- comparar campos de diversas tablas --JOIN ON
--Muestre el id del empleado, el apellido del empleado, 
--el id del departamento, el id de location del empleado por departamento
-- haciendo la consulta a la tabla empleados

SELECT e.employee_id,
       e.last_name,
       e.department_id,
       d.department_id,
       d.location_id
  FROM employees e
       JOIN
       departments d ON (e.department_id = d.department_id);


---SELF JOIN
--Unir una talba  a si misma
--Mostrar el last_naem del empleado y last_name del 
--jefe o manager
--tener en cuenta que el id del manager coincida con
-- el id del empleado en la tabla empleado

SELECT e.last_name, m.last_name FROM employees e join employees m
ON(e.manager_id = m.employee_id);

--Mostrar el apellido del empleado, el salario, el grado mientras que 
--los salarios de los empleados conserven el rango dado en 
--la tabla job_grades

SELECT e.last_name, e.salary, jg.grade 
from employees e JOIN job_grades jg
ON(e.salary BETWEEN jg.lowest_sal and jg.highest_sal);

--Mostrar los apellidos, el id del departamento
-- y el nombre del departamento 

SELECT e.last_name, e.department_id, d.department_name
FROM employees e
LEFT outer JOIN departments d 
ON(e.department_id = d.department_id);


--CROSS JOIN --Combinacion 
---Mostrar el apellido y el nombre del departamento
-- de los empleados combinando el apellido de cada empleado con cada departamento

SELECT last_name, department_name
FROM employees
CROSS JOIN departments;





---Ejercicio No. 1
SELECT location_id, street_address, city, state_province,
country_name
FROM locations
NATURAL JOIN countries;

--Ejercicio NO.8

SELECT e.last_name, d.hire_date FROM employees e JOIN employees d 
ON(d.last_name='Bell')
WHERE d.hire_date < e.hire_date ORDER BY e.hire_date;


--Seleccionar apellido y el salrio de los empleados 
-- mientras salary de esos empleados sea mayor que el de taylor

SELECT last_name, salary
FROM employees 
WHERE salary >(SELECT salary FROM employees 
WHERE last_name ='Bell');

--muestre el nombre del departamento y la sumatoria del 
--salario de los empleados que estene el mismo grupo 
--por nombre de departamento, seleccion ademas la sumatoria 
--entre el nuemro total de empleados de la consulta anterior



with dept_cost as(
SELECT d.department_name, sum(e.salary)as dept_total
FROM employees e
join departments d on (e.department_id = d.deparment_id)
group by d.department_name),
avg_cost as(
select sum(dept_total)/count(*) as dept_avg
from dept_costs)
SELECT * FROM dept_costs 
where dept_total >(SELECT dept_avg FROM avg_cost)
order by department_id;


---Ejercicio No.1

SELECT last_name, hire_date
from employees
where department_id =(select department_id FROM employees
WHERE last_name = 'Bell')
AND last_name <>'Bell';

CREATE TABLE job_history
    ( employee_id   NUMBER(6)
	 CONSTRAINT    jhist_employee_nn  NOT NULL
    , start_date    DATE
	CONSTRAINT    jhist_start_date_nn  NOT NULL
    , end_date      DATE
	CONSTRAINT    jhist_end_date_nn  NOT NULL
    , job_id        VARCHAR2(10)
	CONSTRAINT    jhist_job_nn  NOT NULL
    , department_id NUMBER(4)
    ) ;


--insertar datos
INSERT INTO job_history
VALUES (102
       , '13-01-2001'
       , '24-07-2006'
       , 'IT_PROG'
       , 60);

--Desde aquí
INSERT INTO job_history
VALUES (101
       , '21-09-1997'
       , '27-10-2001'
       , 'AC_ACCOUNT'
       , 110);

INSERT INTO job_history
VALUES (101
       , '28-10-2001'
       , '15-03-2005'
       , 'AC_MGR'
       , 110);

INSERT INTO job_history
VALUES (201
       ,'17-02-2004'
       , '19-12-2007'
       , 'MK_REP'
       , 20);

INSERT INTO job_history
VALUES  (114
        ,'24-03-2006'
        , '31-12-2007'
        , 'ST_CLERK'
        , 50
        );

INSERT INTO job_history
VALUES  (122
        , '01-01-2007'
        , '31-12-2007'
        , 'ST_CLERK'
        , 50
        );

INSERT INTO job_history
VALUES  (200
        , '17-09-1995'
        , '17-06-2001'
        , 'AD_ASST'
        , 90
        );

INSERT INTO job_history
VALUES  (176
        , '24-03-2006'
        , '31-12-2006'
        , 'SA_REP'
        , 80
        );

INSERT INTO job_history
VALUES  (176
        , '01-01-2007'
        , '31-12-2007'
        , 'SA_MAN'
        , 80
        );

INSERT INTO job_history
VALUES  (200
        , '01-07-2002'
        , '31-12-2006'
        , 'AC_ACCOUNT'
        , 90
        );

--- Seleccionar de la table empleados 
--y de la table job_history del empleado y su id del job

select employee_id, job_id
from employees union
select employee_id, job_id
from job_history;

select employee_id, job_id
from employees union all
select employee_id, job_id
from job_history;

select employee_id, job_id
from employees INTERSECT
select employee_id, job_id
from job_history;

select employee_id, job_id
from employees except
select employee_id, job_id
from job_history;


----Ejercicio No1
select department_id
FROM departments
EXCEPT 
SELECT department_id 
from employees 
where job_id = 'Stock Clerk';


--update tabla set columna o colunmas where ...

---Actualizar el id del departamento a 11, del empleado 
-- identoficado con documento de identidad numero 118 
select * from employees where employee_id = 118;

UPDATE employees SET department_id = 11
WHERE employee_id=118;

--Actualizar el empleado identificado con id 118 
-- en las columnas job_id y salary , y remplazar  sus
--datos por los del empleado 205



update employees set 
job_id =(select job_id from employees where employee_id = 205),
salary =(SELECT salary from employees where employee_id=205)
where employee_id=118;


---DELETE FROM table WHERE ...

--Eliminar de la table departamento 
--el registro cuyo nombre sea Finance

delete from departments where department_name ='';


--eliminar de la tabla empleado los registros donde el departamento id
-- incluya en el nombre el departamento del subconjunto Public


delete from employees
where department_id =(
SELECT department_id from departments
where department_name like '%Public%');

------

CREATE TABLE my_employee (
id NUMBER(4) NOT NULL,
last_name VARCHAR2(25),
first_name VARCHAR2(25),
userid VARCHAR2(8),
salary NUMBER(9,2)
);

--insertar datos
INSERT INTO job_history
VALUES (102
       , '13-01-2001'
       , '24-07-2006'
       , 'IT_PROG'
       , 60);

--Desde aquí
INSERT INTO job_history
VALUES (101
       , '21-09-1997'
       , '27-10-2001'
       , 'AC_ACCOUNT'
       , 110);

INSERT INTO job_history
VALUES (101
       , '28-10-2001'
       , '15-03-2005'
       , 'AC_MGR'
       , 110);

INSERT INTO job_history
VALUES (201
       ,'17-02-2004'
       , '19-12-2007'
       , 'MK_REP'
       , 20);

INSERT INTO job_history
VALUES  (114
        ,'24-03-2006'
        , '31-12-2007'
        , 'ST_CLERK'
        , 50
        );

INSERT INTO job_history
VALUES  (122
        , '01-01-2007'
        , '31-12-2007'
        , 'ST_CLERK'
        , 50
        );

INSERT INTO job_history
VALUES  (200
        , '17-09-1995'
        , '17-06-2001'
        , 'AD_ASST'
        , 90
        );

INSERT INTO job_history
VALUES  (176
        , '24-03-2006'
        , '31-12-2006'
        , 'SA_REP'
        , 80
        );

INSERT INTO job_history
VALUES  (176
        , '01-01-2007'
        , '31-12-2007'
        , 'SA_MAN'
        , 80
        );

INSERT INTO job_history
VALUES  (200
        , '01-07-2002'
        , '31-12-2006'
        , 'AC_ACCOUNT'
        , 90
        );
--

insert into my_employee 
VALUES(1,'Patel','Ralph','rpatel',895);


select * FROM my_employee;


insert into my_employee(id, last_name, first_name,
userid, salary)
values(2,'Dancs','Betty','bdancs',860);


update my_employee set last_name = 'López'
where id=4;

select* from employees where last_name ='Bell';

--Actualizar  el salario del empleado del empleado a 10000
--cuyo  last_name ='Bell'
begin;
update employees
set salary =10000
where last_name ='Bell';


ROLLBACK;
COMMIT;














