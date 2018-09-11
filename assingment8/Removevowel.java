import java.util.Scanner;
public class Remvowel
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		String str;
		System.out.println("Enter  string");
		str = ip.nextLine();
		
		System.out.println("String  vowel are not removed : " + str);
		String str1 = str.replaceAll("[aeiouAEIOU]" , "");		
		System.out.println("String after vowel  removed : " + str1);
		ip.close();
	}
}