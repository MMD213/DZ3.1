public class Rectangle extends Shape{
    private float width;
    private float height;
    public boolean equals(Object obj) {

        if (!(obj instanceof Rectangle)) return false;

        Rectangle p = (Rectangle) obj;
        return this.colour.equals(p.colour);
    }
    Rectangle(float x, float y, float width, float height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }

    @Override
    public String draw() {
        return null;
    }
}

