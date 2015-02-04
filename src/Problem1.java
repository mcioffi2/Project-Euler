
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0; 
		int newtotal = 0;
	
		while(x<1000)
		{
		if(x % 3 == 0 || x % 5 == 0 )
		{
		newtotal = x + newtotal;
		
		}
		x++; 
		}
	System.out.println(newtotal);
	}

}
