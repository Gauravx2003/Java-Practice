package Interfaces._02_Interface_UseCase;

public class RazorpayPayment implements PaymentService
{
    @Override
    public void pay(double amount) {
        System.out.println("Razorpay Payment - " + amount);

        //TODO: Logic for razorpay payment
    }
}
