package ex_05_type_casting;

public class Lab0042_type_casting {
    static void main() {
        byte b=10;
        int a=b; // valid syntax widening implicit-automatically done
        int a1=(int)b; // widening explicitly-

        int value=300;
       // byte b=value; // narrowing implicite
        byte b1=(byte)value; // narrowing explicitly
        System.out.println(b1);

    }
}
