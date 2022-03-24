public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height)*2;
    }

    public String toString(){
        return "This rectangle has Width: "+this.width+" Height: "+this.height+" Perimeter: "+this.getPerimeter()+" Area: "+this.getArea();
    }


    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.height = 30;
        rec1.width = 50;
        System.out.println(rec1.toString());

        Rectangle rec2 = new Rectangle(50,80);
        System.out.println(rec2.toString());
    }
}
