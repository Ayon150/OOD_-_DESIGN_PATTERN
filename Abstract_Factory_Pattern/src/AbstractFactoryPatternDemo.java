public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory2.getShape("Rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("Square");
        shape4.draw();
    }
}
