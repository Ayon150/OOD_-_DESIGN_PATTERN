public class Cashier extends AuthorizationHandler{
    @java.lang.Override
    public void authorize(double amount) {
        if (amount<10000){
            System.out.println("Cashier done it."+amount);
        }else if(amount<100000){
            System.out.println("Cashier authorized it. It is forworded to Senior officer"+amount);
            nextHandler.authorize(amount);
        }else{
            System.out.println("Forworded to senior officer");
            nextHandler.authorize(amount);
        }
    }
}
