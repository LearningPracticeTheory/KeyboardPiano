## How to make a image for buttons

- Download an ImageMagick, use `convert` command with `-crop` argument to split the images
    1. `convert` image `-crop` width**x**height+x+y subImages
    \
    Split the image with the size width and height at (x, y), (note: width and height is connected with the letter 'x')
    \
    Ex: **convert SLGDA.jpg -crop 1476x151+366+494 SLGDA1.jpg**

        1. the original image
        \
        ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/SLGDA.jpg)
    
        2. command line for splitting images
        \
        ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/convert1.jpg)
        
        3. result
        \
        ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/SLGDA1.jpg)    

    2. `convert` image `-crop` width**x**height subImages
    \
    Split the image with the size width and height into several sub-images
    
        1. the source in direction
        \
        ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/convert2.jpg)

        2. Ex: **convert SLGDA1.jpg -crop 164x151 SLGDA1.jpg**
        \
        ![image](https://github.com/LearningPracticeTheory/KeyboardPiano/blob/master/image_for_github/convert4.jpg)
        