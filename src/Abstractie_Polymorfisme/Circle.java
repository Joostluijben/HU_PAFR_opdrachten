package Abstractie_Polymorfisme;

public class Circle extends Shape{
    private int middle;
    public Circle(int i, int i1, int i2) {
        super(i, i1);
        setMiddle(i2);
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public int getMiddle() {
        return this.middle;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle at:(" + getX() + ", " + getY() +
                "middle) " + getMiddle());
    }
}
