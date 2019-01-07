package org.jac.figure.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainWindow extends JFrame implements KeyListener {
	protected int x=10;
	protected JPanel p;
	
	public static void main(String[] args) {
		new MainWindow();
	}
	
	public MainWindow() {
		setSize(600,400);
		setTitle("FigureGame");
		
		p = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, p.getWidth(), p.getHeight());
				g.setColor(Color.RED);
				g.fillRect(x, 10, 100, 200);
			}
		};
		this.setLayout(null);
		this.add(p);
		p.setSize(300,300);
		this.addKeyListener(this);
		JButton b = new JButton("Stop");
		b.setSize(100,100);
		b.setLocation(0,400);
		add(b);
		b.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainWindow.this, "Stop!!!", "Stop", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		this.setVisible(true);
		
		new Thread() {
			public void run() {
				while (true) {
					if (Math.random()<0.8) {
						x+=10;
					} else {
						x-=10;
					}
					p.repaint();
					try {
						Thread.sleep(100);
					} catch (Exception e) {e.printStackTrace();}
				}
			}
		}.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x += 10;  // x=x+10
		} else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			x -= 10;  // x=x+10
		}
		p.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
