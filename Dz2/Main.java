

public class Main  {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle1=new Circle("black",8,9,40);
        Rectangle rectangle=new Rectangle("blue",6,7,8,9);
        Circle circle2=new Circle("black",8,9,40);
        shapes[0] =circle1;
        shapes[1] = rectangle;
        shapes[2] =circle2;
        for(Shape shape: shapes){
            shape.draw();
        }
        System.out.println(circle1.equals(circle2));
    }
}

