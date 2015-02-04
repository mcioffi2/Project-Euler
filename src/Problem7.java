
public class Problem7 {

	/**
	 * @param args
	 */
	

	public static  boolean isPrime(int x)
	{
	
			for(int i=2; i<x; i++)
			{
				if(x%i == 0)
				{
					return false;
				}}
			return true;
			}
				
		
		
	
	public static void main(String[] args) {

	    int count = 0;
        int prime = 0;
        while (prime <= 10001) {
            if (isPrime(count) == true) {
                prime++;
                if (prime == 10001) {
                    System.out.println(count);
                }
            }
            count++;
	
	}
	}
}


