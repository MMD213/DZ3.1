public class Circle extends Shape{
    float x;
    float y;
    private double r = 0;
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle)) return false;

        Circle p = (Circle) obj;
        return this.colour.equals(p.colour);
    }

    public Circle(float x, float y) {
        super(x, y);
    }

    public void Circle(double r)
    {
        this.r=r;
    }
    public double getArea(){
        double Area=0;
        Area = r*r*Math.PI;
        return Area;
    }
    public double getPerimeter(){
        double Perimeter=0;
        Perimeter = 2*r*Math.PI;
        return  Perimeter;
    }
    public void printclassname() {
        System.out.println("Класс Круг: площадь:"+getArea());
    }

    @Override
    public String draw() {
        return null;
    }
}
