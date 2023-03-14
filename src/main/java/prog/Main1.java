package prog;

public class Main1 {

    public static void main(String... args) {
        boolean b = true;
        byte mybyte = 1;
        short sNumber = 1;
        int i = 10; // тільки цілі числа
        double d = 10.00001; // дробові числа
        float f = 10.0001F; // дробові числа
        long l = Long.MAX_VALUE; // тільки цілі числа
        char c = '\u0000'; // закодований символ, напр. @, юнікод
        // або можна записати
        String s = "@";



        System.out.println(l);

        String aString = "aaa";
        System.out.println(aString);
        aString = "ddd";
        System.out.println(aString);

    }
}
