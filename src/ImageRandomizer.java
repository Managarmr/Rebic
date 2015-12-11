import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;


public class ImageRandomizer {
	
	private static HashMap<Double, String> proba = new HashMap<Double,String>();	
//	
//	public static void main(String[] args){
//		ImageRandomizer rand = new ImageRandomizer();
//		System.out.println(rand.chooseImage());
//		
//	}

	private static void initialize() {
		Path path = Paths.get("./sources/proba.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			double sum = 0;
			for(String line : lines){
				String[] temp = line.split("=");
				if(temp.length == 2){
					sum += Double.parseDouble(temp[1]);
					proba.put(sum, temp[0]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String chooseImage(){
		if(proba.isEmpty())
			initialize();
		String path = "./sources/images";
		File folder = new File(path);
		double rand = Math.random();
		double key = 1;
		for(Double i : proba.keySet()){
			if(rand <=i && i < key){
				key = i;
			}
		}
		path += "/" + proba.get(key);
		folder = new File(path);
		
		String[] images = folder.list();
		int rand2 = (int)(Math.random()*(images.length-1));
		return path + "/" + images[rand2];
	}
	
	
}
