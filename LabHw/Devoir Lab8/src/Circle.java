public class Circle {
    int rayon;
    int x;
    int y;

    public Circle(int rayon, int x, int y) {
        this.rayon = rayon;
        this.x = x;
        this.y = y;
    }

    double getArea() {
        return 3.14 * Math.pow(rayon, 2);
    }

    double getCircumferance() {
        return 2 * 3.14 * rayon;
    }

    public static void main(String[] args) throws Exception {
        Circle myCircle = new Circle(9, 4, 4);
        System.out.println(myCircle.getArea() + " " + myCircle.getCircumferance());
    }
}

