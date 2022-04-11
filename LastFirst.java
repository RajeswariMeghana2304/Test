import java.util.Scanner;

public class LastFirst {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		int fnum=0,lnum=0;
		
		System.out.println("Enter Number");
		int n=s.nextInt();
		
		for(int i=n;i!=0;i=i/10) {
			fnum=i%10;	
		}
		lnum=n%10;   // last digit

		System.out.println("First number is:"+fnum);
		System.out.println("Last number is:"+lnum);

    

    while(n != 0) 
      {
        n = n / 10; // 145 => 145/10 => 14
        if(n <= 9)
        {
          System.out.println("First number = " +n);
          break;
        }  
      }

    
	}
}