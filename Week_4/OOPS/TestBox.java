class Box
{
    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setValues(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length  = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area    = " + area());
    }
}

class Box3D extends Box
{
    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);         
        this.height = height;
    }

    public void setValues(double length, double breadth, double height) {
        super.setValues(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    @Override
    public double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    public void display() {
        System.out.println("Length       = " + length);
        System.out.println("Breadth      = " + breadth);
        System.out.println("Height       = " + height);
        System.out.println("Surface Area = " + area());
        System.out.println("Volume       = " + volume());
    }
}

class TestBox
{
    public static void main(String[] args) {
        System.out.println("=== 2D Box ===");
        Box b = new Box(5, 4);
        b.display();

        System.out.println("\n--- Changing values ---");
        b.setValues(8, 3);
        b.display();

        System.out.println("\n=== 3D Box ===");
        Box3D b3 = new Box3D(5, 4, 3);
        b3.display();

        System.out.println("\n--- Changing values ---");
        b3.setValues(20, 6, 4);
        b3.display();
    }
}
