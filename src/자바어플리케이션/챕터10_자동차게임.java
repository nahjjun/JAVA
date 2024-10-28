package 자바어플리케이션;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 챕터10_자동차게임 extends JFrame{
	public 챕터10_자동차게임 () {
		setTitle("자동차 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel cat = new MyPanel(this);
		add(cat);
		
		setPreferredSize(new Dimension(400,400));
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		챕터10_자동차게임 f = new 챕터10_자동차게임();
	}
	
	public class MyPanel extends JPanel{
		int x=100, y=100;
		int height, width;
		BufferedImage img=null;
		Container contentPane;
		
		public MyPanel(Container contentPane) {
			this.contentPane = contentPane;
			try {
				img = ImageIO.read(new File("img/고양이.png"));
			}catch(IOException e) {
				System.out.println("no image");
				System.exit(1);
			}
			addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
					height = contentPane.getHeight();
					width = contentPane.getWidth();
					int keycode = e.getKeyCode();
					switch(keycode) {
					case KeyEvent.VK_UP:
						if(y-3<=0) y=0;
						else y -= 3;
						break;
					case KeyEvent.VK_DOWN:
						if(y+3>=height-img.getHeight()) y=height-img.getHeight();
						else y += 3;
						break;
					case KeyEvent.VK_LEFT:
						if(x-3<=0) x=0;
						else x -= 3; 
						break;
					case KeyEvent.VK_RIGHT:
						if(x+3>=width-img.getWidth()) x=width-img.getWidth();
						else x += 3;
						break;
					}
					repaint();
				}
				public void keyReleased(KeyEvent e) {
				}
				public void keyTyped(KeyEvent e) {
				}
			});
			this.requestFocus(); // 포커스를 요청하고
			setFocusable(true); // 포커스를 true로 설정한다.
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, null);
		}
	}
}
