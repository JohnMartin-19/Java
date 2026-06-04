//USING THIS TO LEARN ABOUT THE OPEN/CLOSED PRINCIPLE
//A class should be open for extension but closed for modification.
// This means you should be able to add new functionality without changing existing, tested code

public class Main{

    // Abstract contract — closed for modification
    public interface PaymentMethod {
        void process(double amount);
        String getMethodName();
    }

    // Each payment type is a separate extension — open for extension
    public class MpesaPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing M-Pesa STK Push for KES " + amount);
        }

        @Override
        public String getMethodName() { return "M-Pesa"; }
    }

    public class StripePayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Stripe card charge for KES " + amount);
        }

        @Override
        public String getMethodName() { return "Stripe"; }
    }

    public class PaypalPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing PayPal transfer for KES " + amount);
        }

        @Override
        public String getMethodName() { return "PayPal"; }
    }

    // PaymentProcessor never changes — just receives whatever PaymentMethod you give it
    public class PaymentProcessor {
        public void processPayment(PaymentMethod method, double amount) {
            System.out.println("Initiating " + method.getMethodName() + " payment...");
            method.process(amount);
            System.out.println("Payment complete.");
        }
    }

    // Adding JamboPay later = NEW class only, nothing existing touched
    public class JamboPayPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing JamboPay wallet transfer for KES " + amount);
        }

        @Override
        public String getMethodName() { return "JamboPay"; }
    }

    PaymentProcessor processor = new PaymentProcessor();
    processor.processPayment(new MpesaPayment(), 500.00);
    processor.processPayment(new StripePayment(), 1200.00);
    processor.processPayment(new JamboPayPayment(), 750.00); // new — nothing old changed
    public static void main(String[]args ){

    }
}