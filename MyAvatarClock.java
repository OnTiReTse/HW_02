
// ontiretse keipidile 5431335121 31/01/2013

import java.awt.*;
import java.applet.Applet;
import java.util.Calendar;

public class MyAvatarClock extends MyAvatar implements Runnable {
	protected Thread mainThread;
	protected int delay;

	public void init() {
		mainThread = null;
		delay = 200;
	}

	public void start() {
		if (mainThread == null) {
			mainThread = new Thread(this);
			mainThread.start();
		}
	}

	public void run() {
		while (Thread.currentThread() == mainThread) {
			repaint();
			try {
				Thread.currentThread().sleep(delay);
			} catch (InterruptedException e) {
			}
		}
	}
	public void paint (Graphics g){
		
		Dimension d = this.getSize();
		super.paint(g);
		Calendar c = Calendar.getInstance();
		int s = c.get(Calendar.SECOND);
		Font font=new Font("Arial",Font.ITALIC,25);
		g.setFont(font);
		// draw some new eyes that can move so , first clear the space
		
		g.setColor(Color.WHITE);
		g.fillOval(d.width / 2 - 45, d.height / 2 + 20, 75, 65);
		g.fillOval(d.width / 2 + 80, d.height / 2 + 20, 75, 65);
		
		// g.fillOval(d.width / 2 - 15, d.height / 2 + 50, 15, 15);
		
		// g.fillOval(d.width / 2 + 110, d.height / 2 + 50, 15, 15);
		
		g.setColor(Color.BLACK);
		for(int deg=0;deg<360;deg+=6){
			double radian=(deg*Math.PI/180)-(Math.PI/2);
			int x = (int)(250*Math.cos(radian))+d.width/2 +40 ;

			int y = (int)(250*Math.sin(radian))+d.height/2 +60 ;

			if(deg/6==s){
				g.fillOval((int)(15*Math.cos(radian))+d.width / 2 - 15, (int)(15*Math.sin(radian))+d.height / 2 +50, 15, 15);
				g.fillOval((int)(15*Math.cos(radian))+d.width / 2 + 110, (int)(15*Math.sin(radian))+d.height / 2 +50, 15, 15);
	
		}
			if(deg%5==0)
				
			{
							
			if(deg/6==s) 
			g.setColor(Color.BLUE);
							if(deg==0) g.drawString("60", x-7, y+10);
							else g.drawString(Integer.toString(deg/6), x-7, y+10);
								g.setColor(Color.BLACK);
								continue;
						}
			if(deg/6==s)
					{
							g.setColor(Color.BLUE);
						g.fillOval(x,y,7,7);
						g.setColor(Color.BLACK);			
			}	
					else g.fillOval(x,y,7,7);
			}
		
		
	}

}
