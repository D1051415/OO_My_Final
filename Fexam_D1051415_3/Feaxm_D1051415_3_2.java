import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Feaxm_D1051415_3_2 {

    public static BufferedImage getBufferedImage(String fileUrl) throws IOException {
        File f = new File(fileUrl);
        return ImageIO.read(f);
    }

    public static boolean saveImage(BufferedImage savedImg, String saveDir, String fileName, String format) {
        boolean flag = false;

        // 先檢查保存的圖片格式是否正確
        String[] legalFormats = { "bmp", "bmp", "png", "PNG", "bmp", "BMP" };
        int i = 0;
        for (i = 0; i < legalFormats.length; i++) {
            if (format.equals(legalFormats[i])) {
                break;
            }
        }
        if (i == legalFormats.length) { // 圖片格式不支持
            return false;
        }

        // 再檢查文件後綴和保存的格式是否一致
        String postfix = fileName.substring(fileName.lastIndexOf('.') + 1);
        if (!postfix.equalsIgnoreCase(format)) {
            return false;
        }

        String fileUrl = saveDir + fileName;
        File file = new File(fileUrl);
        try {
            flag = ImageIO.write(savedImg, format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public static BufferedImage mergeImage(boolean isHorizontal, BufferedImage img1, BufferedImage img2)
            throws IOException {
        int w1 = img1.getWidth();
        int h1 = img1.getHeight();
        int w2 = img2.getWidth();
        int h2 = img2.getHeight();

        // 從圖片中讀取RGB
        int[] ImageArrayOne = new int[w1 * h1];
        ImageArrayOne = img1.getRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 逐行掃描圖像中各個像素的RGB到數組中
        int[] ImageArrayTwo = new int[w2 * h2];
        ImageArrayTwo = img2.getRGB(0, 0, w2, h2, ImageArrayTwo, 0, w2);

        // 生成新圖片
        BufferedImage DestImage = null;
        if (isHorizontal) { // 水平方向合併
            DestImage = new BufferedImage(w1 + w2, h1, BufferedImage.TYPE_INT_RGB);
            DestImage.setRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 設置上半部分或左半部分的RGB
            DestImage.setRGB(w1, 0, w2, h2, ImageArrayTwo, 0, w2);
        } else { // 垂直方向合併
            DestImage = new BufferedImage(w1, h1 + h2, BufferedImage.TYPE_INT_RGB);
            DestImage.setRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 設置上半部分或左半部分的RGB
            DestImage.setRGB(0, h1, w2, h2, ImageArrayTwo, 0, w2); // 設置下半部分的RGB
        }

        return DestImage;
    }

    public static BufferedImage mergeImage(boolean isHorizontal, BufferedImage... imgs) throws IOException {
        // 生成新圖片
        BufferedImage DestImage = null;

        // 計算新圖片的長和高
        int allw = 0, allh = 0, allwMax = 0, allhMax = 0;
        for (BufferedImage img : imgs) {
            allw += img.getWidth();
            allh += img.getHeight();
            if (img.getWidth() > allwMax) {
                allwMax = img.getWidth();
            }
            ;
            if (img.getHeight() > allhMax) {
                allhMax = img.getHeight();
            }
            ;
        }
        // 創建新圖片
        if (isHorizontal) {
            DestImage = new BufferedImage(allw, allhMax, BufferedImage.TYPE_INT_RGB);
        } else {
            DestImage = new BufferedImage(allwMax, allh, BufferedImage.TYPE_INT_RGB);
        }

        // 合併所有子圖片到新圖片
        int wx = 0, wy = 0;
        for (int i = 0; i < imgs.length; i++) {
            BufferedImage img = imgs[i];
            int w1 = img.getWidth();
            int h1 = img.getHeight();
            // 從圖片中讀取RGB
            int[] ImageArrayOne = new int[w1 * h1];
            ImageArrayOne = img.getRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 逐行掃描圖像中各個像素的RGB到數組中
            if (isHorizontal) { // 水平方向合併
                DestImage.setRGB(wx, 0, w1, h1, ImageArrayOne, 0, w1); // 設置上半部分或左半部分的RGB
            } else { // 垂直方向合併
                DestImage.setRGB(0, wy, w1, h1, ImageArrayOne, 0, w1); // 設置上半部分或左半部分的RGB
            }
            wx += w1;
            wy += h1;
        }
        return DestImage;
    }

    public static void main(String[] args) throws Exception {
        String path = "abraham_lake.bmp";
        String desc = "flip1.bmp";
        FileInputStream in = new FileInputStream(new File(path));
        // 讀取圖片
        BufferedImage bufImage = ImageIO.read(in);
        int height = bufImage.getHeight();
        int width = bufImage.getWidth();

        // 讀取出圖片的所有像素
        int[] rgbs = bufImage.getRGB(0, 0, width, height, null, 0, width);

        try {// 對圖片的像素矩陣進行水平鏡像
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width / 2; col++) {
                    int temp = rgbs[row * width + col];
                    rgbs[row * width + col] = rgbs[row * width + (width - 1 - col)];
                    rgbs[row * width + (width - 1 - col)] = temp;
                }
            }
            // 把水平鏡像後的像素矩陣設置回bufImage
            bufImage.setRGB(0, 0, width, height, rgbs, 0, width);
            // 把修改過的bufImage 保存到本地
            ImageIO.write(bufImage, "bmp", new File(desc));
            System.out.println("翻轉成功!");

        } catch (IOException e) {
            System.out.println("翻轉失敗!");
            e.printStackTrace();
        }

        // 讀取待合併的文件
        BufferedImage bi1 = null;
        BufferedImage bi2 = null;
        try {
            bi1 = getBufferedImage(path);
            bi2 = getBufferedImage(desc);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 調用mergeImage方法獲得合併後的圖像
        BufferedImage destImg = null;
        // try {
        //     destImg = mergeImage(false, bi1, bi2); //false是垂直方向合併
        //     saveImage(destImg, "", "flip_merge.bmp", "bmp");
        //     System.out.println("合併成功!");
        // } catch (IOException e) {
        //     System.out.println("合併失敗!");
        //     e.printStackTrace();
        // }

        // 保存圖像
        try {
            bi1 = getBufferedImage(path);
            bi2 = getBufferedImage(desc);
        } catch (IOException e) {
            System.out.println("Something happend!");
            e.printStackTrace();
        }

        // 調用mergeImage方法獲得合併後的圖像
        try {
            destImg = mergeImage(true, bi1, bi2);//true 是水平方向合併
            // 保存圖像
            saveImage(destImg, "", "flip_merge.bmp", "bmp");
            System.out.println("合併成功!");
        } catch (IOException e) {
            System.out.println("合併失敗!");
            e.printStackTrace();
        }
    }
}