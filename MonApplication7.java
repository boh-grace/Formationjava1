import java.util.scanner;
public class MonApplication7 {
	public static void main (String arg[]){

	System.out.println("demo boucle while");
		String prenom;
		char reponse='O';
		scanner sc = new scanner(System.in);
		while (reponse=='O')
		
		System.out.println("donner un prenom: ");
		prenom= sc.nextline();
		System.out.println("bonjour "+prenom+ ",comment tu-vas ? ");
		System.out.println("Voulez-vous +Reessayer ? (O/N)" );
		reponse = sc.nextline().charAt("O");
		System.out.println("Au revoir...");
		 
		}
	}	
		
		
	