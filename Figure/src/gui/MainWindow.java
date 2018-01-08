package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import figure.Cerchio;
import figure.Figura;
import figure.Quadrato;
import figure.Rettangolo;

public class MainWindow extends JFrame implements KeyListener {
	
	static List<Figura> v = new ArrayList<>();
	static int right, down;
	GameThread t = new GameThread();
	
	public MainWindow() {
		setTitle("Figure");
		setSize(400,400);
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				for (Figura f : v) {
					if (f instanceof Rettangolo) {
						if (f instanceof Quadrato) g.setColor(Color.GREEN);
						else g.setColor(Color.RED);
						g.fillRect(f.x+right, f.y+down, (int)((Rettangolo)f).getBase(), (int)((Rettangolo)f).getAltezza());
					} else if (f instanceof Cerchio) {
						g.setColor(Color.BLACK);
						g.drawOval(f.x+right, f.y+down, (int)((Cerchio)f).getRaggio(), (int)((Cerchio)f).getRaggio());
					}
				}
			}
		};
		this.add(panel);
		this.addKeyListener(this);
		t.start();
	}
	
	public static void main(String[] args) {
		v.add(new Quadrato(10,10,20));
		v.add(new Rettangolo(100,200,50,100));
		v.add(new Quadrato(300,80,50));
		v.add(new Cerchio(80,80,50));
		
		MainWindow window = new MainWindow();
		window.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if (t.sinistra) t.sinistra = false;
			else t.destra = true;
		} else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			if (t.destra) t.destra = false;
			else t.sinistra = true;
		} else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			if (t.su) t.su = false;
			else t.giu = true;
		} else if (e.getKeyCode()==KeyEvent.VK_UP) {
			if (t.giu) t.giu = false;
			else t.su = true;
		}
	}
	
	class GameThread extends Thread {
		public boolean destra, sinistra, su, giu;
		public int delay=200;
		
		@Override
		public void run() {
			while (true) {
				if (destra) right+=5;
				if (sinistra) right-=5;
				if (su) down-=5;
				if (giu) down+=5;
				repaint();
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
