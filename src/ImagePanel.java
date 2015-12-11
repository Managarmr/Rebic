import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImagePanel extends JPanel{
	private BufferedImage image;
	private int width;
	private int height;
	
	public ImagePanel(){
		super();
	}

	public void loadImage(String fileName) {
		try{
			image = ImageIO.read(new File(fileName));
			resizeImage(70);
		}catch(IOException ex){
			
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int xPos = (this.getWidth()/2)-(width/2);
		int yPos = this.getHeight()/2-height/2;
		
		g.drawImage(image, xPos, yPos, width, height, null);
	}

	private void resizeImage(int percent) {
		double ratio = (double)percent/100;
		if(image.getWidth() > image.getHeight()){
			double widthD = Toolkit.getDefaultToolkit().getScreenSize().getWidth()*ratio;
			width = (int)Math.floor(widthD);
			height = (int)Math.floor((widthD/image.getWidth())*image.getHeight());
		}
		else {
			double heightD = Toolkit.getDefaultToolkit().getScreenSize().getHeight()*ratio;
			height = (int)Math.floor(heightD);
			width = (int)Math.floor((heightD/image.getHeight())*image.getWidth());
		}
	}
	
	public void refreshImage(int size){
		resizeImage(size);
		repaint();
	}
	
	public void contractimage(){
		
	}
	
	
}
