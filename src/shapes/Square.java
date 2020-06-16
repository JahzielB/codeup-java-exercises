package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return super.getLength() * super.getLength();
//        return length * width;
    }

    @Override
    public int getPerimeter() {
        return 4 * super.getLength();
//        return 4 * length;
    }
}