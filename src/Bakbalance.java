public class Bakbalance {
   public static void main(String[] args) {

       String account_name="vishwajeet vishwakarma";
       double current_balance=635.34;
       double withdraw_balance=200.34;
       // Remaining_balance.............

       double remaining_balance=current_balance-withdraw_balance;
       System.out.println(remaining_balance);

       System.out.println("--------------------");
       System.out.println("HDFC BANK STATEMENT ");
       System.out.println("____________________");
       System.out.println("user:" + account_name);
       System.out.println("balance:" + current_balance);
       System.out.println("withdraw: " + withdraw_balance);
       System.out.println("-----------------------------");
       System.out.println("New_balance:" + remaining_balance);
       System.out.println("----------------------------------");


    }
}
