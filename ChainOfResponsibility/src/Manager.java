public class Manager extends AuthorizationHandler{
    @Override
    public void authorize(double amount) {
        System.out.println("Authorized by manager."+amount);
    }
}
