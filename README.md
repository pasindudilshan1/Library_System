# 📚 Library_System

A JavaFX-based library management application to manage books, members, and issue records.

## 🔧 Features

- Add books
- Register and manage members
- Issue and return books with status tracking
-Updating soon...

## 🛠️ Prerequisites

- Java 17 or higher
- JavaFX SDK (or Maven-managed)
- MySQL (or MariaDB) server
- Maven 3.x

## 🚀 Setup & Run

1. **Clone repository**
   ```bash
   git clone https://github.com/pasindudilshan1/Library_System.git
   cd Library_System
   ```

2. **Configure database**
   - Create the database and tables using the SQL script below (or run `sql/library_schema.sql`).
   - Update JDBC connection settings in your code (`DBConnection.java`).

3. **Build & Run**
   ```bash
   mvn clean javafx:run
   ```

---

## 🗃️ Database Schema

Run the following SQL in your MySQL client (e.g., phpMyAdmin, MySQL Workbench, or CLI) to create the database and tables.

```sql
-- Create database
CREATE DATABASE IF NOT EXISTS library_db;
USE library_db;

-- Books table
CREATE TABLE IF NOT EXISTS book (
  book_id VARCHAR(10) PRIMARY KEY,
  title   VARCHAR(30),
  author  VARCHAR(30),
  genre   VARCHAR(30),
  copies  INT(12)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Members table
CREATE TABLE IF NOT EXISTS member (
  member_id VARCHAR(12) PRIMARY KEY,
  f_name    VARCHAR(20),
  l_name    VARCHAR(20),
  email     VARCHAR(30),
  phone     VARCHAR(10),
  address   VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Issue records table
CREATE TABLE IF NOT EXISTS issuerecord (
  issue_id    VARCHAR(10) PRIMARY KEY,
  book_id     VARCHAR(10),
  member_id   VARCHAR(12),
  issue_Date  DATE,
  return_Date DATE,
  status      VARCHAR(20),
  FOREIGN KEY (book_id)   REFERENCES book(book_id)   ON DELETE CASCADE,
  FOREIGN KEY (member_id) REFERENCES member(member_id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

Place this script in `sql/library_schema.sql` for version control.

---

## 📝 Configuration

Edit the database connection in `src/main/java/.../DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/library_db";
String user = "<your-db-username>";
String pass = "<your-db-password>";
```

---

## 🤝 Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md) and [Code of Conduct.md](Code of Conduct.md).

---

## 📄 License

MIT © pasindudilshan1

