public class figure{

    public static void main(String[] args) {

        Circle Circle_1 = new Circle("Круг Михаил", 10,"Таежный чай");
        Circle_1.Info();
        Circle_1.setSize(15);
        System.out.println("____________________");
        Circle_1.Info();
        Circle_1.CountPer();
        System.out.println(Circle_1.getSqr());
        Circle_1.CountSqr();



        Rectangle Rect_1 = new Rectangle("Аркадий", 100, 8,"Красный");
        Rect_1.Info();
        System.out.println("________________");

        Rect_1.setLength(15);
        Rect_1.setWidth(2);
        Rect_1.Info();
        Rect_1.CountPer();
        Rect_1.CountSqr();
        System.out.println("________________");

        Square Square_1 = new Square("Иннокентий", 100,"Белый");
        Square_1.Info();
        Square_1.setLength(15);
        System.out.println();
        Square_1.Info();
        Square_1.CountPer();
        Square_1.CountSqr();
        //System.out.println(Square_1.getPer());
    }
}
abstract class Figures {
    private String name;

    public String getName() { return name; }

    public Figures(String name){
        this.name=name;
    }

    public abstract void Info();
}

class Circle extends Figures{

    public int radius = 1;
    public String color = "";


    public Circle(String name, int radius, String color) {

        super(name);
        this.radius = radius;
        this.color = color;
    }

    public void Info(){

        System.out.printf("Фигура: %s \nРадиус: %s \nЦвет: %s\n", super.getName(), radius, color);
    }

    public int getSize(){ return radius; }
    public void setSize(int NewRadius){ this.radius = NewRadius; }

    public double getPer(){ return 2 * 3.14 * radius; }

    public void CountPer(){

        System.out.printf("Периметр круга '%s': %s \n\n", super.getName(), 2 * 3.14 * radius);
    }

    public double getSqr(){ return 3.14 * radius * radius; }

    public void CountSqr(){

        System.out.printf("Площадь круга '%s': %s \n\n", super.getName(), 3.14 * radius * radius);
    }
}

class Rectangle extends Figures {
    public int length = 1;
    public int width = 1;
    public String color = "";

    public Rectangle(String name, int length, int width, String color) {

        super(name);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void Info() {

        System.out.printf("Фигура: %s \nДлина: %s \nШирина: %s\nЦвет: %s\n", super.getName(), length, width, color);
    }

    public int getLength(){ return length; }

    public void setLength(int NewLength) { this.length = NewLength; }

    public int getWidth(){ return width; }

    public void setWidth(int NewWidth) { this.length = NewWidth; }

    public void setColor(String NewColor){this.color = NewColor;}

    public int getPer(){ return (length + width) * 2; }

    public void CountPer() {

        System.out.printf("Периметр прямоугольника '%s': %s \n\n", super.getName(), (length + width) * 2);
    }

    public int getS(){ return length * width; }

    public void CountSqr() {

        System.out.printf("Площадь прямоугольника '%s': %s \n\n", super.getName(), length * width);
    }
}

class Square extends Figures {

    public int length = 1;
    public String color = "";

    public Square(String name, int length, String color) {

        super(name);
        this.length = length;
        this.color = color;
    }

    public void Info() {

        System.out.printf("Фигура: %s \nСторона: %s\nЦвет: %s\n", super.getName(), length, color);
    }

    public int getLength() {
        return length;
    }
    public void setLength(int NewLength) { this.length = NewLength; }
    public void CountPer(){
        System.out.printf("Периметр Квадрата '%s': %s \n\n", super.getName(), length * 2);
    }
    public void CountSqr(){
        System.out.printf("Площадь Квадрата '%s': %s \n\n", super.getName(), length * length);
    }
}
