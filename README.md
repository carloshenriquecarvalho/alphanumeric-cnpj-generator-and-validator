# Gera Aí – Alphanumeric CNPJ Generator & Validator

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F)
![Build](https://github.com/carloshenriquecarvalho/alphanumeric-cnpj-generator-and-validator/actions/workflows/ci.yml/badge.svg)
![License](https://img.shields.io/badge/License-MIT-blue)

A web application for generating and validating Brazilian **alphanumeric CNPJs**, introduced by the Receita Federal in November 2024.

This project was created to study and implement the new CNPJ specification, including the updated check digit (DV) algorithm and the generation of valid alphanumeric CNPJs.

## Live Demo

🌐 https://alphanumeric-cnpj-generator-and-validator.onrender.com/

## Features

- Generate valid alphanumeric CNPJs
- Validate alphanumeric CNPJs
- Format generated CNPJs automatically
- Copy generated CNPJs to the clipboard
- Responsive interface for desktop and mobile devices

## Technologies

- Java 21
- Spring Boot
- Thymeleaf
- Maven
- Docker
- GitHub Actions (Continuous Integration)
- Render

## Motivation

The traditional numeric CNPJ format was approaching its allocation limits. To expand the available namespace while preserving the existing 14-character structure, the Receita Federal introduced the new alphanumeric format.

This project implements the official validation algorithm published by the Receita Federal and provides a practical way to generate and validate the new identifiers.

## Official Reference

This implementation is based on the official documentation published by the Receita Federal on **November 5, 2024**.

[Cálculo do DV do CNPJ Alfanumérico](Insert the official document link here.)](https://www.gov.br/receitafederal/pt-br/centrais-de-conteudo/publicacoes/documentos-tecnicos/cnpj)

## Running Locally

```bash
git clone https://github.com/carloshenriquecarvalho/alphanumeric-cnpj-generator-and-validator.git

cd alphanumeric-cnpj-generator-and-validator

./mvnw spring-boot:run
```

Then open:

```
http://localhost:8080
```

## License

This project is intended for educational purposes.
