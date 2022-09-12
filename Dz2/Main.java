import java.awt.Shape;

public class Main  {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,7,2,7);
        Circle circle = new Circle(2,7);
       Shape[] myArray = {(Shape) circle, (Shape) rectangle};
    }
}

