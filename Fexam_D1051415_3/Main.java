import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public  class Main {

    public  static  void main(String[] args) throws Exception {
         // TODO Auto-generated method stub 
        
        String path ="abraham_lake.bmp" ;
        String desc ="copy.bmp" ;
        FileInputStream in = new FileInputStream( new File(path));
         //讀取圖片
        BufferedImage bufImage = ImageIO.read(in);
        int height= bufImage.getHeight();
        int width= bufImage.getWidth();
        
         //讀取出圖片的所有像素
        int [] rgbs = bufImage.getRGB(0, 0, width, height, null , 0 , width);

        //對圖片的像素矩陣進行水平鏡像
        for ( int row = 0; row < height; row++ ) {
             for ( int col = 0; col < width / 2; col++ ) {
                 int temp = rgbs[row * width + col];
                rgbs[row * width + col] = rgbs[row * width + (width - 1 - col)];
                rgbs[row * width + (width - 1 - col)] = temp;
            }
        }
        //把水平鏡像後的像素矩陣設置回bufImage 
        bufImage.setRGB(0, 0, width, height, rgbs, 0 , width);

        //把修改過的bufImage 保存到本地
        ImageIO.write(bufImage, "bmp", new File(desc));
        
    }

}