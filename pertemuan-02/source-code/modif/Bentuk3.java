public class Bentuk3{
	public static void main(String[]args){

int x = 5;
int i = 1;
do{
	int j = 5;
	do{
		System.out.print(' ');
		j--;
	}while(j >= i);

		int k = 1;
		do{
			System.out.print('*');
			k++;
		}while (k <= i);

		int l = 1;
		do{
			System.out.print('*');
			l++;
		}while (l <= i-1);

		System.out.println();
		i++;
	}while (i <= x);
  }
}