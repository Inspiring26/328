import cv2

img_color=cv2.imread("401.jpg")
img_gray=cv2.cvtColor(img_color,cv2.COLOR_BGR2GRAY)

cv2.imshow("img_color",img_color)
cv2.waitKey(3000)

cv2.imshow("img_gray",img_gray)
cv2.waitKey(3000)

retval,img_bin=cv2.threshold(img_gray,50,255,cv2.THRESH_BINARY)
cv2.imshow("img_bin",img_bin)
cv2.waitKey(3000)

cv2.destroyAllWindows()