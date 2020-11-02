package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.AL2000;

public class Fenetre extends JFrame {

	private AL2000 al2000;
	
	public Fenetre(AL2000 al2000) throws HeadlessException {
		super("AL2000");
		this.al2000 = al2000;
		this.initFenetre();
	}
	
	private void initFenetre() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel northPanel = new JPanel();
		northPanel.add(new JLabel("Bienvenue dans l'AL2000 !"));
		
		JScrollPane scrollPane = new JScrollPane();
		JPanel centerPanel = new JPanel();
		scrollPane.add(centerPanel);
		
		Icon theDictator;
		Icon godfather;
		Icon titanic;
		Icon joker;
		Icon pulpFiction;
		
		try {
			theDictator = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../resources/thedictator.jpg")));
			godfather = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../resources/godfather.jpg")));
			titanic = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../resources/titanic.jpg")));
			joker = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../resources/joker.jpg")));
			pulpFiction = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("../resources/pulpfiction.jpg")));
			
			centerPanel.add(new JLabel(theDictator));
			centerPanel.add(new JLabel(godfather));
			centerPanel.add(new JLabel(titanic));
			centerPanel.add(new JLabel(joker));
			centerPanel.add(new JLabel(pulpFiction));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(scrollPane, BorderLayout.CENTER);
		
		this.add(mainPanel);
		this.setVisible(true);
	}

}
