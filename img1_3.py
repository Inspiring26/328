import cv2.cv as cv

capture=cv.CaptureFromCAM(0)
temp=cv.QueryFrame(capture)
writer=cv.CreateVideoWriter("output.avi",cv.CV_FOURCC('D', 'I', 'V', 'X'),15,cv.GetSize(temp),1)
count=0
while count<50:
	print count
	image=cv.QueryFrame(capture)
	cv.WriteFrame(writer,image)
	cv.ShowImage("image_windows",image)
	cv.WaitKey(1)
	count+=1
