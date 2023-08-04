package newBankApp;
import java.util.Scanner;
public class login {
    void fetchDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter The Account Number :");
        int acNumber=sc.nextInt();
        System.out.println("Please Enter The Password :");
        int password=sc.nextInt();
        boolean e=verify(acNumber,password);
        while(!e){
            System.out.println("Given Details Are Invalid As Per the Records");
            System.out.println("Re-enter the Account Number :");
            acNumber= sc.nextInt();
            System.out.println("Re-enter the Password :");
            password=sc.nextInt();
            e=verify(acNumber,password);
        }
        System.out.println("Login Successful ..... ");
        System.out.println("");
        menu Menu=new menu();
        Menu.initialize();
    }
    boolean verify(int a,int b){
        boolean r= false;
        accountDetail j=new accountDetail();
        if(a == j.acNumber){
            r= b == j.password;
        }
        return r;
    }

}
