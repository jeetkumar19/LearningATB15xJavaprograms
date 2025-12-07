public class BillSplitter {
   public static void main(String[] args) {

       double total_bill=1234.53;
       int total_friends= 6;

       double payPerPerson=total_bill/total_friends;
       System.out.println("------------------------");
       System.out.println("------BILL SPLIT--------");
       System.out.println("------------------------");
       System.out.println("Total_bill=" + total_bill);
       System.out.println("Total_friends=" + total_friends);
       System.out.println("-----------------------------");
       System.out.println("PayPerPerson=" +payPerPerson);
       System.out.println("-------------------------------");




    }
}
