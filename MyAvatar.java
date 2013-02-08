//ontiretse keipidile 5431335121 31/01/2013

import java.awt.*;
import java.applet.Applet;

public class MyAvatar extends Applet {
	
	public void paint(Graphics g) {
		Dimension d = this.getSize();
		Font f = new Font("TimesRoman", Font.ITALIC, 72);
		g.setFont(f);
		String nickName = " Onti ";
		g.drawString(nickName, d.width - 300, d.height - 50);

		g.setColor(Color.black);
		g.fillOval(d.width / 2 - 100, d.height / 2 - 180, 300, 400);

		g.setColor(new Color(190, 155, 120));
		g.fillOval(d.width / 2 - 100, d.height / 2 - 100, 300, 400);
		// ears
		g.setColor(new Color(190, 155, 120));
		g.fillOval(d.width / 2 + 180, d.height / 2 + 20, 50, 100);
		g.setColor(new Color(190, 155, 120));
		g.fillOval(d.width / 2 - 130, d.height / 2 + 20, 50, 100);
		// hair
		g.setColor(Color.black);
		g.fillArc(d.width / 2 - 65, d.height / 2 - 127, 230, 150, 30, 120);
		// eyes and mouth and nose
		g.setColor(Color.white);
		g.fillOval(d.width / 2 - 45, d.height / 2 + 40, 75, 35);
		g.setColor(Color.white);
		g.fillOval(d.width / 2 + 80, d.height / 2 + 40, 75, 35);
		g.setColor(Color.black);
		g.fillOval(d.width / 2 - 15, d.height / 2 + 50, 15, 15);
		g.setColor(Color.black);
		g.fillOval(d.width / 2 + 110, d.height / 2 + 50, 15, 15);

		g.drawArc(d.width / 2 + 17, d.height / 2 + 64, 80, 90, 230, 90);

		g.drawLine(d.width / 2 + 80, d.height / 2 + 105, d.width / 2 + 85,
				d.height / 2 + 130);

		g.drawLine(d.width / 2 + 35, d.height / 2 + 105, d.width / 2 + 30,
				d.height / 2 + 130);

		g.drawLine(d.width / 2, d.height / 2 + 240, d.width / 2 + 110,
				d.height / 2 + 200);

	}

}
