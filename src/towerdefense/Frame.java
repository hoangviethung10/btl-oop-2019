package towerdefense;
import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
	public static String title = "Tower Defense by Hung Hieu";
	public static Dimension size = new Dimension(700,500); 
	
	public void init() {
		setLayout(new GridLayout(1,1,0,0));
		Screen screen = new Screen(this);
		add(screen);
		setVisible(true);
	}
	
	public Frame() {
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
	}
	
}
