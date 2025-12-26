package ex_05_type_casting;

public class Lab0044_type_casting_use {
    static void main() {
        int item=3000;
        float f=4597.45f;
        System.out.println(item+f); // this gives actual output
     //   int total=item  + f;  narrowing implicitly.

       // System.out.println(total);

        int total=item+(int)f;
        System.out.println(total); // this gives the output in whole no not in float,
        // we lossing our value actual value is 7597.45 and the value we get is 7597.
        // so avoid this we have to use bigger basket.
        float total1=item+f;
        System.out.println(total1); // this gives the actual value we want.
    }
}
