import java.awt.*;
import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public int a;
    public int b;
    String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && a == shape.a && b == shape.b && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, a, b, color);
    }

    abstract void draw(Graphics graphics, int x, int y, int a, int b);
}