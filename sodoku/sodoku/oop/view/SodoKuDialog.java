package sodoku.oop.view;

import java.awt.BorderLayout;
import java.awt.Dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SodoKuDialog extends Dialog {
	private static final long serialVersionUID = -731335541152415526L;
  
	private JFrame mainFrame;
	public SodoKuDialog(SodokuFrame mainFrame)
	{
		super(mainFrame,"Help");
		JPanel pain = new JPanel(new BorderLayout());
		this.setLocation(100, 200);
		this.setSize(400, 180);
		this.mainFrame = mainFrame;
		this.init();
		this.setVisible(true);
		
		
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void init()
	{
	    	JOptionPane.showMessageDialog(mainFrame," bbbb");
	}
	
	
}
