/*
*  Copyright 2019 Accenture. All Rights Reserved.
*  The trademarks used in these materials are the properties of their respective owners.
*  This work is protected by copyright law and contains valuable trade secrets and
*  confidential information.
*/
package com.boomi.util;

import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * 
 * @author kritika.b.verma
 *
 */
public class ImageToByteArray {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
   public static  byte [] readImage() throws Exception{

      //File file =  new ImageToByteArray().getFileFromResources("nautilus.jpg");
      ClassLoader classloader = Thread.currentThread().getContextClassLoader();
      InputStream inputStream = classloader.getResourceAsStream("nautilus.jpg");

      BufferedImage bImage = ImageIO.read(inputStream);
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      ImageIO.write(bImage, "jpg", bos );
      byte [] data = bos.toByteArray();
      return data;
   }
/**
 * 
 * @param data
 * @throws Exception
 */
   public static void createImage(byte[] data) throws Exception {
      ByteArrayInputStream bis = new ByteArrayInputStream(data);
      BufferedImage bImage2 = ImageIO.read(bis);
      ImageIO.write(bImage2, "jpg", new File("c:/tmp/output.jpg") );
      System.out.println("image created");
   }

  /**
   * 
   * @param fileName
   * @return
   */
   private File getFileFromResources(String fileName) {

      ClassLoader classLoader = getClass().getClassLoader();

      URL resource = classLoader.getResource(fileName);
      if (resource == null) {
         throw new IllegalArgumentException("file is not found!");
      } else {
         return new File(resource.getFile());
      }

   }
}