import java.awt.*;

public class Circle extends Shape{

    void get(int u, int i, int o, int p){
        super.x = u;
        super.y = i;
        super.a = o;
        super.b = p;
    }
    @Override
    void draw(Graphics graphics, int x, int y, int a, int b) {
        graphics.drawOval(x,y,a,b);
    }
}