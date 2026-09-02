import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
    /*User input for scores */
	System.out.println("Please input 5 Test scores ");
    int[] arr=new int [5];
    for(int i=0;i<5;i++){
    System.out.println("Please input Score: " + (i+1));
        int Score1= sc.nextInt();
        arr[i]=Score1;
    }
    sc.close();
/*calculations for total and average */
  int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
  int average=total/5;
  
  /*calculations for highest and lowest*/
  int highest=0;
  int lowest=100;
  for(int i=0;i<5;i++){
      int cur=arr[i];
      if(cur>highest){
          highest =cur;
      }
      if(cur<lowest){
          lowest=cur;
      }
    }
  System.out.println("Total: "+total);
  System.out.println("Average:"+average);
  System.out.println("Highest:"+highest);
  System.out.println("Lowest: "+lowest);
  
  /*logic for letter grades */
  for(int i=0;i<5;i++){
      if(arr[i]<60){
          System.out.println("Your Grade for Score "+arr[i]+" is F");
      }
      else if(arr[i]<70){
          System.out.println("Your Grade for Score "+arr[i]+ " is D");
      }
      else if(arr[i]<80){
          System.out.println("Your Grade for Score "+arr[i]+" is C");
      }
      else if(arr[i]<90){
          System.out.println("Your Grade for Score "+arr[i]+ " is B");
      }
      else if(arr[i]<100){
          System.out.println("Your Grade for Score "+arr[i]+ " is A");
      }
      else{
        System.out.println("Your Grade for Score "+arr[i]+ " is A");
      }
  }
  
	}
   }

