insert into oshs.position (name)
values ('Генеральный директор'),
       ('Главный бухгалтер'),
       ('Начальник отдела бухгалтерии'),
       ('Бухгалтер'),
       ('ЗГД по персоналу'),
       ('Начальник отдела HR'),
       ('HR'),
       ('Начальник отдела безопасности'),
       ('Помощник начальника безопасности'),
       ('Начальник информационной безопасности'),
       ('Специалист по информационной безопасности'),
       ('Начальник экономической безопасности'),
       ('Специалист по экономической безопасности'),
       ('Начальник ИТ отдела'),
       ('Программист'),
       ('Тестировщик'),
       ('Аналитик'),
       ('Начальник отдела поддержки'),
       ('Специалист поддержки 1 линии'),
       ('Специалист поддержки 2 линии');

insert into oshs.department(parent_id, name, created)
values (1, 'Главное управление', now()),
       (1, 'Бухгалтерия', now()),
       (1, 'Отдел HR', now()),
       (1, 'Отдел безопасной безопасности', now()),
       (5, 'Отдел информационной безопасности', now()),
       (5, 'Отдел экономической безопасности', now()),
       (1, 'ИТ отдел', now()),
       (1, 'Отдел поддержки', now());

insert into oshs.employee(department_id, sex, position_id, leader, first_name, second_name, last_name, birth_date,
                          work_date, fired_date, phone, email, money_ru)
values (1, 'MAN', 1, true, 'Герман', 'Оскарович', 'Сбер', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000000),
       (1, 'MAN', 2, false, 'Иван', 'Иванович', 'Иванов', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (1, 'WOMAN', 5, false, 'Ирина', 'Муцуовна', 'Хакамада', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (2, 'INTER', 3, true, 'Транс', 'Мужчинович', 'Женщевна', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (2, 'MAN', 4, false, 'Василий', 'Васильевич', 'Васильев', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (2, 'WOMAN', 4, false, 'Александра', 'Александровна', 'Александрович', now(), now(), null, 'номер телефона',
        'post@post.post', 10000000),
       (3, 'WOMAN', 6, true, 'Евгения', 'Евгеньевна', 'Евгеньевич', now(), now(), null, 'номер телефона',
        'post@post.post', 10000000),
       (3, 'MAN', 7, false, 'Что', 'Тут', 'Забыл', now(), now(), null, 'номер телефона', 'post@post.post', 10000000),
       (4, 'MAN', 8, true, 'Все', 'Тут', 'Безопасно', now(), now(), null, 'номер телефона', 'post@post.post', 10000000),
       (4, 'MAN', 9, false, 'Помогаю', 'Безопасной', 'Безопасности', now(), now(), null, 'номер телефона',
        'post@post.post', 10000000),
       (5, 'INTER', 10, true, 'ИТ', 'В', 'Безопасности', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (5, 'WOMAN', 11, false, 'Делаю', 'ИТ', 'Безопасными', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (6, 'MAN', 12, true, 'Экономика', 'В', 'Безопасности', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (6, 'WOMAN', 13, false, 'Делаю', 'Экономику', 'Безопасной', now(), now(), null, 'номер телефона',
        'post@post.post', 10000000),
       (7, 'WOMAN', 14, true, 'ИТ', 'Продукт', 'Готов', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (7, 'WOMAN', 15, false, 'Программирую', null, 'Программу', now(), now(), null, 'номер телефона',
        'post@post.post', 10000000),
       (7, 'WOMAN', 16, false, 'Тестирую', null, 'Программу', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (7, 'WOMAN', 17, false, 'Анализирую', null, 'Программу', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (8, 'WOMAN', 18, true, 'Тут', 'Все', 'Работает', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (8, 'MAN', 19, false, 'Почти', 'Все', 'Работает', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (8, 'MAN', 19, false, 'Не', 'Все', 'Работает', now(), now(), null, 'номер телефона', 'post@post.post', 10000000),
       (8, 'MAN', 20, false, 'Совсем', 'Не', 'Работает', now(), now(), null, 'номер телефона', 'post@post.post',
        10000000),
       (8, 'MAN', 20, false, 'Не', 'Совсем', 'Работает', now(), now(), now(), 'номер телефона', 'post@post.post',
        10000000);
