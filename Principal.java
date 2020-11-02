import controller.EcouteurDeSouris;
import model.AL2000;
import view.Fenetre;

public class Principal {
	public static void main(String[] args) {
		AL2000 al2000 = new AL2000();
		Fenetre fenetre = new Fenetre(al2000);
		EcouteurDeSouris eds = new EcouteurDeSouris();
		
		fenetre.addMouseListener(eds);
	}
}
