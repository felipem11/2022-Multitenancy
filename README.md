# 2021-Multitenancy

This application shows the implementation of a multi-tenancy system using the independent database model per client.

## Tech Stack
- **Language**: Java 11
- **Framework**: Spring Boot 2.5.3
  -Spring Web
  -Spring Data JPA
- **Persistence**: Hibernate 5.4.32
- **Migration**: Flyway 7.7.3
- **Database**: H2 Embedded 1.4.200
- **Utilities**:
  -Lombok 1.18.20

## Presentation
- [Multitenancy.pdf](pdf/Multitenancy.pdf)

## Execution in development
Run the springboot project
```bash
./mvnw spring-boot:run
```
In another terminal, enter the frontend folder and run the library installation
```bash
cd frontend
npm install
```
After the libraries are installed, start the development server for the application in vue
```bash
npm run serve
```
Open the browser with the address [`http://localhost:8081`](http://localhost:8081)


## test preparation
Go into the `frontend` folder
```bash
cd frontend
```

Run:
```bash
npm run build
```
This generates the `src/main/resources/static` folder

Go back to parent folder
```bash
cd ..
```

Run the springboot project
```bash
./mvnw spring-boot:run
```
Open the browser with the address [`http://localhost:8080`](http://localhost:8080)