import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void viewExpenses() {
        if(expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for(Expense expense : expenses) {
            System.out.println(expense);
        }
    }
}
