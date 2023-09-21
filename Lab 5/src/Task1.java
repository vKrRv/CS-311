public class Task1 {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(40.0, 4.0);
        Rectangle rec2 = new Rectangle(35.9, 3.5);
        System.out.println("1st rectangle area = " + rec1.getArea() +
                             "\n\tand perimeter = " + rec1.getPerimeter() +
                            "\n2nd rectangle area = " + rec2.getArea() +
                            "\n\tand perimeter = " + rec2.getPerimeter());
    }
}
