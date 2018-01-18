import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrom
{
	private static String text;

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public Palindrom(String text)
	{
		this.text = text;
	}

	public static boolean check(String text)
	{
		boolean isPalindrom = false;

		String textToCheck = text.replaceAll("[\\s,./\"\':;?! \\-]", "").toLowerCase();
		int textLen = textToCheck.length();
		List<String> letters = new ArrayList<String>();
		for (int i = 0; i < textLen; i++)
		{
			letters.add(Character.toString(textToCheck.charAt(i)));
		}
		List<String> toRevLetter = new ArrayList<String>(letters);
		Collections.reverse(toRevLetter);
		if (letters.equals(toRevLetter))
		{
			isPalindrom = true;
		}

		return isPalindrom;
	}

}
