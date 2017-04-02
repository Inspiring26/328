import cv2
capture = cv2.VideoCapture("test.mp4")

if capture.isOpened():
	while True:
		ret,prev=capture.read()
		if ret==True:
			cv2.imshow("video",prev)
		else:
			break
		if cv2.waitKey(20)==27:
			break

