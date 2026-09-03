import java.util.Scanner;
public class Parser
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Text: ");
	   String s=sc.nextLine();
	   //vowel counter
	   int vow=0;
	   //constant counter
	   int con=0;
	   //space counter
	   int spc=0;
	   //digit counter
	   int dg=0;
	    for(int i=0;i<s.length();i++){
	    char temp=s.charAt(i);
	   
	    Character h=Character.toLowerCase(temp);
	    //checks character types
	    if(Character.isDigit(temp)){
	        dg++;
	    }
	    else if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'){
	        vow++;
	    }
	    else if(h==' '){
	        spc++;
	    }
	    else{
	        con++;
	    }
	    }
	    System.out.println("Characters: " + s.length());
	    System.out.println("Vowels: " + vow);
	    System.out.println("Constants: " + con);
	    System.out.println("Digits: " + dg);
	    System.out.println("Spaces: " + spc);
	   
	}
}
