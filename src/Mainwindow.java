
public class Mainwindow {
	private static ImageFrame frame;
	
	public static void main(String[] args){
		createWindow();
		frame.loadImage(ImageRandomizer.chooseImage());
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		imageTransitionExtend();
		
	}
	
	public static void createWindow(){
		frame = new ImageFrame("simple GUI");
		frame.pack();
		frame.setVisible(true);
	}
//	public static void imageTransitionExtend(){
//		for(int i=70; i <=90; ++i){
//			frame.refreshImage(i);
//			frame.repaint();
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
//	static class Listener implements KeyListener{
//
//		public Listener(){
//		}
//		
//		@Override
//		public void keyPressed(KeyEvent e) {
//			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
//				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
//			}
//			else if(e.getKeyCode() == KeyEvent.VK_UP){
//				frame.loadImage(ImageRandomizer.chooseImage());
//			}
//			else if(e.getKeyCode() == KeyEvent.VK_DOWN){
////				frame.imageTransitionExtend(ImageRandomizer.chooseImage());
//				imageTransitionExtend();
//			}
//		}
//
//		@Override
//		public void keyReleased(KeyEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void keyTyped(KeyEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}

}

