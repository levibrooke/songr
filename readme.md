# Lab 13: Related Resources and Integration Testing

Add functionality to create Songs tied to an Album, save to database, show information to client.

## Running
1. Clone this repo
2. Set your application settings in `application.properties` to include:
- `spring.datasource.url=jdbc:postgresql://path/to/your/psql/database`
- `spring.datasource.username=yourPSQLUser`
- `spring.jpa.hibernate.ddl-auto=create` (On first run to create table, then disable this line)

2. Run the application:
`./gradlew bootRun`
3. Run tests (there are no integration tests yet)
`./gradlew test`

---

# Lab 12: Spring MVC with Databases

Add functionality to create Albums, save them to a database, and display saved albums to the client.

## Running
1. Clone this repo
2. Set your application settings in `application.properties` to include:
- `spring.datasource.url=jdbc:postgresql://path/to/your/psql/database`
- `spring.datasource.username=yourPSQLUser`
- `spring.jpa.hibernate.ddl-auto=create` (On first run to create table, then disable this line)

2. Run the application:
`./gradlew bootRun`
3. Run tests (there are no integration tests yet)
`./gradlew test`

---
# Lab 11: Spring for Full-Stack Web Apps

Use the Spring Initializr to create a new application with artifact songr with Web (and optionally Devtools) dependency.

We will use this setup for the next 5 labs.

## Running
1. Clone this repo 
2. Run the application:
`./gradlew bootRun`
3. Run tests
`./gradlew test`