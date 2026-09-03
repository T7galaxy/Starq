import java.util.Scanner;
public class Password
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please create password: ");
	   String s=sc.nextLine();
	   //capital counter
	   int cap=0;
	   //lowercase count
	   int low=0;
	   //number counter
	   int isn=0;
	   
	   //checks character types
	    for(int i=0;i<s.length();i++){
	    char temp=s.charAt(i);
	    if(Character.isLowerCase(temp)){
	        low++;
	    }
	    if(Character.isUpperCase(temp)){
	       cap++;
	    }
	    if(Character.isDigit(temp)){
	       isn++;
	    }
		  }
		  //checks requirements
		if(cap==0||low==0||isn==0||s.length()<8){
		    System.out.println("Password Rejected");
		    if (cap==0){
		    System.out.println("Must contain capital");
		    }
		    if (low==0){
		    System.out.println("Must contain lowercase");
		    }
		    if (isn==0){
		    System.out.println("Must contain number");
		    }
		    if (s.length()<8){
		    System.out.println("Must contain 8 characters");
		    }
		}
		else{
		    System.out.println("Password accepted");
		}
	   
	}
}
