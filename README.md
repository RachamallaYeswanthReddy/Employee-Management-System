# Employee Management System

## Overview

This project is a simple Employee Management System developed using Spring Boot for learning purposes. It provides basic CRUD (Create, Read, Update, Delete) operations for managing employee records.

## Features Implemented

1. **Create an Employee:**
   - Endpoint: `POST /employees`
   - Description: Add a new employee to the Backend.
   - Request Body: JSON object representing the employee details.

2. **Update an Employee:**
   - Endpoint: `PUT /employees/{employeeId}`
   - Description: Update the details of an existing employee.
   - Request Body: JSON object with updated employee details.

3. **List of Employees:**
   - Endpoint: `GET /employees`
   - Description: Retrieve a list of all employees in the system.

4. **Delete Employee:**
   - Endpoint: `DELETE /employees/{employeeId}`
   - Description: Delete an employee from the system by providing the employee ID.

5. **View Employee:**
   - Endpoint: `GET /employees/{employeeId}`
   - Description: Retrieve details of a specific employee by providing the employee ID.

## Technologies Used

- **Spring Boot:** Framework for building Java-based enterprise applications.
- **Spring Data JPA:** Simplifies data access using JPA (Java Persistence API).
- **RESTful API:** Follows REST principles for communication between the client and server.
- **Maven:** Project management and build tool.
- **MYSQL Database:** In-memory database for simplicity in the learning environment.

## How to Run

1. Ensure you have Java and Maven installed on your machine.
2. Clone the repository: `git clone <https://github.com/RachamallaYeswanthReddy/Employee-Management-System>`
3. Create the Springboot App from the [SpringInitializer](https://start.spring.io/)
4. Select Project as Maven , Select the Version of Springboot as Default and In group name as com.Employee-Management-System
5. Add the Following in the Dependencies
   1. Spring Web
   2. Spring Web Services
   3. Spring Data JPA
   4. MYSQL Driver
6. Download the Project And Extract the zip file in respective folder
7. Replace the src with the cloned src folder 
8. Build the project: `mvn clean install`
9. Run the project
    
The application will be accessible at `http://localhost:8080`.

## API Documentation

API documentation is available using Swagger. After running the application, access Swagger UI at: `http://localhost:8080/swagger-ui.html`

## Sample Requests

### Create Employee
  Use the PostMan to Add the Employee 
  Create Blank Collection and Add the Request 
  To Create the Employee Use Post call 
  ![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/2fe74b44-b8d0-4e83-8968-3c00a0d3f60b)

```bash
   {
    "firstName":"Latha ",
    "lastName":"Rachamalla",    
    "emailId":"latharachamalla@gmail.com"
}
```
![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/4c10f09b-e9b3-4cb4-90c2-66721ca3383f)

### Update Employee

```bash
    http://localhost:8080/employee/employees/3
```
```bash
  {
    "firstName":"Jai Kumar ",
    "lastName":"Rachamalla",
    "emailId":"jaikumarreddi@gmail.com"
}
```

![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/60fe472e-3f80-4a86-ba25-10257dcb4abb)

### List of Employees

```bash
    http://localhost:8080/employees
```
![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/6dc0d5ae-7a1b-4056-8f51-c86b16a68e70)

### Delete Employee

```bash
   DELETE http://localhost:8080/employees/3
```
![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/79a2b98c-09c0-4250-9808-51f189b39928)

### View Employee

```bash
curl http://localhost:8080/employees/2
```
![image](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/assets/91588050/a828da04-c686-43ac-aa2a-de270cdf6122)

## Contributing

Feel free to contribute to the project by opening issues or submitting pull requests. Your feedback and suggestions are highly appreciated.

## License

This project is licensed under the MIT License - see the [[LICENSE](https://github.com/RachamallaYeswanthReddy/Employee-Management-System/blob/main/LICENSE)] file for details.

---
