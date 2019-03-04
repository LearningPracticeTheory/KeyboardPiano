# Keyboard Piano

- **Keyboard Piano**, which is a music program based on **104-key** keyboard

- main implementation: **button banding, setting image, connecting audio**

- it's **NOT** a business project, just a project for **studying**


- ==How to run== ？？？？

- Bilibili Demo

---

# Versions

## v1.0 Build frame and add buttons

- **WindowBuilder Pro**
    1. it's used for the design of java GUI, you can add the plug-in into eclipse, which could make the design of GUI more convenient
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/pic1.jpg)

- **Layout**

    1. There are 3 LayoutManages are used on this project, which is `BorderLayout` `GroupLayout` `FormLayout`
    2. The last one should be import to the project, and eclipse would import it automatically, actually I removed(replaced) it on the next version, so basically, I just used the first two.  
    3. You can see more details in this link -> [Layout Manage](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/LayoutManage.md)
    
    
- **BUG**
    1. the overall layout is almost completed, but the program can **NOT** run, it's the mistakes of `FormLayout`. 
    2. The problem will be solve in next version

## v1.1 Replace FormLayout to GroupLayout

- replace all ~~FromLayout~~ to **GroupLayout**, then the program is runnable
- `JFrame.setResizable(false)` which is a deficiency，casue it's quite hard to use java to implement button self-adjustment
- anyway, **No need to be perfect**

## v1.1.1 Remove buttons

- Remove 4 buttons above the numpad
- The numpad_0 is wrong, which should not be split to two parts,
the problem would be solve in v1.2 

## v1.2 Rename buttons

- Rename the buttons by keyboard kes in the same location
- Also, solve the bug of v1.1.1, merge numpad_0

## v1.2.1 Button adjustment

- Extract the buttons as member variables, which is for better managing each components in the future version 
- I used **Manager Design Pattern** to manage components, so each components of the Keyboard Piano, such as Buttons and other member variables, should be reserved in the main class. it's a scientific way to manage components actually

## v1.2.2 Add vkCodes

- KeyEvent & vkCode
    1. I did a lots of test, it seems that the functions of `KeyListener` is quite limited. Ex, `KeyEvent`, which is the java key catch event, it can catch the different keys whether it's **pressed or released**, but, unfortunately, it couldn't indentify the repeat keys, such as **left and right Ctrl, Alt, Shift**, etc
    2. then I found out that `vkCode` is more useful, it can solve the problem of KeyEvent, but it need to import some jars to make sure that java can catch the key event from system. Anyway, it makes the implementation of function easier, and you can see the `vkCode value` from this link -> [Microsoft.Virtual-Key Codes](https://docs.microsoft.com/zh-cn/windows/desktop/inputdev/virtual-key-codes)

- vkCode constants
    1. I think I can use C++ function or class to find the constant, but I couldn't fint it yet, so I made it by my own, it just kind of repeat works. However, I found a useful way to make it easier

- The way to do the repeat works is using the machine to help 
    1. override `keyPressed` and **get key text** from `KeyEvent.getKey()`
    2. implements `callback` from `WinUser.LowLevelKeyboardProc` to catch **the value of virtual-key**
    3. see the main implement here -> [keyPressed & callback](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/keyPressed%26callback.md)

## v1.3 Button banding

- `LowLevelKeyboardProc` is Windows' API, it can catch the keyboard event, especially to catch and identify each key and combine keys, which is more useful and convenient.
- inorder to use/implement the interface, we need to **import two libraries**, you can download them from this link -> [jna-4.2.2.jar & jna-platform-4.2.2.jar](https://github.com/LearningPracticeTheory/KeyboardPiano/tree/master/referenced_libraries)
- `KBDLLHOOKSTRUCT.vkCode & flags` are the keys of catching and identifying the different keys
- construct `swichCase` for the next version

## v1.3.1 switchCase

- catch each case and identify the key when it's **pressed or released**
- the `vkCode` of **Enter** & **NumpadEnter** is same. However, the `flags` from `KBDLLHOOKSTRUCT` are different, in other words, we can identify them with `flags`

## v1.4 Config file & pic & wav

- Make image for buttons
    1. Naming conventions 
        1. There are **6 type** of keys on a 104-keys keyboard, each one of them has different size
        2. Use different colors to identify **the left side and the right side** buttons, also, press or release a button, the color should be different as well. So far, we need to make 4 different colors for each button. However, still, there is another case, the empty button, which is just a button on the Window, but do nothing while typing it. In other words, **5 colors** for each button is enough
        3. Pitch and Octave (click [Link](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/NamingConventions.md) to see more details)
    2. [How to make a image for buttons](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/md/ImageForButtons.md)

- Create pic.properties & wav.properties config files
    1. Create a program to initialize the config files [FileTmp](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/FileTmp.java)
    \
    it's also a way to simplify the development

## v1.4.1 [PropertiesManage](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/PropertiesManage.java)

- PropertiesManage use **Singleton Design Pattern**, to extract the information of config file, which is similar to the `Map<K, V>`, you can get the Value by a Key

## v1.5 [MyButton](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/MyButton.java)

- Get imagePaths & wavPaths from the PropertiesManage, it would search the key and return the paths

- SetImage is the key method which update the Up & down & wav at the same time, also, it would be used to change the image & wav of button in the future version


## v1.5.1 Replace JToggleButton to MyButton

- replace JToggleButton to MyButton, there is also a quick way to replace, which is regex (regular expression)
\
Ex, use "JToggleButtn\\(" to match all case, and replace by "MyButton\\("

- Override paintComponent(); to draw & set (pressed & released) images for buttons
\
`Graphics2D.fillRoundRect(0, 0, width, height, arc_widht, arc_height);`
\
this method could make the button more beautiful \^_^

    1. released
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/temp0.jpg)
    2. pressed
    \
    ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/temp1.jpg)

- **BUG**
    1. some buttons cannot display
    2. Brown buttons cannot display nomrally

## v1.5.2 Modify config file

- Brown button
\
Use the same image to set the image of button whether is pressed or released

- **BUG**
    1. the problem of **NumLock** when it's on or off
    2. other buttons cannot be pressed when **Alt** is pressed

## v1.5.3 MouseMonitor

- `mousePressed` -> `button.setSelected(true);`
- `mouseReleased` & `mouseExisted` -> `button.setSelected(false);`

## v1.6 MusicPlayer correction

- `File.renameTo(new File(newPath));` with `swapWav(path);`
- actually it's my mistake at the beginning. Anyway, [use program to correct it](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/src/FileTmp.java) 

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

- after typed Alt, the vkCode of button is change, whether is **pressed or released**
\
catch each `flags` from the `event`

## v1.6.2 NumLock Debug

- similar bug as v1.6.1

## v1.6.3 ALt & NumLock Debug

- solution similar to v1.6.1 & v1.6.2

## v1.7 Code adjustment



