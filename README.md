# Pets App

Este proyecto es una aplicación simple para mostrar un listado de mascotas.

Está compuesto por dos partes principales:

- **Backend (API REST en Java Spring Boot):** expone un endpoint `/pet/list` que devuelve una lista de mascotas en formato JSON.
- **Frontend (PHP puro):** consume la API y muestra el listado en una tabla usando Bootstrap para el estilo.

## ¿Cómo funciona?

1. El backend se ejecuta en Java y responde peticiones HTTP con información de mascotas.
2. El frontend, hecho en PHP, solicita los datos al backend y los muestra en una tabla en una página web.

