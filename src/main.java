import java.util.*;
/* #1
public class main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum += array[x];
        }
        System.out.print(sum);
    }
}

public class main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(1,2,3,4);
        System.out.println(sumElem());

#2
public class main {
    public static void main(String[] args) {
        int array[] = {36, 2, 3, 4, 5};

        int[] arr2 = new int[array.length];
        int square = array[array.length - 1]*array[array.length - 1];
        for (int x = 0; x<array.length; x++){
            System.out.println(array[x]);
            if (square < array[x]){
                arr2[x] = array[x];
                System.out.print("норм");


            }
        }
        System.out.println(array[array.length - 1]);

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}

public class main {
    public static void main(String[] args) {
        String stroka = ""
        int length = word.length();
        // Двигаемся с обоих концов слова к серидине
        for (int i = 0; i < (length / 2); i++) {
            // Сравниваем символы попарно
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }







public class main {
    public static void main(String[] args) {
        String stroka = "аоа";
        System.out.println(stroka);
        // Двигаемся с обоих концов слова к серидине
        for (int i = 0; i < (stroka.length / 2); i++) {
            // Сравниваем символы попарно
            if (stroka.charAt(i) != stroka.charAt(length - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return;

    }
}}}


// работа в классе
public class main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        System.out.println(String.format("Сумма элементов списка: %s", sumElem(input)));
    }
    //static int result = 0;
    private static int sumElem(List<Integer> list_elems){
        if(list_elems.size() ==0){
            return 0;
        }
        return list_elems.remove(list_elems.size()-1)+sumElem(list_elems);

    }
}



//3
public class main {
    public static void main(String[] args) {
        String word = "101";
        StringBuffer word1 = new StringBuffer(word);
        word1.reverse();
        String data =word1.toString();
        if (word.equals(data)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Нет");
        }
    }
}


public class main {
    public static void main(String[] args) {
        int array[] = {36, 2, 3, 4, 5};

        int[] arr2 = new int[array.length];
        int square = array[array.length - 1] * array[array.length - 1];
        for (int x = 0; x < array.length; x++) {

            if (square < array[x]) {
                arr2[x] = array[x];


            }
        }
        System.out.println(array[array.length - 1]);

        for (int x = 0; x < arr2.length; x++) {
            if (arr2[x]!=0){
            System.out.println(arr2[x]);
        }}
    }
}


//3
public class main {
    public static void main(String[] args) {
        String word = "Шалаш".toLowerCase();
        StringBuffer word_new = new StringBuffer(word);
        word_new.reverse();
        String i =word_new.toString();
        if (word.equals(i)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Нет");
        }
    }
}








public class main{
    public static void main(String[] args) {
        int array[] = {36, 2, 3, 4, 1};

        int[] arr2 = new int[array.length];
        int square = array[array.length - 1] * array[array.length - 1];
        for (int x = 0; x < array.length; x++) {

            if (square < array[x]) {
                arr2[x] = array[x];


            }
        }

        for (int x = 0; x < arr2.length; x++) {
            if (arr2[x]!=0){
                System.out.println(arr2[x]);
            }}
    }
}



public class main{
    private int width;
    private int height;
    private int radius;
    public main(main ob){
        width = ob.width;
        height = ob.height;
        radius = ob.radius;
    }

    public main(int w, int h, int r){
        width = w;
        height = h;
        radius = r;
    }
}



public class main {
    public static void main(String args[]) {
        Cat albatros = new Cat("Albatros");
        albatros.speak();
    }
}
class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " says " + this.voice);
    }
}
class Cat extends Animal {
    public Cat(String name){
        super(name, "raw");
    }
}

 */

public class main {
    public static void main(String args[]) {
    }
}

abstract class Shape {
    public abstract double area();
}

/*
class Figure {
    private int a;
    private int b;
    private int rad;

    public Figure(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("ширина: " + this.a + " длина:" + this.b);
    }

    public Figure(int rad) {
        this.rad = rad;
        System.out.println("Радиус: " + this.rad);

    }
}
 */