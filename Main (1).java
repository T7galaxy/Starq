
public class Main
{
	public static void main(String[] args) {
	    
	    /*Challenge 1 */
	    System.out.println("Challenge 1");
		System.out.println("Hello World");
		System.out.println("");
		
		
		/*Challenge 2 */
		System.out.println("Challeng 2");
		 int age =23;
		 double height = 5.6;
		 String name ="Tanis";
		 
		 System.out.printf("Name: %s, Age: %d , Height: %.1f%n",name,age,height);
		 System.out.println("");
		 
	    /*Challenge 3 */
	    System.out.println("Challenge 3");
	    int a =20;
	    int b=10;
	    boolean ag=false;
	    boolean bg=false;
	    if(a>b){
	        ag=true;
	    }
	    if(b>0){
	        bg=true;
	    }
	    
	    System.out.println("Addition:" + (a+b));
	    System.out.println("Subtraction:" + (a-b));
	    System.out.println("Multiplication: "+ (a*b));
	    System.out.println("Division: " + (a/b));
	    System.out.println("Is a greater than b?:" +(ag) );
	    System.out.println("Is a>b and is b>0?:" + (ag&&bg));
	    System.out.println("");
	    
	    /*Challenge 4 */
	    System.out.println("Challenge 4");
	    int a2 =75;
	   String string="B";
	    
	    if(a2<50){
	        System.out.println("Failed");
	        System.out.println("F");
	    }
	    else if (a2<60){
	        System.out.println("Passed");
	        System.out.println("D");
	    }
	    else if (a2<75){
	        System.out.println("Passed");
	        System.out.println("C");
	    }
	    else if (a2<90){
	        System.out.println("Passed");
	        System.out.println("B");
	    }
	    else{
	        System.out.println("Passed");
	        System.out.println("A");
	    }
	    
	   System.out.println("");
	   
	   /* Challenge 5*/
	   
	   System.out.println("Challenge 5");
	     /* for loop */
	    for(int i=0;i<5;i++){
	        System.out.printf("%d ",i+1);
	    }
	    System.out.println("");
	   
	   
	    /*while loop */
	   int i=0;
	   while( i<5){
	       
	     System.out.printf("%d ",i+1) ;
	     i++;  
	   }
	   
	   System.out.println("");
	   
	   /*do while loop */
	   int d=0;
	   do{
	       System.out.printf("%d ",d+1);
	       d++;
	   }
	   while(d<5);
	   
	   System.out.println("");
	   System.out.println("");
	   
	   /*challenge 6*/
	   System.out.println("Challenge 6");
	   double num1=7;
	   double num2=3;
	   char op='+';
	   
	   double res=0;
	   String again="y";
	   while(again=="y"){
	       if(op =='+'){
	         res=num1+num2;
	       }
	       else if(op =='-'){
	       res=num1-num2;
	       }
	       else if(op == '*'){
	       res=num1*num2;
	       }
	       else if( num2==0){
	           System.out.println("Cannot Divide By Zero");
	       }
	       else{   
	           res=num1/num2;
	       }
	       System.out.println("Result:" + res);
	       System.out.println("Thank you for using the calculator");
	       again="n";
	   }
	   
	    
	}
}
