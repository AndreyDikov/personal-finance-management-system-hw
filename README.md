# Personal Finance Management System (PFMS)

Ниже приведена инструкция по запуску проекта и проверке работоспособности.

---

## 1) Настройте PostgreSQL и создайте отдельную базу данных

Рекомендуется создать отдельную БД, например: `personal_finance_management_system`.

### Вариант A — через DataGrip / pgAdmin
1. Создайте новую базу данных: `personal_finance_management_system`
2. Создайте пользователя (или используйте существующего)
3. Выдайте пользователю права на созданную базу данных

### Вариант B — через psql (пример команд)
Подключитесь к PostgreSQL и выполните:

```sql
create database personal_finance_management_system;

create user pfms_user with password 'pfms_password';

grant all privileges on database personal_finance_management_system to pfms_user;
```

### И укажите настройки вашей БД в файле application.yaml
```yaml
  datasource:
    url: jdbc:postgresql://localhost:5432/personal_finance_management_system
    username: user
    password: pass
```

---

## 2) Сгенерировать секрет для JWT (HS256)

Секрет должен быть минимум 32 байта (рекомендуется 32+ ASCII символов).

Сгенерируйте секрет, например, здесь: https://jwtsecretkeygenerator.com/

Аналогично настройкам БД, укажите сгенерированный секрет в application.yaml
```yaml
spring:
  security:
    jwt:
      secret: "YOu_sECRet"
```

---

## 3) Запустите тесты (опционально)

Тесты позволяют проверить работоспособность системы до запуска приложения.

Для этого разверните модуль test

Нажмите пкм по папке services

Нажмите лкм по кнопке Run Tests in...

---

## 4) Запустите сам проект

Liquibase сам сгенерирует все таблицы в БД

---

## 5) Откройте Swagger UI и проверьте возможности API

При запуске приложения откройте Swagger UI в браузере: http://localhost:8080/swagger-ui/index.html

