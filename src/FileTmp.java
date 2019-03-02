import java.io.File;

public class FileTmp {

	public static void main(String args[]) {
		new FileTmp().picConfig();
	}
	
	
	public void picConfig() {
		File file = new File("E:\\Java_code\\KeyboardPiano1.6\\bin\\wav");
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
			 * swap wav file, which is a mistake at the beginning, so use code correct it
			 */
//			child[i].renameTo(new File(swapWav(child[i].getPath())));
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
	
	public String swapWav(String path) {
		String last = String.valueOf(path.charAt(path.length()-5));
		System.out.println(last);
		if(last.equals("0")) {
			path = replace(path, path.length()-5, "8");
		} else if(last.equals("1")) {
			System.out.println("A" + path);
			path = replace(path, path.length()-5, "7");
			System.out.println("B" + path);
		} else if(last.equals("2")) {
			path = replace(path, path.length()-5, "6");
		} else if(last.equals("3")) {
			path = replace(path, path.length()-5, "5");
		} else if(last.equals("5")) {
			path = replace(path, path.length()-5, "3");
		} else if(last.equals("6")) {
			path = replace(path, path.length()-5, "2");
		} else if(last.equals("7")) {
			path = replace(path, path.length()-5, "1");
		} else if(last.equals("8")) {
			path = replace(path, path.length()-5, "0");
		} else {
//			System.out.println("NO");
		}
		return path;
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
