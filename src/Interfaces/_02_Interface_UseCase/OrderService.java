package Interfaces._02_Interface_UseCase;

public class OrderService
{

    //We are depending on an interface
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount)
    {
        System.out.println("Order Created ...");
        paymentService.pay(amount);
        System.out.println("Order Placed - " + amount);
    }
}
