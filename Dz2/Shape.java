public abstract class Shape {

    String colour;

    public Shape(float x, float y) {
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Shape)) return false;

        Shape p = (Shape) obj;
        return this.colour.equals(p.colour);
    }
        public abstract String draw ();

}
