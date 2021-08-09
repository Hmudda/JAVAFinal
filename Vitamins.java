import java.awt.*;
import javax.swing.*;
import javax.imageio.*;

//Jordan Babb
//OCCC Advanced Java
//FINAL PROJECT!

public class Vitamins extends JFrame{
	private static final int WIDTH = 1500;
	private static final int HEIGHT = 800;
	
	public static void main(String [] args){
		Vitamins g = new Vitamins();
		
	}
	
	public Vitamins(){
		super("Are you consuming enough Vitamins and Minerals?");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 1));
		JPanel jp2 = new JB_VitMin();
		add(jp2);
		
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
	}
}