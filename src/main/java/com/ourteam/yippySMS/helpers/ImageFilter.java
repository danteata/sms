/*
 * Filters the files to include only jpeg and PNG extension images and
 * also provides relevant description to that quest
 */
package com.ourteam.yippySMS.helpers;

import java.io.File;

/**
 *
 * @author dantheta
 */
	
public class ImageFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow just directories and files with ".txt" extension...
//            return super.accept(file);
            return file.getAbsolutePath().endsWith(""); //for the purpose of the demo it will show all files and folders
//            return file.getAbsolutePath().endsWith(".jpg") || file.getAbsolutePath().endsWith(".png");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "images with .jpg or .png only";
        }

    }