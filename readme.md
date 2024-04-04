
# LOGIN-JWT-SPRINGSECURITY-ANGULAR

▶️ Progreso del proyecto: 60%

Este projecto es un sistema de login, se implementa un proceso de autenticación con JWT y SpringSecurity para la seguridad de la arquitectura.

🔧 Back-end desarrollado en [Springboot 3.0]

🔧 Front-end desarrollado en  [Angular 16.2.12]

    Link del repositorio:

🔧 Base de datos en Postgresql [Version 15.6]






## Requisitos

📏 JDK 17

📏 Springboot 3.0

📏 Script SQL:

```
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    firstname VARCHAR(255),
    country VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    UNIQUE KEY (username)
);
```





## API Reference

#### ⭕ Logueo

```http
  POST /auth/login
```

🔗 Body:

```
{
    "username": "example",
    "password": "example"
}
```


#### ⭕ Register

```http
  POST /auth/register
```

🔗 Body:

```
{
    "username": "example",
    "firstname": "example",
    "lastname": "example",
    "password": "example",
    "country": "Mexico"
}
```

#### ⭕ Obtener Usuario

```http
  GET /api/v1/user/{id}
```

#### ⭕ Actualizar Usuario

```http
  PUT /api/v1/user/{id}
```
```
🔗 Body:

{
    "username": "example",
    "firstname": "example",
    "lastname": "example",
    "password": "example",
    "country": "Mexico"
}
```




## Referencias

Existen endpoints protegidos, por ejemplo:


⭕ Actualizar Usuario
  PUT /api/v1/user/{id}

Este endpoint esta protegido por SpringSecurity y necesita un Json Web Token (JWS) en Authorization (Bearer Token) para poder actualizar registros de usuarios.

Todos los endpoint /get no estan restringidos.



## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/aldo-isaias-becerra-campos-591621200/)


