import cv2
import cv2.cv as cv
color_img=cv2.imread("330.jpg")
gray_img=cv2.cvtColor(color_img,cv2.COLOR_BGR2GRAY)

cv2.imshow("image1",color_img)
cv2.waitKey(3000)

cv2.imshow("image2",gray_img)
cv2.waitKey(3000)

retval, im_at_fixed = cv2.threshold(gray_img, 50, 255, cv2.THRESH_BINARY) 
cv2.imshow("stable",im_at_fixed)

cv2.waitKey(3000)

cv2.destroyAllWindows()