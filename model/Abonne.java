package model;

public class Abonne extends Client {
	protected int credit;
	
	public Abonne(String numCB, String mail) {
		super(numCB, mail);
		this.credit = 15;
	}

	public Abonne(String numCB, String mail, int credit) {
		super(numCB, mail);
		this.credit = credit;
	}
	
	public void rechargerCredit() {
		this.credit += 10;
	}
	
	public void rechargerCredit(int montant) {
		if(montant >= 10) {
			this.credit += montant;
		} else {
			System.err.println("Le montant de recharge minimum est de 10€ !");
		}
	}
}
