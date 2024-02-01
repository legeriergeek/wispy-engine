package fr.nicolas.wispy;
import     fr.legeriergeek.wispyAPI.button;
import fr.legeriergeek.wispyAPI.scene;
import fr.legeriergeek.wispyAPI.window;
import fr.nicolas.wispy.Frames.MainFrame;

public class Main {

	public static void main(String[] args) {
		button.setTextColor(255, 0, 0, 255);
		button.setTextFont("Comic Sans MS");
		button.setDefaultImage("defaultHovered", "default");
		scene.setWindowTitle("uwU On S'aMusE");
		scene.setMainScene("TestPanel");
		new MainFrame();
	}

}
