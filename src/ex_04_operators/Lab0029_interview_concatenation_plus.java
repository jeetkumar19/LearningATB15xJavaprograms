package ex_04_operators;

public class Lab0029_interview_concatenation_plus {
    static void main() {
        String first_name="jeet";
        String last_name="kumar";
        int a=100;
        int b=120;

        System.out.println(first_name+last_name+a+b); // result=jeetkumar100120
        System.out.println(a+b+first_name+last_name);// result=220jeetkumar
        System.out.println(first_name+last_name+(a+b));
        System.out.println((a+b)+first_name+last_name);

    }
}
