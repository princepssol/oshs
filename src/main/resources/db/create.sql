create schema if not exists oshs;

create sequence if not exists oshs.department_seq start 1 increment 1;
create sequence if not exists oshs.position_seq start 1 increment 1;
create sequence if not exists oshs.employee_seq start 1 increment 1;

create table if not exists oshs.department
(
    id        int          not null primary key default nextval('oshs.department_seq'),
    parent_id int          not null references oshs.department (id),
    name      varchar(255) not null,
    created   timestamp    not null
);

create table if not exists oshs.position
(
    id   int          not null primary key default nextval('oshs.position_seq'),
    name varchar(255) not null unique
);

create table if not exists oshs.employee
(
    id            int            not null primary key default nextval('oshs.employee_seq'),
    department_id int            not null references oshs.department (id),
    sex           varchar(255)   not null,
    position_id   int            not null references oshs.position (id),
    leader        boolean        not null,
    first_name    varchar(255)   not null,
    second_name   varchar(255),
    last_name     varchar(255)   not null,
    birth_date    timestamp      not null,
    work_date     timestamp      not null,
    fired_date    timestamp,
    phone         varchar(255)   not null,
    email         varchar(255)   not null,
    money_ru      numeric(15, 2) not null
);
