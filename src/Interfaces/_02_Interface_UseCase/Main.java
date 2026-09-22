package Interfaces._02_Interface_UseCase;

public class Main
{
    public static void main(String[] args) {
        PaymentService paymentService_1 = new StripePayment();
        PaymentService paymentService_2 = new RazorpayPayment();


        //We can use either StripePayment or RazorpayPayment as the Orderservice depend on PaymentService interface
        //So whichever class that implements PaymentService interface is valid argument here

        OrderService orderService = new OrderService(paymentService_2);

        orderService.placeOrder(1200);
    }
}
