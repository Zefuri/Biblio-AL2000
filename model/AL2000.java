package model;

import java.util.ArrayList;

public class AL2000 {
	private Mode mode;
	private ArrayList<Client> clients;
	
	public AL2000() {
		this.mode = Mode.UTILISATEUR;
		this.clients = new ArrayList<>();
	}
	
	public void changerMode() {
		
	}
}
