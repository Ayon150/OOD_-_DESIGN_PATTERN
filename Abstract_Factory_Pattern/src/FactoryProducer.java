public class FactoryProducer {
    public static AbstractFactory getFactory(boolean Rounded){
        if(Rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
