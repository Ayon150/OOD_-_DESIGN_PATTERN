public class ShapeFactory {
    public Shape getshape(String shapetype){
        if(shapetype==null){
            return null;
        } else if(shapetype=="Circle"){
            return new Circle();
        } else if(shapetype=="Rectangle"){
            return new Rectangle();
        }else if(shapetype=="Square"){
            return new Square();
        }
        return null;
    }
}
