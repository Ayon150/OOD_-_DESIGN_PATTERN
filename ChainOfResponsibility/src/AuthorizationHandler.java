public abstract class AuthorizationHandler {
    protected AuthorizationHandler nextHandler;

    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void authorize(double amount);


}
