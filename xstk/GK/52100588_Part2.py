
###---------------chapter 2 Histogram equalization algorithm-----------
import cv2
from matplotlib import pyplot as plt
import numpy as np
import os
# hàm read ảnh
def read_images(path=None):
    images = []
    if path == None:
        path = os.getcwd()  #lấy đường dẫn ảnh
    for i in os.listdir(path):  #chạy từng đường dẫn ảnh
        if ".jpg" in i or ".png" in i or ".jpeg" in i:  #nếu đường dẫn thuộc các đuôi jpg, png, jpeg
            img = cv2.cvtColor(cv2.imread(os.path.join(path, i)), cv2.COLOR_BGR2GRAY)   
            images.append(img)  #lưu ảnh vào list images
    return images
#hàm biểu đồ thể hiện hiệu quả cải thiện ảnh
def plot_hist(image, equalised, count):
    fig, axes = plt.subplots(2, 1)
    axes[0].hist(image.flatten(), 256, [0, 256])
    axes[0].set_title("Before")
    axes[1].hist(equalised.flatten(), 256, [0, 256])
    axes[1].set_title("After")
   
#hàm cải thiện độ tương phản ảnh
def hist_equaliser(images):
    equalised_image = []
    for i in images:
        equalised_image.append(cv2.equalizeHist(i))
    return equalised_image
#hàm show ảnh 
def show_images(images, equalised):
    count = 0
    for img1, img2 in zip(images, equalised):
        plot_hist(img1, img2, count)
        cv2.imshow("Images", np.hstack((img1, img2)))
        plt.show()
        cv2.waitKey(0)

if __name__ == '__main__':
    images = read_images()
    equalised = hist_equaliser(images)
    show_images(images, equalised)