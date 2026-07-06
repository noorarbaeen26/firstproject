# firstproject / ExpenseTracker

A tiny beginner Java CLI example showing an Expense and an ExpenseManager with an in-memory list. Includes a sample SQL schema for a users/expenses table.

How to run locally
1. Ensure you have a JDK installed (Java 8+). Verify with:
   ```
   java -version
   javac -version
   ```

2. From the project root, compile:
   ```
   javac ExpenseTracker/src/main/java/*.java
   ```

3. Run:
   ```
   java -cp ExpenseTracker/src/main/java Main
   ```

Expected output:
```
Amount: 250.0, Category: Food, Description: Burger
Amount: 100.0, Category: Travel, Description: Bus Ticket
```

Optional: Use a simple Gradle or Maven project layout if you want a build tool. The SQL schema is in database/schema.sql if you later add JDBC persistence.
