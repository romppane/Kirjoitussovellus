package RoniCorp.kirjoitin.model;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class ImageConverter {
	
	
	public String ImageToBase64(String file_path) {
		char c = ' ';
		String format = "";
		int index = file_path.length()-1;
		BufferedImage b_image = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			b_image = ImageIO.read(new File(file_path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//loop the string till '.' is found and append the string, then reverse the whole thing once loop ends.
		while (c != '.') {
			c = file_path.charAt(index);
			if(c != '.') {
				format += c;
				index -= 1;
			}
		}
		StringBuilder sb = new StringBuilder(format);
		format = sb.reverse().toString();
		
		System.out.println(format);
		try {
			ImageIO.write(b_image, format, baos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Base64.getEncoder().encodeToString(baos.toByteArray());
	}
	
	
	
	public BufferedImage Base64ToImage(String base64) {
		byte[] img = Base64.getDecoder().decode(base64);
		ByteArrayInputStream bais = new ByteArrayInputStream(img);
		BufferedImage b_image = null;
		
		try {
			b_image = ImageIO.read(bais);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b_image;
	}

}
