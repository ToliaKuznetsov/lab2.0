public class Control {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (!a || !b && c){
            System.out.println("hello");
        }
        if (a && b && !c){
            System.out.println("world");
        }
    }
}

