package model;

public class Technicien {
	private AL2000 al2000;
	private String mdp;
	
	public Technicien(AL2000 al2000, String mdp) {
		this.al2000 = al2000;
		this.mdp = mdp;
	}
	
	public boolean connexion(String mdp) {
		return this.mdp.equals(mdp);
	}
	
	public void delDVD(DVD dvd) {
		
	}
	
	public void addDVD(DVD dvd) {
		
	}
	
	public void DVDIsBroken(DVD dvd) {
		
	}
}
