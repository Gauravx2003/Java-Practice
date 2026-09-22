package Interfaces._02_Interface_UseCase;

public class StripePayment implements PaymentService{
    @Override
    public void pay(double amount) {
        System.out.println("Stripe Payment - " + amount);

        //TODO: Payment Logic for Stripe
    }
}
