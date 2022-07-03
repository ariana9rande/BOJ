import java.util.*;

class Main
{
	static int check(int n)
	{
		if(n % 4 == 0)
			if(n % 100 != 0 || n % 400 == 0)
				return 1;
		return 0;
	}
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int input = sc.nextInt();
    	
    	System.out.println(check(input));
    }
}
