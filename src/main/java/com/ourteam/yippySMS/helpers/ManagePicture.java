/*
 *Processes the image uploaded for a staff or student of the school 
 */
package com.ourteam.yippySMS.helpers;

import java.io.*;
import java.util.logging.LogManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author dantheta
 */
public class ManagePicture {
	BufferedReader br;
       BufferedWriter bw;
    //String filename;
    static private LogManager lm;


    /**
     * Save the byte array into a file with the give filename
     * @param data byte[]
     * @param filename String
     * @return boolean
     */
    public static boolean save(byte[] data, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(data, 0, data.length);
            fos.flush();
            fos.close();
            return true;
        } catch (IOException ioe) {
        }
        return false;
    }

    /*
     * displays the picture in the label
     * @params data the picture data 
     * @params label the label to be set with the image.
     */
    public static void display(byte[] data, JLabel label){
	  ImageIcon imageIcon = new ImageIcon(data); 
	  label.setIcon(imageIcon); 
    }

    /**
     * Read all bytes available in the stream
     * @param is InputStream
     * @return byte[]
     */
    public static byte[] readBytesFromStream(InputStream is) {
        int c;
        String data = "";
        try {
            while ((c = is.read()) != -1) {
                data += (char) c;
            }
        } catch (IOException ioe) {
            System.err.println("Problem when reading from stream...");
            ioe.printStackTrace();
        }
        return data.getBytes();
    }

    /**
     * Read all available bytes from the given file
     * @param file File
     * @return byte[]
     */
    public static byte[] readBytesFromFile(File file) {
        long file_size_long = -1;
        byte[] file_bytes = null;
        InputStream file_stream;

        try {
            file_stream = new FileInputStream(file);

            if (!file.exists()) {
                System.err.println(
                        "The file \""
                        + file.getName()
                        + "\" does not exist. Please make sure you have the correct path to the file.");
                return null;
            }

            if (!file.canRead()) {
                System.err.println(
                        "Cannot read from \""
                        + file.getName()
                        + "\". Please make sure the file permissions are set correctly.");
                return null;
            }

            file_size_long = file.length();

            if (file_size_long > Integer.MAX_VALUE) {
                System.err.println(
                        "The file \""
                        + file.getName()
                        + "\" is too large to be read by this class.");
                return null;
            }
            file_bytes = new byte[(int) file_size_long];
            int file_offset = 0;
            int bytes_read = 0;

            while (file_offset < file_bytes.length
                    && (bytes_read = file_stream.read(file_bytes, file_offset,
                    file_bytes.length
                    - file_offset)) >= 0) {
                file_offset += bytes_read;
            }
            if (file_offset < file_bytes.length) {
                throw new IOException("Could not completely read file \""
                        + file.getName() + "\".");
            }

            file_stream.close();

        } catch (FileNotFoundException e) {
            System.err.println("The file \""
                    + file.getName()
                    + "\" does not exist. Please make sure you have the correct path to the file.");
            return null;
        } catch (IOException e) {
            System.err.println("Error: There was a general, unrecoverable I/O error while reading from \""
                    + file.getName() + "\".");
            System.err.println(e.getMessage());
        }

        return file_bytes;

    }

    /**
     * Save the bytes in the stream to the file in parameter
     * @param is InputStream
     * @param filename String
     * @throws IOException
     */
    public static void saveFromURL(InputStream is, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        int c;
        boolean noheader = true;
        while (true) {
            if ((c = is.read()) == -1) {
                break;
            } else {
                if (noheader) {
                    fos.write(c);
                    fos.flush();
                } else {
                    if (c == '\n' && is.read() == '\r' && is.read() == '\n') {
                        noheader = true;
                    }
                }
            }
        }
        fos.close();
    }

	
	
}
