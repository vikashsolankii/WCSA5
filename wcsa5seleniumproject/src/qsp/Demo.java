package qsp;
public class Demo {
	
	/*static {
		for(int i=1; i<10; i++)
			System.out.print(i);
	}
*/
	   public static void main(String[] args) {	
		   int num=121,rev=0,copy=num;
		   while(num>0) {
			   int last=num%10;
			   rev=rev*10+last;
			   num=num/10;
		   }
		   System.out.println();
		   System.out.println(rev);
		   if(copy==rev) {
			   System.out.println("Palendrome");
		   }
		   else{
			   System.out.println("not palendrome");
		   }
		   
		   int fact=5,sum=1;
		   while(fact>0) {
			   sum*=fact;
			   fact--;
		   }
		   System.out.println(sum);
		   
		}

	}


