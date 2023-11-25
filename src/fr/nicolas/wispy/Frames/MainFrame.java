package fr.nicolas.wispy.Frames;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;

import fr.nicolas.wispy.Panels.GamePanel;
import fr.nicolas.wispy.Panels.MenuPanel;
import fr.nicolas.wispy.Panels.TestPanel;
import fr.nicolas.wispy.Panels.Components.Menu.WPanel;

public class MainFrame extends JFrame {
	public static String title = "WispyAPI powered game";

	private WPanel panel;
	public static  int INIT_WIDTH = 1250, INIT_HEIGHT = 720;
	public static String Mainpanel = "MenuPanel";

	public MainFrame() {
		this.setTitle(title);
		this.setSize(INIT_WIDTH, INIT_HEIGHT);
		this.setMinimumSize(new Dimension(INIT_WIDTH, INIT_HEIGHT));
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		// Suppose que tu veux changer TestPanel vers AutrePanel
		panel = createPanel("fr.nicolas.wispy.Panels."+ Mainpanel, this.getBounds(), this);


		this.addComponentListener(new ComponentListener() {
			public void componentResized(ComponentEvent e) {
				panel.setFrameBounds(getBounds());
			}

			public void componentHidden(ComponentEvent e) {
			}

			public void componentMoved(ComponentEvent e) {
			}

			public void componentShown(ComponentEvent e) {
			}
		});

		this.setContentPane(panel);

		this.setVisible(true);
	}

	public static WPanel createPanel(String panelClassName, Rectangle bounds, MainFrame frame) {
		try {
			// Charge la classe dynamiquement en utilisant son nom
			Class<?> panelClass = Class.forName(panelClassName);
	
			// Obtient le constructeur qui prend une instance de Rectangle et MainFrame en paramètres
			Constructor<?> constructor = panelClass.getConstructor(Rectangle.class, MainFrame.class);
	
			// Appelle le constructeur pour créer une nouvelle instance de la classe
			WPanel newPanel = (WPanel) constructor.newInstance(bounds, frame);
	
			return newPanel;
		} catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
				InstantiationException | InvocationTargetException e) {
			e.printStackTrace(); // Gère les exceptions correctement dans ton application
			return null;
		}
	}
	

	public void newGame() {
		panel = new GamePanel(this.getBounds(), true);
		this.setContentPane(panel);
		this.validate();
		panel.requestFocus();
	}

}
