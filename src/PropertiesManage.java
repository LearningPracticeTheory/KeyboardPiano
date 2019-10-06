import java.io.IOException;
import java.util.Properties;

public class PropertiesManage {

	static Properties propImg = new Properties(); 
	static Properties propWav = new Properties();
	
	static {
		try {
			propImg.load(PropertiesManage.class.getClassLoader().getResourceAsStream("config\\img.properties"));
			propWav.load(PropertiesManage.class.getClassLoader().getResourceAsStream("config\\wav.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private PropertiesManage() { }
	
	public static String getImgProperty(String key) {
		return propImg.getProperty(key);
	}
	
	public static String getWavProperty(String key) {
		return propWav.getProperty(key);
	}
	
}
