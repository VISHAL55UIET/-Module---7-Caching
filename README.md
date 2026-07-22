# 🚀 Spring Boot Redis Caching Application

A production-ready Spring Boot application demonstrating how to optimize database performance using **Redis Cache**. This project implements efficient caching strategies to reduce database load, improve API response times, and handle high-traffic scenarios.

---

## 📌 Overview

In traditional applications, every API request hits the database, increasing response time and server load. This project solves that problem by integrating **Redis** with **Spring Cache**.

When a client requests employee data:

- ✅ First request fetches data from the database and stores it in Redis.
- ✅ Subsequent requests are served directly from Redis.
- ✅ Database load is significantly reduced.
- ✅ Response time improves drastically.

The cache is automatically updated or evicted whenever employee data changes, ensuring data consistency.

---

# ✨ Features

- Spring Boot 3
- Spring Data JPA
- Redis Integration
- Spring Cache Abstraction
- CRUD APIs
- Automatic Cache Eviction
- Automatic Cache Update
- Global Exception Handling
- DTO Pattern
- Layered Architecture
- RESTful APIs
- MySQL Database
- Production-ready Configuration

---

# 🏗️ Project Architecture

```
Controller
      │
      ▼
Service Layer
      │
      ▼
Cache (Redis)
      │
      ▼
Database (MySQL)
```

Request Flow

```
Client
   │
   ▼
GET /employees/1
   │
   ▼
Check Redis Cache
   │
 ┌─Yes───────────────┐
 │                   │
 ▼                   ▼
Return Cached Data   No
                     │
                     ▼
              Query Database
                     │
                     ▼
              Store in Redis
                     │
                     ▼
              Return Response
```

---

# 📦 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Cache
- Redis
- MySQL
- Maven

---

# 📂 Project Structure

```
src
 ├── controller
 ├── service
 ├── serviceImpl
 ├── repository
 ├── entity
 ├── dto
 ├── config
 ├── exception
 └── advice
```

---

# ⚡ Redis Caching Strategy

## Read Operation

```
GET Employee

Cache Hit
↓
Return Data

Cache Miss
↓
Fetch From Database
↓
Store In Redis
↓
Return Response
```

---

## Update Operation

```
Update Employee
        │
        ▼
Update Database
        │
        ▼
Update Redis Cache
```

---

## Delete Operation

```
Delete Employee
        │
        ▼
Delete From Database
        │
        ▼
Evict Cache
```

---

# 🚀 Performance Improvement

Without Redis

```
Client
 ↓
Database
 ↓
Response

Average Response Time
≈ 250-400 ms
```

With Redis

```
Client
 ↓
Redis
 ↓
Response

Average Response Time
≈ 5-20 ms
```

---

# 🔥 Cache Annotations Used

### Cache Data

```java
@Cacheable
```

Stores database result into Redis.

---

### Update Cache

```java
@CachePut
```

Updates cache after modifying data.

---

### Remove Cache

```java
@CacheEvict
```

Removes stale cache after deleting data.

---

# 📡 REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /employees | Get All Employees |
| GET | /employees/{id} | Get Employee By Id |
| POST | /employees | Create Employee |
| PUT | /employees/{id} | Update Employee |
| DELETE | /employees/{id} | Delete Employee |

---

# 🛠️ Configuration

application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db

spring.redis.host=localhost
spring.redis.port=6379
```

---

# ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/VISHAL55UIET/-Module---7-Caching.git
```

Go to project

```bash
cd CachingAppApplication
```

Run Redis Server

```
redis-server
```

Run MySQL

```
Start MySQL Service
```

Run Application

```bash
mvn spring-boot:run
```

---

# 📈 Database Problem Solved

Traditional applications face several issues:

- Every request queries the database
- Increased latency
- Higher database CPU usage
- Poor scalability
- Slow response during peak traffic

This project addresses these problems by introducing Redis as an in-memory caching layer.

Benefits include:

- ⚡ Faster API response times
- 📉 Reduced database queries
- 🚀 Improved scalability
- 💾 Lower database load
- 🔄 Automatic cache synchronization

---

# 📸 Future Improvements

- Redis Cluster
- Distributed Cache
- Docker Deployment
- Monitoring using Prometheus & Grafana
- Cache TTL Configuration
- Spring Security + JWT
- Rate Limiting
- CI/CD Pipeline

---

# 👨‍💻 Author

**Vishal Singh**

- GitHub: https://github.com/VISHAL55UIET
- LinkedIn: https://www.linkedin.com/in/vishal-singh-5b052828a/

---

## ⭐ If you found this project useful, don't forget to star the repository!
