public class ChainOfResponsibiltyDemo {
    public static void main(String[] args){
        AuthorizationHandler cashier = new Cashier();
        AuthorizationHandler seniorOfficer = new SeniorOfficer();
        AuthorizationHandler manager = new Manager();

        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        cashier.authorize(1000);
        cashier.authorize(12000);
        cashier.authorize(1300000);
    }
}
