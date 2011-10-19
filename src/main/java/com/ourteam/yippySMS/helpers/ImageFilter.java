package com.ourteam.yippySMS.helpers;

import java.io.File;

/**
 *
 * Filters the files to include only jpeg and PNG extension images and
 * also provides relevant description to that quest
 * 
 * @author dantheta
 */
	
public class ImageFilter extends javax.swing.filechooser.FileFilter {

	/*
	 * Specifies which types of files should be accepted
	 * @params file the file that has been accepted
	 * @returns <code>true</code> if the file should be accepted.
	 */
        @Override
        public boolean accept(File file) {
		
            return file.getAbsolutePath().endsWith(""); //for the purpose of the demo it will show all files and folders
//            return file.getAbsolutePath().endsWith(".jpg") || file.getAbsolutePath().endsWith(".png");
        }

	/*
	 * Displays a description of the types of files accepted
	 * @returns a description of accepted files.
	 */
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "images with .jpg or .png only";
        }

    }