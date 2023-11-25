package fr.legeriergeek.wispyAPI;

import fr.nicolas.wispy.Panels.Components.Menu.WButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class button {

   public static void main (String[] args){

   } 

   public static void  setTextFont(String font){
    WButton.font = font;

   }

   public static void setTextColor(int r, int g, int b, int a){
      WButton.r = r;
      WButton.gc = g;
      WButton.b = b;
      WButton.a = a;

   }

   public static void  setDefaultImage(String defaultImage, String hoveredImage){
      WButton.defaultImage = defaultImage;
      WButton.hoveredImage = hoveredImage;
   }
}
