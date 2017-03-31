import cv2
import cv2.cv as cv
import time
color_img=cv2.imread("330.jpg")
gray_img=cv2.cvtColor(color_img,cv2.COLOR_BGR2GRAY)

#cv2.imshow("image1",color_img)
#cv2.waitKey(5000)
#cv2.destroyAllWindows()


#cv2.imshow("image2",gray_img)
#cv2.waitKey(5000)
#cv2.destroyAllWindows()

bin_img=cv2.adaptiveThreshold(gray_img, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 5, 10)
#cv2.imshow("suansu",bin_img)
#cv2.waitKey(5000)

gaus_img = cv2.adaptiveThreshold(gray_img, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 5, 7)
#cv2.imshow("gaus",gaus_img)
#cv2.waitKey(5000)


retval, im_at_fixed = cv2.threshold(gray_img, 50, 255, cv2.THRESH_BINARY) 
cv2.imshow("stable",im_at_fixed)
cv2.waitKey(3000)

'''
capture = cv2.VideoCapture("test.mp4")
 
if capture.isOpened():
    while True:
        ret, prev = capture.read()
        if ret==True:
            cv2.imshow('video', prev)
        else:
            break
        if cv2.waitKey(20)==27:
            break

'''
'''
import numpy as np

cap = cv2.VideoCapture(0)
while(1):
    # get a frame
    ret, frame = cap.read()
    # show a frame
    cv2.imshow("capture", frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
cap.release()
'''





cv2.destroyAllWindows()







