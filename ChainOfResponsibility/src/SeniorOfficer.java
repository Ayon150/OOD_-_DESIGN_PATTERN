public class SeniorOfficer extends AuthorizationHandler{
    @Override
    public void authorize(double amount) {
        if (amount<100000){
            System.out.println("Authorized by senior officer.");
        }else{
            System.out.println("Authorized by senior officer."+amount+"Forworded to manager");
            nextHandler.authorize(amount);
        }
    }
}
