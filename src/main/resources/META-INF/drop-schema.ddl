alter table Phone drop constraint FK8xaqnqv1igwrucoj72r539ntq
alter table Student drop constraint FKf12myy73nsf6soln9xli8th80
drop table if exists Address cascade
drop table if exists Class cascade
drop table if exists Phone cascade
drop table if exists Student cascade
drop sequence if exists hibernate_sequence
