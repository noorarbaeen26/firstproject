public class Main {

    public static void main(String[] args) {

        ExpenseManager manager = new ExpenseManager();

        manager.addExpense(
            new Expense(
                250,
                "Food",
                "Burger"
            )
        );

        manager.addExpense(
            new Expense(
                100,
                "Travel",
                "Bus Ticket"
            )
        );

        manager.viewExpenses();
    }
}
