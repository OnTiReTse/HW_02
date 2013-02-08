//5431335121 ontiretse keipidile 31/01/2013

import java.awt.*;
//import java.applet.Applet;
//import java.util.Calendar;

public class MyAvatarClockDB extends MyAvatarClock{
	
	
	public void update(Graphics g){
			paint(g);
	}
	public void paint(Graphics g){
		 
		Image image = createImage(1300,1300);
		Graphics offscreen = image.getGraphics();
		super.paint(offscreen);
		g.drawImage(image,0,0,this);
		//super.paint(g);
		
	}
}
