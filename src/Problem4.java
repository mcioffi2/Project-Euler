

public class Problem4 {
	
	public static boolean isPalindrome(int number2)
	{
	    int number = 0;                   
	    int x = number2;                   
	    while (x > 0) {
	        number = 10 * number + x % 10;
	        x /= 10;
	    }
	    return number2 == number;               
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    int max = 100000;

	    for ( int i = 999 ; i >= 100 ; i--) {
	        if ( max >= i*999 ) { 
	            break;
	        }
	        for (int j = 999 ; j >= i ; j-- ) {             
	            int p = i * j;
	            if ( max < p && isPalindrome(p) ) {
	                max = p;
	            }
	        }
	    }       
	    System.out.println(max);
	}
}