import java.io.File;

public class FileTmp {

	public static void main(String args[]) {
		new FileTmp().picConfig();
	}
	
	
	public void picConfig() {
		File file = new File("E:\\Java_code\\KeyboardPiano1.4\\bin\\wav");
		recursive(file);
	}
	
	
	public void recursive(File f) {
		File child[] = f.listFiles();
		for(int i = 0; i < child.length; i++) {
			/*
			 * Rename files
			 */
//			child[i].renameTo(new File(fileCheck(child[i].getPath())));
			/*
			 * file_name=file_path -> config_file
			 */
			System.out.print(child[i].getName() + "=");
			System.out.println(child[i].getPath());
			
			
			if(child[i].isDirectory()) {
				recursive(child[i]);
			}
		}
	}
	
	public String fileCheck(String path) {
		int index = path.indexOf("-");
		if(index != -1) {
			path = replace(path, index, "_");
		}
		return path;
	}
	
	public String replace(String path, int index, String newChar) {
		String tmp = "";
		tmp = path.substring(0, index);
		tmp += newChar;
		if(index+1 < path.length())
			tmp += path.substring(index+1, path.length());
		return tmp;
	}
	
}
