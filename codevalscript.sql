CREATE TABLE persons (
	person_id serial PRIMARY KEY,
	firstname VARCHAR ( 50 ) NOT NULL,
	lastname VARCHAR ( 50 ) NOT null,
	fatherid Integer default 0,
	motherid Integer default 0
);

select fatherid from persons where firstname = 'jim' and lastname = 'bob' ;
select * from persons;
truncate table persons;
drop table persons;

insert into persons (firstname,lastname)
values('jim','bob');	

CREATE TABLE parents (
	user_id serial PRIMARY KEY
);

select person_id from persons where firstname = 'jim';


		