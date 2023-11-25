package fr.legeriergeek.wispyAPI;

import fr.nicolas.wispy.Frames.MainFrame;

public class scene {
    public static void main(String[] args) {
        
    }

    public static void setMainScene(String mainScene){
        MainFrame.Mainpanel = mainScene;
    }

    public static void setWindowTitle(String title){
        MainFrame.title = title;
    }
}
