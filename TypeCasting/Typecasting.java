package TypeCasting;

public class Typecasting {
    public static void main(String[] args) {
        // TypeConversion

        byte b = 127;
        int a = 258;
        // now if we try to assign int a to byte b it will throw an error
        // b = a;
        a = b;
        System.out.println(a);

        // but if we try to assign byte to an int it will work
        // because int has longer range than byte This is knows as TypeConversion

        // TypeCasting

        double d = 60.4;
        int i = (int) d;
        System.out.println("i : " + i);

        // here we are assigning double (longer size) to int (shorter than double)
        // so the decimal part of the number after conversion will be lost and we'll get
        // integer value
    }
}
