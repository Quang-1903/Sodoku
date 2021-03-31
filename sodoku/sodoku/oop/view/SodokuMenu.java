package sodoku.oop.view;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class SodokuMenu extends JMenuBar {
	private static final long serialVersionUID = -4576947769358333918L;
	
	private JMenuItem openMenu = new JMenuItem("Open file ...");
	private JMenuItem openDBMenu = new JMenuItem("Open file database ...");
	private JMenuItem saveMenu = new JMenuItem("Save");
	private JMenuItem exitMenu = new JMenuItem("Exit");
	private JMenuItem helpMenu = new JMenuItem("Help");

	public SodokuMenu(SodokuListener listener) {
		super();
		
		JMenu fileMenu = new JMenu("File");
		JMenu fileActions = new JMenu("Actions");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		openMenu.setMnemonic(KeyEvent.VK_O);
		KeyStroke ctrlOKeyStroke = KeyStroke.getKeyStroke("control O");
		openMenu.setAccelerator(ctrlOKeyStroke);
		openMenu.addActionListener(listener);
		
		openMenu.addActionListener(listener);

		saveMenu.setMnemonic(KeyEvent.VK_S);
		KeyStroke ctrlSKeyStroke = KeyStroke.getKeyStroke("control S");
		saveMenu.setAccelerator(ctrlSKeyStroke);
		saveMenu.addActionListener(listener);

		exitMenu.setMnemonic(KeyEvent.VK_X);
		exitMenu.addActionListener(listener);

		fileMenu.add(openMenu);
		fileMenu.addSeparator();
		fileMenu.add(saveMenu);
		fileMenu.addSeparator();
		fileMenu.add(exitMenu);
		
		fileActions.add(helpMenu);
		helpMenu.addActionListener(listener);
		
		this.add(fileMenu);
		this.add(fileActions);
		
		this.setEnableMenu(false);
	}

	public void setEnableMenu(boolean status){
		this.openMenu.setEnabled(true);
		this.exitMenu.setEnabled(true);
		this.saveMenu.setEnabled(status);
	}
}
