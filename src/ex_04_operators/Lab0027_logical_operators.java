package ex_04_operators;

public class Lab0027_logical_operators {
    public static void main() {
        boolean a=true;
        System.out.println(a);
        System.out.println(!a);  // not of a means false.

        boolean b=false;
        System.out.println(!!b);

        boolean b1=true;
        System.out.println(!!b1);

        boolean c=true||false;
        System.out.println(c);

        boolean d=false && true;
        System.out.println(d);
        boolean j=true && true;
        System.out.println(j);


    }
}
