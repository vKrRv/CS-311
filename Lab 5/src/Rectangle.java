public class Rectangle {
    double height;
    double width;

    Rectangle(){
        height = 1.0;
        width = 1.0;
    }
    Rectangle(double newHeight, double newWidth){
        height = newHeight;
        width = newWidth;
    }

    double getArea(){
        return height * width;
    }
    double getPerimeter(){
        return (height + width) * 2;
    }
}
