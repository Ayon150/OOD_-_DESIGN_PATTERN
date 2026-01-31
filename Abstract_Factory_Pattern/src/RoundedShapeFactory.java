public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
