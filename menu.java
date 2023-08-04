package newBankApp;
import java.util.Scanner;
public class menu {
     void initialize(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Please Select a Option From Dropdown");
         System.out.println("1: Account Details        2: Balance Enquiry");
         System.out.println("3: Change Credentials     4: Withdraw  Cash");
         System.out.println("5: Deposit cash");
         int k=sc.nextInt();
         balance b=new balance();
         accountDetail f=new accountDetail();
         switch (k){
             case 1:
                    f.printdetail();
                 System.out.println("*********************************************\n");
                    break;
             case 2:
                 System.out.println( "Available Balance is : "+b.Balance);
                 System.out.println("*********************************************\n");
                 break;
             case 3:
                 System.out.println("1: Change Name     2: Change Email   3: Change Password");
                 int y=sc.nextInt();
                 if(y==1){

                     System.out.println("Enter the Name");
                     f.name=sc.next();
                 }
                 else if(y==2){
                     System.out.println("Enter new Email");

                     String s=sc.next();
                     f.email=s;
                 }
                 else{
                     System.out.println("Enter new password");
                     f.password= sc.nextInt();
                 }
                 System.out.println("\n");
                 f.printdetail();
                 System.out.println("*********************************************\n");
                 break;
             case 4:
                 System.out.println("Enter the Amount : ");
                 int m= sc.nextInt();
                 boolean e=b.withdrawMoney(m);
                 while(!e){
                     System.out.println("Please Enter A Lower Amount");
                     m= sc.nextInt();
                     e=b.withdrawMoney(m);
                 }
                 System.out.println("Withdrawal Successful....");
                 System.out.println("Updated Balance : "+b.Balance);
                 System.out.println("*********************************************\n");
                 break;
             case 5:
                 System.out.println("Enter the Amount");
                 int d=sc.nextInt();
                 b.depositMoney(d);
                 System.out.println("Updated Balance : "+b.Balance);
                 System.out.println("*********************************************\n");
                 break;
             default:
                 System.out.println("Enter Valid Option");
                 break;
         }
         System.out.println("FOR MAIN MENU PRESS M\nFOR LOGOUT PRESS ANY KEY");
         String str=sc.next();
         while (str.equals("M")){
             System.out.println("Please Select a Option From Dropdown");
             System.out.println("1: Account Details        2: Balance Enquiry");
             System.out.println("3: Change Credentials     4: Withdraw  Cash");
             System.out.println("5: Deposit cash");
             k=sc.nextInt();
             switch (k){
                 case 1:
                     f.printdetail();
                     System.out.println("*********************************************\n");
                     break;
                 case 2:
                     System.out.println( "Available Balance is : "+b.Balance);
                     System.out.println("*********************************************\n");
                     break;
                 case 3:
                     System.out.println("1: Change Name     2: Change Email   3: Change Password");
                     int y=sc.nextInt();
                     if(y==1){

                         System.out.println("Enter the Name");
                         f.name=sc.next();
                     }
                     else if(y==2){
                         System.out.println("Enter new Email");

                         String s=sc.next();
                         f.email=s;
                     }
                     else{
                         System.out.println("Enter new password");
                         f.password= sc.nextInt();
                     }
                     System.out.println("\n");
                     f.printdetail();
                     System.out.println("*********************************************\n");
                     break;
                 case 4:
                     System.out.println("Enter the Amount : ");
                     int m= sc.nextInt();
                     boolean e=b.withdrawMoney(m);
                     while(!e){
                         System.out.println("Please Enter A Lower Amount");
                         m= sc.nextInt();
                         e=b.withdrawMoney(m);
                     }
                     System.out.println("Withdrawal Successful....");
                     System.out.println("Updated Balance : "+b.Balance);
                     System.out.println("*********************************************\n");
                     break;
                 case 5:
                     System.out.println("Enter the Amount : ");
                     int d=sc.nextInt();
                     b.depositMoney(d);
                     System.out.println("Updated Balance : "+b.Balance);
                     System.out.println("*********************************************\n");
                     break;
                 default:
                     System.out.println("Enter Valid Option");
                     break;
             }
             System.out.println("FOR MAIN MENU PRESS M\nFOR LOGOUT PRESS ANY KEY");
             str=sc.next();
         }
     }

}
