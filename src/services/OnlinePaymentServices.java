package services;

public interface OnlinePaymentServices {
    double paymentFree(double amount);
    double interest(double amount, int months);
}
