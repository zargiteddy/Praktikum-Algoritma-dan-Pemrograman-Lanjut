public class Pola4 {
	public static void main(String[] args) {

	int i,j;
	System.out.println("Pengulangan bersarang membentuk pola");
		for(i=1; i<=6; i++){
		for(j=1; j<=6; j++){
			if(i>j){
				System.out.print( j+" ");
			}
		}
		System.out.println(" ");
	}
	for (i=4; i>=1; i--){
		for (j=1; j<=6; j++){
			if(i>=j){
		    System.out.print(j+ " ");
			}
	      }
	    System.out.println(" ");
       }
     }
   }
