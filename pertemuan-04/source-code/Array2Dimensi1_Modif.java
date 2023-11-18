import java.util.Scanner;
	public class Array2Dimensi1_Modif {
		public static void main(String[] args){
        int b=3;
        int d=3; //matrik 3 baris 3 kolom
    System.out.println("Masukkan Nilai Matrix:");
    int[][] matrix1=new int[b][d];
       		for(int i=0;i<b;i++){
        	for(int j=0;j<d;j++){ matrix1[i][j]=input();}
     		}
     		for(int i=0;i<b;i++){
      		for(int j=0;j<d;j++){
    System.out.print(matrix1[i][j]+" ");
    }
    System.out.println();
    }
    System.out.println("Perkalian Matrix");
      for(int i=0;i<b;i++){
         	for(int j=0;j<d;j++){
         	int kali = matrix1[i][j]*matrix1[i][j];
    System.out.print(kali + "  ");
    }
    System.out.println();
    }
      }
      static int input(){
      Scanner a=new Scanner(System.in);
      int b=a.nextInt();
      return b;
      }
}
