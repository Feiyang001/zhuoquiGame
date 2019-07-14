package zhuoqiu;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class BallGame2 extends JFrame{

	Image ball=Toolkit.getDefaultToolkit().getImage("image/qiu.png");
	Image zhuo=Toolkit.getDefaultToolkit().getImage("image/zhuo.png");
	
	double x=100,y=100;
    double degree=3.14/3;//初始角度是60度（弧度制）
	
	public static void main(String[] args) {
		BallGame2 b=new BallGame2();

	}
	
	public BallGame2() {
		
		setSize(856,480);
		setLocation(300,150);
		setVisible(true);
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g) {
		g.drawImage(zhuo, 10, 10, null);
		g.drawImage(ball, (int)x, (int)y,null);
			
	    x=x+10*Math.cos(degree);
	    y=y+10*Math.sin(degree);
	    if(y>400||y<40) {
	    	degree=-degree;
	    }
	    if(x>800||x<40) {
	    	degree=3.14-degree;
	    }
	
	}
}

