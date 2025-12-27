package ex_06_ternary_operators;

public class Lab0053_max_of_three_number {
    static void main() {
        int a=12;
        int b=34;
        int c=-32;
        String result= a>b?(a>c? "a is bigger":"c is bigger"):"b is bigger";
        System.out.println(result);
    }
}
