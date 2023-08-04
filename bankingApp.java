package newBankApp;
import java.util.Scanner;
public class bankingApp {
    public static void main(String[] a){
        System.out.println("Welcome to Gradious Bank Portal");
        System.out.println("");
        login Login = new login();
        Login.fetchDetail();
        System.out.println("LOGOUT SUCCESSFULLY ....");
    }
}
