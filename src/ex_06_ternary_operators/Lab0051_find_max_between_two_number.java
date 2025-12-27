package ex_06_ternary_operators;

public class Lab0051_find_max_between_two_number {
    static void main() {
        int x=10;
        int y=20;
        int max=x>y ? x : y ;
        int min=x>y ? y : x ;
        System.out.println(max);
        System.out.println(min );
    }
}
