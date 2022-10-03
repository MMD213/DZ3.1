import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedImage result = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = result.createGraphics();
        Circle circle1 = new Circle();
        circle1.get(400, 400, 400, 400);
        Circle circle2 = new Circle();
        circle2.get(300, 300, 300, 300);
        Rectangle rectangle = new Rectangle();
        rectangle.get(100, 100, 100, 100);
        Shape[] q = {circle1,circle2, rectangle};
        for (int i = 0; i < q.length; i++) {
            q[i].draw(graphics, q[i].x, q[i].y, q[i].a, q[i].b);
        }
        File resultfile = new File("result.png");
        try {
            ImageIO.write(result, "png", resultfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(circle1.equals(circle2));
    }
}