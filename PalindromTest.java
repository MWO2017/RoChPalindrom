

public class PalindromTest
{

	public static void main(String[] args)
	{

		Palindrom test = new Palindrom("f-sdf");
		boolean result = Palindrom.check(test.getText());
		if (result == false)
		{
			System.out.println("To nie jest Palindrom");

		}
		else{
			System.out.println("To jest Palindrom");
		}
		Palindrom test2 = new Palindrom("Iwono, ty rabuj okop spokoju barytonowi");
		boolean result2 = Palindrom.check(test.getText());
		if (result2 == false)
		{
			System.out.println("To nie jest Palindrom");

		}
		else{
			System.out.println("To jest Palindrom");
		}
		
	}
}
