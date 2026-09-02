import java.util.Scanner;
public class Repl
{
	public static void main(String[] args) {
	    /*Start of while loop */
		int i =0;
		int balance=0;
		while(i==0){
		  Scanner sc=new Scanner(System.in);
		  /*option menu*/
		  System.out.println("1.Check Balance");
		  System.out.println("2.Deposit");
		  System.out.println("3.Withdraw");
		  System.out.println("4.Exit");
		  int r = sc.nextInt();
		  
		 /*Logic*/
		 if(r==1){
		     System.out.println("Your Balance is: "+ balance);
		 }
		 else if(r==2){
		     System.out.println("Please enter deposit amount: ");
		     int dep=sc.nextInt();
		     balance=balance+dep;
		     System.out.println("Your new balance is:"+balance);
		     
		 }
		 else if(r==3){
		     System.out.println("Please enter withdraw amount: ");
		     int wd=sc.nextInt();
		     if(wd>balance){
		         System.out.println("Witdraw amount exceeds acount balance");
		     }else{
		     balance=balance-wd;
		     System.out.println("Your new balance is:"+balance);
		     }
		 }
		 else if(r==4){
		     System.out.println("Exiting system ");
		    i=1;
		     
		 }
		 /*end of while loop*/
		}
	}
}
