import java.io.IOException;
import java.util.Properties;

public class PropertiesManage {

	static Properties propPic = new Properties(); 
	static Properties propWav = new Properties();
	
	static {
		try {
			propPic.load(PropertiesManage.class.getClassLoader().getResourceAsStream("config\\pic.properties"));
			propWav.load(PropertiesManage.class.getClassLoader().getResourceAsStream("config\\wav.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private PropertiesManage() { }
	
	public static String getPicProperty(String key) {
		return propPic.getProperty(key);
	}
	
	public static String getWavProperty(String key) {
		return propWav.getProperty(key);
	}
	
}
