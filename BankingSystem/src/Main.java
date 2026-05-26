//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        BankingService bank = new BankingService();
        bank.createAccount("ACC123", 4321, 500.00);
        System.out.println(" Account ACC123 created with Ksh500.00");

        try{
            System.out.println("Attempting withdrawal..........");
            bank.withdraw("ACC123", 4321, 100.00);
            System.out.println("Successful withdrawal of Ksh" +100+ ".Current account balance is " + bank.getBalance("ACC123", 4321));
        } catch(InsufficientBalanceException e){
            System.err.println("Error. InsufficientFunds" + e.getMessage());
        } catch(InvalidAccountException | InvalidPinException e){
            System.err.println("System authentication failed");
        }

        //insufficient balance
        try{
            bank.withdraw("ACC123", 4321,1200.00 );
        } catch (InsufficientBalanceException e){
            System.err.println("Withdrawal error" +e.getMessage());
        }catch (InvalidAccountException | InvalidPinException e){
            System.out.println("System error" + e.getMessage());
        }
    }


}