import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class ImageFrame extends JFrame implements KeyListener{
	private ImagePanel panel;
	
	public ImageFrame(String name){
		super(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new ImagePanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		this.addKeyListener(this);
		setResizable(false);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setUndecorated(true);
	}

	public void loadImage(String imageName){
		panel.loadImage(imageName);
		repaint();
	}
	
	public void refreshImage(int percent){
		panel.refreshImage(percent);
//		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			for(int i = 70; i<=90; i++){
				refreshImage(i);
			}
//			loadImage(ImageRandomizer.chooseImage());
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP){
			loadImage(ImageRandomizer.chooseImage());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
