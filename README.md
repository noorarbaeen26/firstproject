# Expense Tracker

A simple Java application to track and manage expenses.

## Project Structure

```
ExpenseTracker/
├── src/
│   ├── Expense.java
│   ├── ExpenseManager.java
│   └── Main.java
├── database/
│   └── schema.sql
└── README.md
```

## How to Run

### Prerequisites
- Java Development Kit (JDK 8+) installed on your computer

### Quick Start

1. **Clone the repository:**
   ```bash
   git clone https://github.com/noorarbaeen26/firstproject.git
   cd firstproject
   ```

2. **Compile the Java files:**
   ```bash
   javac src/*.java
   ```

3. **Run the program:**
   ```bash
   java -cp src Main
   ```

### Expected Output
```
Amount: ₹250, Category: Food, Description: Burger
Amount: ₹100, Category: Travel, Description: Bus Ticket
```

## Features
- ✅ Add expenses with amount, category, and description
- ✅ View all recorded expenses
- ✅ Database schema for future integration

## Future Enhancements
- Database connectivity (MySQL/PostgreSQL)
- User authentication (Login/Registration)
- Dashboard for expense analytics
- Category-wise expense filtering
