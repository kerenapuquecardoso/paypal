package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Instalment {
    private LocalDate dueDate;
    private double amount;
    private static DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Instalment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  dueDate.format(formater) + " - " + String.format("%.2f", amount);
    }
}
