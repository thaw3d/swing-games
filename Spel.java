import javax.swing.*;
import java.awt.*;

/*
playing around w/ graphics components

*/

public class Spel extends JFrame {

  public static void main(String[] args) {
    Spel startaSpel = new Spel();

  }

  public Spel() {
  	JFrame fonster = new JFrame("test");

  	fonster.setSize(600,500);
  	fonster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  	fonster.setVisible(true);
  	fonster.setBackground(Color.black);
  	fonster.getContentPane().setBackground(Color.black);
  	Container y = fonster.getContentPane();

    int igen = JOptionPane.showConfirmDialog(fonster, "byt?", "Igen?", JOptionPane.YES_NO_OPTION);
  	if (igen == JOptionPane.YES_OPTION) {
  		y.setBackground(Color.white);
  	}
  }
}