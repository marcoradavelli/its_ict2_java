package org.jac.figure.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindowOld extends JFrame implements KeyListener {
	
	int x, y;
	JPanel p;
	
	public MainWindowOld() {
		p = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(Color.RED);
				g.fillRect(x, y, 100, 200);
			}
		};
		
		this.setTitle("figure");
		this.setSize(400, 400);
		this.add(p);
		setVisible(true);
		
		addKeyListener(this);
		
		/*new Thread() {
			@Override
			public void run() {
				while (true) {
					x=x+10;
					p.repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();*/
	}
	
	/*public static void main(String[] args) {
		new MainWindowOld();
	}*/

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x=x+10;
			p.repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}

}
