
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long max = 600851475143L;
		long counter = 2;
		long counter2 = 2; 
		long counter3 = 2; 
		long counter4 = 2; 

		
		while(max%counter != 0 )
		{
			counter ++; 
		}
		
		
			long temp1 = max/counter; 
		
		
			while(temp1%counter2 != 0)
		{
			counter2 ++;
			
		}
	
		long temp2 = temp1/counter2;
		
		while(temp2%counter3 != 0 )
		{
			counter3 ++;
			
		}
		
		long temp3 = temp2/counter3;
		
		while(temp3%counter4 != 0 )
		{
			counter4 ++;
			
		}
System.out.println(counter);
System.out.println(counter2);
System.out.println(counter3);
System.out.println(counter4);


		
long  done = Math.max(Math.max(Math.max(counter,counter2),counter3),counter4);

System.out.println(done);
	
	
	
	
	}
	}