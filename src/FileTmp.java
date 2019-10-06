import java.io.File;

public class FileTmp {

	public static void main(String args[]) {
		new FileTmp().picConfig();
	}
	
	
	public void picConfig() {
		File file = new File("E:\\Java_code\\KeyboardPiano0.0\\bin\\wav");
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
			 * rename wav file, ATTENTION: it's replace
			 */
			/*
			if(!child[i].isDirectory()) { //if it's wav file
				String path = child[i].getAbsolutePath();
				System.out.println("old = " + path);
				String newPath = renameWav(path);
				System.out.println("new = " + newPath);
				child[i].renameTo(new File(newPath));
			}
			*/
			/*
			 * output for the configure file
			 * file_name=file_path -> config_file
			 */
			System.out.print(child[i].getName() + "=");
			System.out.println(child[i].getPath());
			
			if(child[i].isDirectory()) {
				recursive(child[i]);
			}
		}
	}
	
	private static final int NAME_LENGTH = 7;
	private static final int PITCH_INDEX = 2;
	
	public static String renameWav(String path) {
		int length = path.length();
		String head = path.substring(0, length-NAME_LENGTH);
		String name = path.substring(length-NAME_LENGTH, length);
		String pitch = name.substring(0, PITCH_INDEX);
		String last = name.substring(PITCH_INDEX, name.length());
		String newPitch = renamePitch(pitch);
		String newPath = head + newPitch + last;
		return newPath;
	}
	
	private static String renamePitch(String pitch) {
		String newPitch = "";
		switch(pitch) {
		case "X1" :
			newPitch = "A";
			break;
		case "S1" :
			newPitch = "B";
			break;
		case "X2" :
			newPitch = "C";
			break;
		case "S2" :
			newPitch = "D";
			break;
		case "X3" :
			newPitch = "E";
			break;
		case "X4" :
			newPitch = "F";
			break;
		case "S4" :
			newPitch = "G";
			break;
		case "X5" :
			newPitch = "H";
			break;
		case "S5" :
			newPitch = "I";
			break;
		case "X6" :
			newPitch = "J";
			break;
		case "S6" :
			newPitch = "K";
			break;
		case "X7" :
			newPitch = "L";
			break;
		}
		return newPitch;
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
