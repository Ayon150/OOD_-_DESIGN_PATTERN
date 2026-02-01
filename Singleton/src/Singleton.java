public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){};

    public static Singleton getSingleton(){
        return singleton;
    }

    public void draw(){
        System.out.println("Show Ayon");
    }
}
