public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        super();
    }

    public void show() {
        System.out.printf("Ширина %f, Высота %f", width, height);
    }

    public double calculateArea() {
        return getHeight() * getWidth();
    }

    public double calculatePerimetr() {
        return (2 * (getHeight() + getWidth()));
    }
}
