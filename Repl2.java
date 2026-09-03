import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Repl2
{
	public static void main(String[] args) {
	    /*Start of while loop */
		int i =0;
		while(i==0){
		  Scanner sc=new Scanner(System.in);
		  /*option menu*/
		  System.out.println("1.Add");
		  System.out.println("2.Subtract");
		  System.out.println("3.Multiply");
		  System.out.println("4.Divide");
		  System.out.println("5.Random");
		  System.out.println("6.Reverse");
		  System.out.println("7.Quit");
		  int r = sc.nextInt();
		  
		 /*Logic*/
		 if(r==1){
		
		 System.out.println("Enter First number: ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second number: ");
		 int n2 = sc.nextInt();
		 System.out.println("Result: " + (n1+n2));
		     
		 }
		 else if(r==2){
		    System.out.println("Enter First number: ");
		     int n1 = sc.nextInt();
		     System.out.println("Enter Second number: ");
		     int n2 = sc.nextInt();
		     System.out.println("Result: " +(n1-n2));
		     
		 }
		 else if(r==3){
		     System.out.println("Enter First number: ");
		     int n1 = sc.nextInt();
		     System.out.println("Enter Second number: ");
		     int n2 = sc.nextInt();
		     System.out.println("Result: " +(n1*n2));
		 }
		  else if(r==4){
		     System.out.println("Enter First number: ");
		     int n1 = sc.nextInt();
		     System.out.println("Enter Second number: ");
		     int n2 = sc.nextInt();
		     System.out.println("Result: " +(n1/n2));
		 }
		 else if(r==5){
		     System.out.println("Enter Minimum: ");
		     int n1 = sc.nextInt();
		     System.out.println("Maximum: ");
		     int n2 = sc.nextInt();
		     RandomGenerator ran=RandomGenerator.getDefault();
		     int result=ran.nextInt(n1,n2);
		     
		     System.out.println("Result: " + result);
		 }
		 
		 
		 else if(r==6){
		     System.out.println("Enter Text: ");
		     
		     String t = sc.nextLine();
		     String s1 = sc.nextLine();
		    
		     
		     String w=(" ");
		     
		     for(int g=s1.length()-1;g>=0;g--){
		        
		        char temp=s1.charAt(g);
		        
		         w=w+temp;
		         
		     }
		     System.out.println(w);
		     
		 }
		 else if(r==7){
		     System.out.println("Goodbye ");
		    i=1;
		     
		 }
		 /*end of while loop*/
		}
	}
}
