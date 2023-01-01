import java.util.Scanner;
import java.io.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Fexam_D1051415_3_1 {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		String path = "C:/Users/User/Desktop/"; // Path of the image files.
		String sourName; // Source image file name.
		String destName; // Copied image file name.
		int count = 0;
		System.out.print("Enter the source image file name: ");
		sourName = sn.next();

		System.out.print("Enter the copied image file name: ");
		destName = sn.next();

		System.out.println("==========================================================");

		BitmapImage image = new BitmapImage(); // Create a bitmap image object.

		try {
			// Read the source image.
			// Print the file header and image information of the source image.
			image.set(path, sourName);
			image.set2(path, sourName);
			count++;
		} catch (Exception ex) {
			// Print the stack trace, if exception occurs.
			// System.out.println(">>>>>>>>>>> Something Happend ! <<<<<<<<<<<\n>>>>>>>>>>>
			// The following is the error <<<<<<<<<<<\n");
			System.out.println("Not found the file!");
			ex.printStackTrace();
		}

		if (count != 0)
		{
			try {
				image.gimgfname();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gtype();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gsize();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.greserved();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.goffsetBits();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.ginformationsize();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gwidth();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gheight();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gplanes();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gbitcount();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gcompression();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			try {
				image.gsizeimage();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gxpm();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gypm();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gclrimp();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gclrimp();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			// copied.bmp
			System.out.println("==========================================================");
			try {
				copyByImageIO(path + sourName, path + destName);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			try {
				image.set(path, destName);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gimgfname();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gtype();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gsize();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.greserved();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.goffsetBits();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.ginformationsize();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gwidth();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gheight();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gplanes();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gbitcount();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gcompression();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			try {
				image.gsizeimage();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gxpm();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gypm();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gclrimp();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				image.gclrimp();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		sn.close();
	}

	public static void copyByImageIO(String sourcePath, String targetPath) throws Exception {
		try {
			File input = new File(sourcePath);
			BufferedImage bim = ImageIO.read(input);
			File output = new File(targetPath);
			ImageIO.write(bim, "bmp", output);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	// Define BitmapImage is a static inner class.
	// or import BitmapImage class
	public static class BitmapImage {
		String fp = "";
		String fp2 = "";
		public int nsize;
		public int ninformationsize;
		public int nwidth;
		public int nheight;
		public int nplanes;
		public int nbitcount;
		public int ncompression;
		public int nsizeimage;
		public int nxpm;
		public int nypm;
		public int nclrused;
		public int nclrimp;
		public FileInputStream fs;

		int bflen = 14; // 14 byte BITMAPFILEHEADER
		byte bf[] = new byte[bflen];
		int bilen = 40; // 40-byte BITMAPINFOHEADER
		byte bi[] = new byte[bilen];

		public void set(String path, String sourName) throws IOException {
			File filepath = new File(path + sourName);
			fp = filepath.getCanonicalPath();
		}

		public String get() throws IOException {
			return fp;
		}

		public void set2(String path, String sourName) throws IOException {
			fs = new FileInputStream(new File(path + sourName));
			fs.read(bf, 0, bflen);
			fs.read(bi, 0, bilen);
		}

		public void gimgfname() throws IOException {
			System.out.println("Image file name: " + get());
		}

		public void gtype() throws IOException {
			System.out.println("Type: " + (char) bf[0] + (char) bf[1]);
		}

		public void gsize() throws IOException {
			nsize = constructInt(bf, 2);
			System.out.println("Size: " + nsize);
		}

		public void greserved() throws IOException {
			System.out.println("Reserved: " + constructInt(bf, 6) + " (保留欄位)");
		}

		public void goffsetBits() throws IOException {
			System.out.println("OffsetBits: " + constructInt(bf, 10));
		}

		public void ginformationsize() throws IOException {
			ninformationsize = constructInt(bi, 0);
			System.out.println("Information size: " + ninformationsize);
		}

		public void gwidth() throws IOException {
			nwidth = constructInt(bi, 4);
			System.out.println("Image width: " + nwidth);
		}

		public void gheight() throws IOException {
			nheight = constructInt(bi, 8);
			System.out.println("Image height: " + nheight);
		}

		public void gplanes() throws IOException {
			nplanes = constructShort(bi, 12); // (((int)bi[13]&0xff)<<8) |
			// (int)bi[12]&0xff;
			System.out.println("Image planes: " + nplanes);
		}

		public void gbitcount() throws IOException {
			nbitcount = constructShort(bi, 14); // (((int)bi[15]&0xff)<<8) |
			// (int)bi[14]&0xff;
			System.out.println("Bit per pixel: " + nbitcount);
		}

		public void gcompression() throws IOException {
			ncompression = constructInt(bi, 16);
			System.out.println("Compression: " + ncompression);
		}

		public void gsizeimage() throws IOException {
			nsizeimage = constructInt(bi, 20);
			System.out.println("Image Size: " + nsizeimage);
		}

		public void gxpm() throws IOException {
			nxpm = constructInt(bi, 24);
			// nxpm = (((int) bi[27] & 0xff) << 24)
			// | (((int) bi[26] & 0xff) << 16)
			// | (((int) bi[25] & 0xff) << 8)
			// | (int) bi[24] & 0xff;
			System.out.println("Horizontal resolution: " + nxpm);
		}

		public void gypm() throws IOException {
			nypm = constructInt(bi, 28);
			// nypm = (((int) bi[31] & 0xff) << 24)
			// | (((int) bi[30] & 0xff) << 16)
			// | (((int) bi[29] & 0xff) << 8)
			// | (int) bi[28] & 0xff;
			System.out.println("Horizontal resolution: " + nypm);
		}

		public void gclrused() throws IOException {
			nclrused = constructInt(bi, 32);
			System.out.println("Colors indices: " + nclrused);
		}

		public void gclrimp() throws IOException {
			nclrimp = constructInt(bi, 36);
			System.out.println("Important Colors: " + nclrimp);
		}

		// public void readd() throws IOException {
		// fs.read(bf, 0, bflen);
		// fs.read(bi, 0, bilen);

		// // File path
		// System.out.println("Image file name: " + get());

		// // Interperet data.
		// nsize = constructInt(bf, 2);
		// System.out.println("Type: " + (char) bf[0] + (char) bf[1]);
		// System.out.println("Size: " + nsize);

		// // Reserved
		// System.out.println("Reserved: " + constructInt(bf, 6) + " (保留欄位)");

		// // Offsetbits
		// System.out.println("OffsetBits: " + constructInt(bf, 10));

		// // Information size
		// ninformationsize = constructInt(bi, 0);
		// System.out.println("Information size: " + ninformationsize);

		// // int nbisize = constructInt(bi, 2 );
		// // System.out.println("Size of bitmapinfoheader is: "+nbisize);

		// nwidth = constructInt(bi, 4);
		// System.out.println("Image width: " + nwidth);

		// nheight = constructInt(bi, 8);
		// System.out.println("Image height: " + nheight);

		// nplanes = constructShort(bi, 12); // (((int)bi[13]&0xff)<<8) |
		// // (int)bi[12]&0xff;
		// System.out.println("Image planes: " + nplanes);

		// nbitcount = constructShort(bi, 14); // (((int)bi[15]&0xff)<<8) |
		// // (int)bi[14]&0xff;
		// System.out.println("Bit per pixel: " + nbitcount);

		// // Look for non-zero values to indicate compression
		// ncompression = constructInt(bi, 16);
		// System.out.println("Compression: " + ncompression);

		// nsizeimage = constructInt(bi, 20);
		// System.out.println("Image Size: " + nsizeimage);

		// nxpm = constructInt(bi, 24);
		// // nxpm = (((int) bi[27] & 0xff) << 24)
		// // | (((int) bi[26] & 0xff) << 16)
		// // | (((int) bi[25] & 0xff) << 8)
		// // | (int) bi[24] & 0xff;
		// System.out.println("Horizontal resolution: " + nxpm);

		// nypm = constructInt(bi, 28);
		// // nypm = (((int) bi[31] & 0xff) << 24)
		// // | (((int) bi[30] & 0xff) << 16)
		// // | (((int) bi[29] & 0xff) << 8)
		// // | (int) bi[28] & 0xff;
		// System.out.println("Vertical Resolution: " + nypm);

		// nclrused = constructInt(bi, 32);
		// System.out.println("Colors indices: " + nclrused);

		// nclrimp = constructInt(bi, 36);
		// System.out.println("Important Colors: " + nclrimp);
		// }

		public static int constructInt(byte[] in, int offset) {
			int ret = ((int) in[offset + 3] & 0xff);
			ret = (ret << 8) | ((int) in[offset + 2] & 0xff);
			ret = (ret << 8) | ((int) in[offset + 1] & 0xff);
			ret = (ret << 8) | ((int) in[offset + 0] & 0xff);
			return (ret);
		}

		public static short constructShort(byte[] in, int offset) {
			short ret = (short) ((short) in[offset + 1] & 0xff);
			ret = (short) ((ret << 8) | (short) ((short) in[offset + 0] & 0xff));
			return (ret);
		}
	}
}