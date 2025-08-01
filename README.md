# Merchant Payment Integration API (Java + Spring Boot)

A robust RESTful API for merchant registration, customer management, and payment transactions. Designed for learning, portfolio, and professional backend Java experience.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot (Web, Data JPA)
- MySQL
- Lombok
- Swagger/OpenAPI (API Documentation)
- JUnit + Mockito (Testing)
- Docker (optional, for local MySQL)

---

## 📦 Features

- Register merchants and customers
- Secure transaction initiation
- Query transaction status by ID
- Input validation and error handling (with `@ControllerAdvice`)
- Modular architecture: model, repository, service, controller layers
- Automated, interactive API documentation (Swagger UI)
- Best practices: clean code, clear separation of concerns

---

## 🔧 Getting Started

**1. Clone the repository**

git clone https://github.com/yourusername/merchant-integration-java.git
cd merchant-integration-java


**2. Configure MySQL**

- Create the database and user:

CREATE DATABASE merchant_db;
CREATE USER 'merchant_user'@'localhost' IDENTIFIED BY 'yourpassword';
GRANT ALL PRIVILEGES ON merchant_db.* TO 'merchant_user'@'localhost';
FLUSH PRIVILEGES;


- In `src/main/resources/application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/merchant_db
spring.datasource.username=merchant_user
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


**3. Build and run the application**

mvn spring-boot:run


- The API server will be at [http://localhost:8080](http://localhost:8080)
- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 📚 API Endpoints

| Method | Endpoint                          | Description                        |
|--------|-----------------------------------|------------------------------------|
| POST   | /api/registerMerchant             | Register a merchant                |
| POST   | /api/initiatePayment              | Initiate a payment transaction     |
| GET    | /api/getTransactionStatus?id=1    | Get status/details for a transaction by ID |
| GET    | /api/merchantByEmail?email=...    | Find merchant by email             |

---

## 💡 Example HTTP Requests

**Register Merchant**

POST /api/registerMerchant
Content-Type: application/json

{
"name": "Acme Corp",
"email": "contact@acmecorp.com",
"active": true
}


**Initiate Payment**

POST /api/initiatePayment
Content-Type: application/json

{
"amount": 250.0,
"status": "INITIATED",
"merchant": { "id": 1 },
"customer": {
"id": 1,
"email": "customer@example.com",
"phoneNumber": "+1234567890",
"fullName": "Jane Doe"
}
}


**Get Transaction Status**

GET /api/getTransactionStatus?id=1


---

## 📝 Testing

- Test endpoints with:
    - Swagger UI (`/swagger-ui.html`)
    - IntelliJ HTTP client (.http files)
    - curl, Hoppscotch, or Postman

## 🧩 Project Structure (Recommended)

src/main/java/com/yourorg/merchantintegration/
├── controller/
├── service/
├── repository/
├── model/
├── exception/
└── config/


---

## 📄 License

Apache License 2.0 (see [LICENSE](LICENSE))

---

## 🔗 Resume Bullet Point Example

- Developed a layered Java Spring Boot REST API for merchant payment integration with robust input validation, centralized error handling, modular service/repository/controller architecture, and interactive Swagger/OpenAPI documentation; deployed on MySQL, version-controlled on GitHub.

---

## 👍 Quick Finalization Checklist

- [x] Repo is **public**
- [x] README is clear and formatted
- [x] .gitignore present (/target/, .idea/, etc.)
- [x] Good commit messages (`[Feature]`, `[Fix]`, `[Docs]`, etc.)
- [x] Swagger UI accessible and screenshot added
- [x] All code separated into model, repository, service, controller layers
- [x] Global exception handler present
- [x] API tested and working

---

## 📝 Sample Commit Messages

[Feature] Add merchant registration endpoint
[Fix] Prevent negative payment amounts
[Docs] Document API endpoints in README
[Test] Add unit tests for MerchantService
[Cleanup] Remove unused imports


---

<!-- END OF README.md TEMPLATE -->