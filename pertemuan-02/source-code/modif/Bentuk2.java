public class Bentuk2
	{
	public static void main(String[] args) {
	int a = 5;
	int b = 1;
	do
	    {
		int c = 1;
		do {
		System.out.print("*");
		c++;
	}
	while ( c <= b);
	b++;
		System.out.println();
		}
		while(b <= a);
        }
}