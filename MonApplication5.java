public class MonApplication5 {
	
	public static void main (String arg[]){
	System.out.println("demo switch");
	
int note = 10;     // on ne imagine que la note maximale est 20
switch (note)
   case 0:
   System.out.println("ouch!");
   break;
   case 10:
   System.out.println("vous avez juste la moyenne");
   case 20:
   break;
   System.out.println("parfait");
   break;
   defaut:
   System.out.println("il faut travailler d'avantage");
    }
 }