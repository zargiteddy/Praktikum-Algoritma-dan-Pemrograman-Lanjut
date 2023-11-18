public class Tugas7 {
    public static void main(String[] args) {

       int ulang = 4;
       int aSuku=0;
       int bSuku=0;

            for(int suku=1;suku<=ulang;suku++){
            aSuku++;
            bSuku+=suku;
            System.out.println("("+suku+")");
            if (aSuku==2){
          	System.out.println(bSuku);

          	aSuku=0;
            bSuku=0;
            }
        }
    }
}