import cv2
color_img=cv2.imread("330.jpg")
gray_img=cv2.imread("330.jpg",cv2.IMREAD_GRAYSCALE)
cv2.namedWindow("image")
cv2.imshow("image",color_img)
cv2.waitKey(5000)
cv2.destroyAllWindows()


cv2.imshow("image",gray_img)
cv2.waitKey(5000)
cv2.destroyAllWindows()