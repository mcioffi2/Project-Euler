
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 1; 
		int max = 4000000;
		int newtotal = 1; 
		int finaltotal = 0; 
		
		while ( x < max)
		{
			int y = x; 
			x = x + newtotal; 
			newtotal = y; 
						
			if(x%2 == 0)
			{
				finaltotal += x;
			}
			

		}
		
		System.out.println(finaltotal);
	}

}
