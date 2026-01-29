public class FactoryPattern {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getshape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getshape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getshape("Square");
        shape3.draw();
    }
}
