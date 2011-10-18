
package com.ourteam.yippySMS.view;

/**
 * @author John-Paul
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class SplashScreen extends JWindow implements Runnable
{
	public void run()
	{
		JLabel SplashLabel = new JLabel(new ImageIcon(getClass().getResource("/images/SMSSPLASH.png")));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Color cl = new Color(0, 0, 0);
		SplashLabel.setBorder(new LineBorder (cl, 1));
		getContentPane().add(SplashLabel,BorderLayout.CENTER);
		setSize(550,280);
		setLocation((screen.width - 490)/2,((screen.height-300)/2));
		show();
	}

	public static void main(String[] args){
		SplashScreen splash = new SplashScreen();
		splash.run();
	}

}
