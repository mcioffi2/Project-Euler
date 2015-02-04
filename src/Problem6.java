
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 0; 
		int number2 = 0;
		int temp = 0;

		
		for(int i = 0; i<=100; i++)
		{
			int temp2;
			temp2 =  i * i; 
			number1 = number1 + temp2;
			
		}
		for(int i = 0; i<=100; i++)
		{
			temp =  temp + i; 
			number2 = temp * temp;
			
		}
		
		System.out.println(number1);
		System.out.println(number2);
		
		int finalnumber = number2 - number1;
		System.out.println(finalnumber);
	}

}
