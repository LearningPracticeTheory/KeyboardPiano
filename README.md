# Keyboard Piano

- **Keyboard Piano** is a music program based on **104-key** keyboard

- Main implementation: **banding buttons, setting images, connecting audio**

- This is **NOT** a business project, just a project for **STUDYING**

- How to run the program
    1. First of all, you need **JDK**
    2. Download [KeyboardPiano.jar](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/KeyboardPiano.jar)
    3. **Click to run** or use command line: `java -jar KeyboardPiano.jar`

- Bilibili Demo ++Waiting for update++

- GUI

    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/KeyboardPianoFrame0.jpg)

    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/KeyboardPianoFrame1.jpg)

- Copyright Warning
    1. As the idea for this project not mine, it may present copyright issues
    2. I have contacted the person in charge
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/copyright.png)
    3. Anyway, I can post it to github and **open source** now \^_^

---

# Future Version

- **Analysis**
    1. The program blocks the key input of the system even if it's running on the background, so the system input can **NOT** work while the program is running
    2. Button properties are limited and cannot be changed unless the source code is modified
    3. Thread issues
    \
    Clicking on each button will run a thread, but it won't be interrupted when it is completed, so as the number of clicks increase, the memory will increase linearly

- **Implementation**
    1. Listen to `JFrame.isFocus` and `notfiy` or `wait` when it's either `true` or `false`
    2. Expand a list for the button by right clicking, and use `Button.setImage()` to modify the properties 
    3. Interrupt `MusicPlayer` when it's done. **HOW???**

- **BUG**
    1. **Ctrl & Shift & NumLock & Numpad** conflict
    \
    but **Alt** is correct now. Tt can be a model for correction, which catches different vkCode values & flags them when it's pressed or released

---

# Past Versions

## v1.0 Build Frame and Add Buttons

- **WindowBuilder Pro**
    1. Used for the design of java GUI, WindowBuilder Pro can add the plug-in into eclipse, which could make the design of GUI more convenient
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/pic1.jpg)

- **Layout**

    1. There are 3 Layout Managers used for this project: `BorderLayout` `GroupLayout` and `FormLayout`
    2. `FormLayout` should be imported to the project, and eclipse would import it automatically (I will remove it on the next version so technically, only the first two were used)
    3. You can see more details at this link -> [Layout Manager](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/LayoutManage.md)
    
    
- **BUG**
    1. The overall layout is almost complete, but the program can **NOT** run due to mistakes in `FormLayout`
    2. The issue will be solved in the next version

## v1.1 Replace FormLayout to GroupLayout

- Replace all ~~FromLayout~~ to **GroupLayout**, then the program is able to run
- `JFrame.setResizable(false)` is a deficiency becuase it's quite hard to use java to implement button self-adjustment
- **No need to be perfect**, however

## v1.1.1 Remove Buttons

- Remove the 4 buttons above the numpad
- numpad_0 is wrong as it should not be split to two parts.
The issue would be solved in v1.2 

## v1.2 Rename Buttons

- Rename the buttons to corresponding keyboard keys
- Solve the bug from v1.1.1 and merge numpad_0

## v1.2.1 Button adjustment

- Extract the buttons as member variables for better management of components in the future version 
- **Manager Design Pattern** was used to manage components, so each component of the Keyboard Piano (such as Buttons and other member variables) should be reserved in the main class. It's a more scientific way to manage components 

## v1.2.2 Add vkCodes

- KeyEvent & vkCode
    1. Multiple tests were conducted and it seems that the functions of `KeyListener` are quite limited. Ex, `KeyEvent`, which is the java key catch event can catch the different keys whether it's **pressed or released**. Unfortunately, it cannot indentify the repeat keys such as **left and right Ctrl, Alt, Shift**, etc.
    2. `vkCode` is more useful.  It can solve the problems of KeyEvent, but it needs to import additoinal .jar files to ensure that java can catch the key event from the system. It makes the implementation of function easier, and seen from the `vkCode value` at this link -> [Microsoft.Virtual-Key Codes](https://docs.microsoft.com/zh-cn/windows/desktop/inputdev/virtual-key-codes)

- vkCode constants
    1. C++ function or class can be used to find the constant, but it has not been found yet, so one has been created.  However, there is another, easier method

- The way to do the repeat works is using the machine to help 
    1. Override `keyPressed` and **get key text** from `KeyEvent.getKey()`
    2. Implement `callback` from `WinUser.LowLevelKeyboardProc` to catch **the value of virtual-key**
    3. See the main implementation here -> [keyPressed & callback](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/keyPressed%26callback.md)

## v1.3 Button Banding

- `LowLevelKeyboardProc` is Windows' API, can catch the keyboard event, and is convenient for catching/identifying each key and combining keys.
- In order to use/implement the interface, we need to **import two libraries**.  They can be downloaded from this link -> [jna-4.2.2.jar & jna-platform-4.2.2.jar](https://github.com/LearningPracticeTheory/KeyboardPiano/tree/master/referenced_libraries)
- `KBDLLHOOKSTRUCT.vkCode & flags` are the keys for catching and identifying the different keys
- Construct `swichCase` for the next version

## v1.3.1 switchCase

- Catch each case and identify the key when it's **pressed or released**
- The `vkCode` for **Enter** & **NumpadEnter** is the same. However, the `flags` from `KBDLLHOOKSTRUCT` are different, in other words, we can identify them using `flags`

## v1.4 Config file & pic & wav

- Make image for buttons
    1. Naming conventions 
        1. There are **6 types** of keys on a 104-key keyboard, each one of them has different size
        2. Use different colors to identify **the left and the right side** buttons. When a button is pressed or released, the color should change. So far, 4 different colors are needed to be made for each button. However, there is another case, the empty button, which is just a button on the Window, but does nothing when typed. In other words, **5 colors** for each button is enough
        3. Pitch and Octave (click [Link](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/NamingConventions.md) to see more details)
    2. [How to make a image for buttons](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/ImageForButtons.md)

- Create [pic.properties & wav.properties](https://github.com/LearningPracticeTheory/KeyboardPiano/tree/master/src/config) config files
    1. Create a program to initialize the config files [FileTmp](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/FileTmp.java)
    \
    It's also a way to simplify the development

## v1.4.1 [PropertiesManage](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/PropertiesManage.java)

- `PropertiesManage` use **Singleton Design Pattern** to extract the information of config files, which is similar to the `Map<K, V>`, you can use to get the Value with a Key

## v1.5 [MyButton](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/MyButton.java)

- Get `imagePaths & wavPaths` from the `PropertiesManage` to search for keys and return the paths

- `setImage` is the key method which updates the **Up & down & wav** at the same time.  Also, it can be used to change the **image & wav** of buttons in the future version


## v1.5.1 Replace JToggleButton to MyButton

- Replace ~~JToggleButton~~ to **MyButton**. There is also a quick way accomplish this: using **regex** (regular expression)
\
Ex, use `JToggleButtn\(` to match all cases, and replace by `MyButton\(`

- Override `paintComponent()` to draw & set (pressed & released) images for buttons
\
`Graphics2D.fillRoundRect(0, 0, width, height, arc_widht, arc_height);`
\
This method could make the buttons more beautiful \^_^

    1. released
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/temp0.jpg)
    2. pressed
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/temp1.jpg)

- **BUG**
    1. Some buttons are not displayed
    2. Brown buttons cannot be displayed nomrally

## v1.5.2 Modify config file

- Brown button
\
Use the same image to set the image of buttons whether is pressed or released

- **BUG**
    1. The issue of **NumLock** when it's either on or off
    2. Other buttons cannot be pressed when **Alt** is pressed

## v1.5.3 MouseMonitor

- `mousePressed` -> `button.setSelected(true);`
- `mouseReleased` & `mouseExisted` -> `button.setSelected(false);`

## v1.6 MusicPlayer correction

- `File.renameTo(new File(newPath));` with `swapWav(path);`
- Actually it's my mistake at the beginning
- [Use program to correct it](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/FileTmp.java) 

original(Error) | actual(Correct)
---|---
0 | 8
1 | 7
2 | 6
3 | 5
4 (center) | 4 (correct)
5 | 3
6 | 2
7 | 1
8 | 0

## v1.6.1 Alt Debug

- After typing **Alt**, the vkCode of buttons changed, whether it is **pressed or released**
\
Catch each `flags` from the `event`

## v1.6.2 NumLock Debug

- Similar bug to v1.6.1

## v1.6.3 ALt & NumLock Debug

- Solution similar to v1.6.1 & v1.6.2

## v1.7 Code adjustment

- doc & jar

