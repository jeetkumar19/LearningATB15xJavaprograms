import java.util.Scanner;

        public class SimpleInterest {
            public static void main(String[] args) {

                // 1. Setup Input
                Scanner scanner = new Scanner(System.in);

                System.out.println("--- Simple Interest Calculator ---");

                // 2. Input: Ask for Principal (P)
                System.out.print("Enter Principal Amount (Rs): ");
                double principal = scanner.nextDouble(); // We use double for money

                // 3. Input: Ask for Rate (R)
                System.out.print("Enter Rate of Interest (%): ");
                double rate = scanner.nextDouble();

                // 4. Input: Ask for Time (T)
                System.out.print("Enter Time (Years): ");
                double time = scanner.nextDouble();

                // 5. The Logic: Calculate Interest
                // Formula: (P * R * T) / 100
                double interest = (principal * rate * time) / 100;

                // 6. Output: Show the result
                System.out.println("---------------------------");
                System.out.println("Principal: " + principal);
                System.out.println("Interest Earned: " + interest);
                System.out.println("Total Value: " + (principal + interest));

                scanner.close();
            }
        }


