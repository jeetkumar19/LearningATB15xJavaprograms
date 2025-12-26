package ex_05_type_casting;

public class Lab0043_type_casting {
    static void main() {
        long phone=912435464l;
        //short   s=phone narrowing-implicit

       short s =(short)phone; // narrowing explicit
        System.out.println(s);

    }
}
