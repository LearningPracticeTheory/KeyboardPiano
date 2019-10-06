 
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
 
public class ImageUtils {
    
    public static void cutPNG(InputStream input, OutputStream out, int x,
            int y, int width, int height) {
        ImageInputStream imageStream = null;
        try {
            Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("png");
            ImageReader reader = readers.next();
            imageStream = ImageIO.createImageInputStream(input);
            reader.setInput(imageStream, true);
            ImageReadParam param = reader.getDefaultReadParam();
            Rectangle rect = new Rectangle(x, y, width, height);
            param.setSourceRegion(rect);
            BufferedImage bi = reader.read(0, param);
            ImageIO.write(bi, "png", out);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
				imageStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
    
    static FileInputStream input = null;
    static FileOutputStream output = null;
    private static int x = 0;
    private static int y = 0;
    private static int count = 0;
    private static final int LEVEL = 3; // the number of row & column
    
    
    /**********
     * A Type * 
     **********/
    /*
    private static final int WIDTH = 162;
    private static final int HEIGHT = 152;
    private static final int LOCATION_X = 368;
    private static final int LOCATION_Y = 494;
    */
    /**********
     * B Type *
     **********/
    /*
    private static final int WIDTH = 247;
    private static final int HEIGHT = 151;
    private static final int LOCATION_X = 458;
    private static final int LOCATION_Y = 316;
    */
    /**********
     * C Type *
     **********/
    /*
    private static final int WIDTH = 348;
    private static final int HEIGHT = 151;
    private static final int LOCATION_X = 457;
    private static final int LOCATION_Y = 316;
    */
    /**********
     * D Type *
     **********/
    /*
    private static final int WIDTH = 432;
    private static final int HEIGHT = 151;
    private static final int LOCATION_X = 457;
    private static final int LOCATION_Y = 316;
    */
    /**********
     * E Type *
     **********/
    
    private static final int WIDTH = 1245;
    private static final int HEIGHT = 151;
    private static final int LOCATION_X = 457;
    private static final int LOCATION_Y = 316;
    
    /**********
     * F Type *
     **********/
    /*
    private static final int WIDTH = 162;
    private static final int HEIGHT = 318;
    private static final int LOCATION_X = 368;
    private static final int LOCATION_Y = 411;
    */
    
    public static final int CUT_TYPE_A = 19;
    public static final int CUT_TYPE_B = 33;
    public static final int CUT_TYPE_C = CUT_TYPE_B;
    public static final int CUT_TYPE_D = CUT_TYPE_B;
    public static final int CUT_TYPE_E = 31;
	public static final int CUT_TYPE_F = CUT_TYPE_A;
	public static final int CUT_TYPE_N = CUT_TYPE_A;
    
	/*
	 * Ignore all the N cases
	 */
	public static final String sides[] = {"L", "R"};
	
	public static final String colors[] = {"W", "G", "L", "B"};
	
	public static final String directions[] = {"U", "D"};
	
	public static final String types[] = {"A", "B", "C", "D", "E", "F"};
	
	public static final String pitches[] = {"B", "D", "G", "I", "K", 
			"A", "C", "E", "F", "H", "J", "L"};
	
	public static final String octaves[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
	
	
	private static String cutInputPath = null;
	private static String cutOutputPath = null;
	
	private static final String A_TYPE = "A";
	private static final String B_TYPE = "B";
	private static final String C_TYPE = "C";
	private static final String D_TYPE = "D";
	private static final String E_TYPE = "E";
	private static final String F_TYPE = "F";
	
	private static void setPathByType(String type) {
		switch(type) {
		case A_TYPE :
			cutInputPath = "./img_split/A/";
			cutOutputPath = "./img_split/A_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/A_Type/";
			break;
		case B_TYPE :
			cutInputPath = "./img_split/B/";
			cutOutputPath = "./img_split/B_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/B_Type/";
			break;
		case C_TYPE :
			cutInputPath = "./img_split/C/";
			cutOutputPath = "./img_split/C_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/C_Type/";
			break;
		case D_TYPE :
			cutInputPath = "./img_split/D/";
			cutOutputPath = "./img_split/D_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/D_Type/";
			break;
		case E_TYPE :
			cutInputPath = "./img_split/E/";
			cutOutputPath = "./img_split/E_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/E_Type/";
			break;
		case F_TYPE :
			cutInputPath = "./img_split/F/";
			cutOutputPath = "./img_split/F_Zone/";
			splitInputPath = cutOutputPath;
			splitOutputPath = "./img_split/F_Type/";
			break;
		}
	}
	
	private static void createDirectionsByType(String type) {
		File file = null; 
		
		file = new File(cutInputPath);
		if(!file.exists()) {
			file.mkdir();
		}
		file = new File(cutOutputPath);
		if(!file.exists()) {
			file.mkdir();
		}
		file = new File(splitOutputPath);
		if(!file.exists()) {
			file.mkdir();
		}
	}
	
	private static final String SPACE_IDENTIFY = "-";
	
	/*
	 * side, color, direction, type, pitch
	 */
	public static void cutAndRenameImages(List<String> fileList, String type, int cutType) {
		int index = 0;
		for(int pitchIndex = 0; pitchIndex < pitches.length; pitchIndex++) { // 12
			for(int colorIndex = 0; colorIndex < colors.length; colorIndex++) { // 4
				/*
				 * what a smart way to handle these problems
				 */
				String side = sides[colorIndex/2];
				String direction = directions[colorIndex % 2];
				String color = colors[colorIndex];
				String pitch = pitches[pitchIndex];
				String inputName = null;
				String outputName = null;
				if(cutType != CUT_TYPE_E) { 
					inputName = cutInputPath + fileList.get(index++); // WeChat Image_20191004112942.png
					outputName = cutOutputPath + side + color + direction + 
							type + pitch + ".png"; //LWUAB.png
System.out.println(outputName);
					cutImage(inputName, outputName, cutType);
				} else { //Space case
					for(int count = 0; count < LEVEL; count++) {
						inputName = cutInputPath + fileList.get(index++);
						outputName = cutOutputPath + side + color + direction + 
								type + pitch + SPACE_IDENTIFY + count + ".png";
System.out.println(outputName);
						cutImage(inputName, outputName, cutType);
					}
				}
			}
		}
	}
	
	private static String splitInputPath = null;
	private static String splitOutputPath = null;
	
	/*
	 * split image to different octaves
	 * name, underline, octave
	 * octave is number, so underline is necessary
	 * distinguish the characters and numbers or names
	 * fileList only records the name of files, without path
	 */
	public static void splitImages(List<String> fileList, int cutType) {
		String inputName = null;
    	for(int i = 0; i < fileList.size(); i++) {
    		System.out.println(fileList.get(i));
    		inputName = fileList.get(i);
    		if(cutType == CUT_TYPE_A) {
    			splitImage1(inputName);
    		} else if(cutType == CUT_TYPE_B) {
    			splitImage2(inputName);
    		} else if(cutType == CUT_TYPE_E) {
    			splitImage3(inputName);
    		}
    	}
	}
	
	public static void cutAndRenameAndSplitImages(String type, int cutType) {
		setPathByType(type);
    	createDirectionsByType(type);
    	cutAndRenameImages(getFilesName(cutInputPath), type, cutType);
    	splitImages(getFilesName(splitInputPath), cutType);
	}
	
    public static void main(String[] args) throws Exception {
    	
//    	cutAndRenameAndSplitImages("A", CUT_TYPE_A);
//    	cutAndRenameAndSplitImages("B", CUT_TYPE_B);
//    	cutAndRenameAndSplitImages("C", CUT_TYPE_C);
//    	cutAndRenameAndSplitImages("D", CUT_TYPE_D);
//    	cutAndRenameAndSplitImages("E", CUT_TYPE_E);
//    	cutAndRenameAndSplitImages("F", CUT_TYPE_F);
    	
    	/*
    	 * cut N type
    	 */
    	
    	/*
    	cutInputPath = "./img_split/N/";
		cutOutputPath = "./img_split/N_Zone/";
		splitInputPath = cutOutputPath;
		splitOutputPath = "./img_split/N_Type/";
    	createDirectionsByType("N");
    	*/

    	int x = 368;
    	int y = 494;
    	
	    /**********
	     * B Type *
	     **********/
//		int w = 247;
//		int h = 151;
//		cutInputPath = "./img_split/N/B.png";
//		cutOutputPath = "./img_split/N_Zone/B.png";
//		input = new FileInputStream(cutInputPath);
//		output = new FileOutputStream(cutOutputPath);
//    	cutPNG(input, output, x, y, w*3, h); //cut
//		for(int i = 0; i < 3; i++) {
//			splitInputPath = cutOutputPath;
//			splitOutputPath = "./img_split/N_Type/B" + i + ".png";
//			input = new FileInputStream(splitInputPath);
//			output = new FileOutputStream(splitOutputPath);
//			cutPNG(input, output, i*w, 0, w, h); //split
//		}

    	/**********
	     * C Type *
	     **********/
//		int w = 348;
//		int h = 151;
//		cutInputPath = "./img_split/N/C.png";
//		cutOutputPath = "./img_split/N_Zone/C.png";
//		input = new FileInputStream(cutInputPath);
//		output = new FileOutputStream(cutOutputPath);
//    	cutPNG(input, output, x, y, w*4, h);
//		for(int i = 0; i < 4; i++) {
//			splitInputPath = cutOutputPath;
//			splitOutputPath = "./img_split/N_Type/C" + i + ".png";
//			input = new FileInputStream(splitInputPath);
//			output = new FileOutputStream(splitOutputPath);
//			cutPNG(input, output, i*w, 0, w, h); //split
//		}
    	
	    /**********
	     * D Type *
	     **********/
//		int w = 432;
//		int h = 151;
//		cutInputPath = "./img_split/N/D.png";
//		cutOutputPath = "./img_split/N_Zone/D.png";
//		input = new FileInputStream(cutInputPath);
//		output = new FileOutputStream(cutOutputPath);
//    	cutPNG(input, output, x, y, w, h);
    	
	    /**********
	     * E Type *
	     **********/
//		int w = 1245;
//		int h = 151;
//		cutInputPath = "./img_split/N/E.png";
//		cutOutputPath = "./img_split/N_Zone/E.png";
//		input = new FileInputStream(cutInputPath);
//		output = new FileOutputStream(cutOutputPath);
//    	cutPNG(input, output, x, y, w, h);
		
		/**********
	     * F Type *
	     **********/
//		int w = 162;
//		int h = 318;
//		cutInputPath = "./img_split/N/F.png";
//		cutOutputPath = "./img_split/N_Zone/F.png";
//		input = new FileInputStream(cutInputPath);
//		output = new FileOutputStream(cutOutputPath);
//    	cutPNG(input, output, x, y, w*2, h);
//		for(int i = 0; i < 2; i++) {
//			splitInputPath = cutOutputPath;
//			splitOutputPath = "./img_split/N_Type/F" + i + ".png";
//			input = new FileInputStream(splitInputPath);
//			output = new FileOutputStream(splitOutputPath);
//			cutPNG(input, output, i*w, 0, w, h); //split
//		}
    	
    	/**********
	     * A Type *
	     **********/
    	
		int w = 162;
		int h = 152;
		cutInputPath = "./img_split/N/";
		cutOutputPath = "./img_split/N_Zone/";
		splitInputPath = cutOutputPath;
		splitOutputPath = "./img_split/N_Type/";
		
		List<String> names = getFilesName(cutInputPath); //fileName.png
		int index = 0;
		for(int i = 0; i < names.size(); i++) {
			String inputPath = cutInputPath + names.get(i);
			if(names.get(i).length() < 10) { //BCDEF.png, ignore other types
				continue;
			}
			input = new FileInputStream(inputPath);
			output = new FileOutputStream(cutOutputPath + "A" + index++ + ".png");
			cutPNG(input, output, x, y, w*9, h);
		}
		names = getFilesName(splitInputPath);
		for(int i = 0; i < names.size(); i++) {
			String inputPath = splitInputPath + names.get(i);
			if(!names.get(i).contains("A")) {
				continue;
			}
			for(int j = 0; j < 9; j++) {
				input = new FileInputStream(inputPath);
				output = new FileOutputStream(splitOutputPath + "A" + i + "" + j + ".png");
				cutPNG(input, output, j*w, 0, w, h);
			}
		}
    	
    	
    	/*
    	String inputName = "./img_split_test/A_Test.png";
    	String outputName = "./img_split_test/A_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_A);
    	splitImage1(outputName);
    	*/
    	/*
    	String inputName = "./img_split_test/B_Test.png";
    	String outputName = "./img_split_test/B_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_B);
    	splitImage2(outputName);
    	*/
    	/*
    	String inputName = "./img_split_test/C_Test.png";
    	String outputName = "./img_split_test/C_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_C);
    	splitImage2(outputName);
    	*/
    	/*
    	String inputName = "./img_split_test/D_Test.png";
    	String outputName = "./img_split_test/D_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_D);
    	splitImage2(outputName);
    	*/
    	/*
    	String inputName = "./img_split_test/E_Test.png";
    	String outputName = "./img_split_test/E_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_E);
    	splitImage3(outputName);
    	*/
    	/*
    	String inputName = "./img_split_test/F_Test.png";
    	String outputName = "./img_split_test/F_Test_Cut.png";
    	cutImage(inputName, outputName, CUT_TYPE_F);
    	splitImage1(outputName);
    	*/
    	
    }
    
    /*
     * Cut Image by different type, output name should be specified
     */
    private static void cutImage(String inputName, String outputName, int type) {
		try {
			input = new FileInputStream(inputName);
			output = new FileOutputStream(outputName);
			switch(type) {
			case CUT_TYPE_A :
				ImageUtils.cutPNG(input, output, LOCATION_X, LOCATION_Y, WIDTH*9, HEIGHT);
				break;
			case CUT_TYPE_B :
				ImageUtils.cutPNG(input, output, LOCATION_X, LOCATION_Y, WIDTH*3, HEIGHT*3);
				break;
			case CUT_TYPE_E :
				ImageUtils.cutPNG(input, output, LOCATION_X, LOCATION_Y, WIDTH, HEIGHT*3);
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    

    private static int rowValue = 0;
    private static int colValue = 0;
    private static final int COUNT = 8;
    
    /*
     * 1*9
     */
    private static void splitImage1(String inputName) {
    	y = x = rowValue = 0;
    	count = COUNT;
    	
    	for(int row = 0; row < LEVEL*3; row++) {
    		x = rowValue;
			String outputName = splitOutputPath + inputName.substring(0, inputName.indexOf(".png")) + "_" + count-- + ".png";
System.out.println("split : " + outputName);
			try {
				input = new FileInputStream(splitInputPath + inputName);
				output = new FileOutputStream(outputName);
				ImageUtils.cutPNG(input, output, x, y, WIDTH, HEIGHT);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			rowValue += WIDTH;
    	}
    }
    
    /*
     * 3*3
     */
    private static void splitImage2(String inputName) {
    	y = x = rowValue = colValue = 0;
    	count = COUNT;
    	
    	for(int col = 0; col < LEVEL; col++) {
    		y = colValue;
    		for(int row = 0; row < LEVEL; row++) {
    			x = rowValue;
    			/*
    			 * split right here
    			 */
    			String outputName = splitOutputPath + inputName.substring(0, inputName.indexOf(".png")) + "_" + count-- + ".png";
System.out.println("split : " + outputName);
    			try {
    				input = new FileInputStream(splitInputPath + inputName);
					output = new FileOutputStream(outputName);
					ImageUtils.cutPNG(input, output, x, y, WIDTH, HEIGHT);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
    			rowValue += WIDTH;
    		}
    		colValue += HEIGHT;
    		rowValue = 0;
    	}
    	colValue = 0;
    }
    
    /*
     * 3*1
     */
    private static void splitImage3(String inputName) {
    	y = x = colValue = 0;
    	if(count <= COUNT-LEVEL) {
    		count = COUNT;
    	}
    	for(int col = 0; col < LEVEL; col++) {
    		y = colValue;
			String outputName = splitOutputPath + inputName.substring(0, inputName.indexOf(SPACE_IDENTIFY)) + "_" + (count-LEVEL*col) + ".png";
System.out.println("split : " + outputName);
			try {
				input = new FileInputStream(splitInputPath + inputName);
				output = new FileOutputStream(outputName);
				ImageUtils.cutPNG(input, output, x, y, WIDTH, HEIGHT);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			colValue += HEIGHT;
    	}
    	count--;
    }
    
    /*
     * list all the file's name;
     */
    public static List<String> getFilesName(String path) {
    	List<File> files = sortFilesByModifyTime(path);
    	List<String> list = new ArrayList<>();
    	
    	for(int i = 0; i < files.size(); i++) {
    		list.add(files.get(i).getName());
    	}
    	
    	return list;
    }
    

    /*
     * reverse order
     */
    private static List<File> sortFilesByModifyTime(String path) {
        List<File> list = getFiles(path, new ArrayList<File>());
 
        if (list != null && list.size() > 0) {
            Collections.sort(list, new Comparator<File>() {
                public int compare(File file, File newFile) {
                    if (file.lastModified() < newFile.lastModified()) {
                        return -1;
                    } else if (file.lastModified() == newFile.lastModified()) {
                        return 0;
                    } else {
                        return 1;
                    }
 
                }
            });
 
        }
        
        return list;
    }
    
    private static List<File> getFiles(String realpath, List<File> files) {
        File realFile = new File(realpath);
        
        if (realFile.isDirectory()) {
            File[] subfiles = realFile.listFiles();
            for (File file : subfiles) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), files);
                } else {
                    files.add(file);
                }
            }
        }
        
        return files;
    }
    
}
