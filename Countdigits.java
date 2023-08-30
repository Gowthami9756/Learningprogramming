
public class Countdigits {

	public static int countofDigits(int num) {
		if(num==0) {
			return 1;
		}
		int count = 0;
		while(num!=0)
		{
			num /= 10;
			count++;
		}
		return count;
	}

}
