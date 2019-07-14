package zhuoqiu;
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

	Image ball=Toolkit.getDefaultToolkit().getImage("image/qiu.png");
	Image zhuo=Toolkit.getDefaultToolkit().getImage("image/zhuo.png");
	
	double x=100,y=100;
	boolean right=true;
	
	public static void main(String[] args) {
		BallGame b=new BallGame();

	}
	
	public BallGame() {
		
		setSize(856,400);
		setLocation(300,150);
		setVisible(true);
		//ÖØ»­´°¿Ú
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
		 if(right) {
			 x=x+4;
		 }else {
			 x=x-4;
		 }
		 if(x>800) {
			 right=false;
		 }
		 if(x<40) {
			 right=true;
		 }
	}
}
