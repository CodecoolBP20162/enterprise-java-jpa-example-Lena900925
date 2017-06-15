create sequence hibernate_sequence start 1 increment 1
create table Address (id  bigserial not null, addr varchar(255), city varchar(255), country varchar(255), Zip varchar(4), primary key (id))
create table Class (id int8 not null, location varchar(255), name varchar(255), primary key (id))
create table Phone (student_id int8 not null, phoneNumbers varchar(255))
create table Student (id  bigserial not null, dateOfBirth date, email varchar(255), name varchar(255), address_id int8, primary key (id))
alter table Student add constraint UK_msrnvlmsye9t98fb3bvekffiq unique (email)
alter table Phone add constraint FK8xaqnqv1igwrucoj72r539ntq foreign key (student_id) references Student
alter table Student add constraint FKf12myy73nsf6soln9xli8th80 foreign key (address_id) references Address
