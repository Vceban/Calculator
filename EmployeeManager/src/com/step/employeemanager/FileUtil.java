/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.employeemanager;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Vovan
 */
public class FileUtil {
    private final static String RELATIVE_PATH = "io\\files";
    public static File createTextFileRelative() throws IOException{
        System.out.println("\n---- Creating File with relative location----");
        System.out.println("Creating relative lokation" + RELATIVE_PATH);
        File relativeFolder = new File(RELATIVE_PATH);
        relativeFolder.mkdirs();
        System.out.println("=====> " + relativeFolder.getAbsolutePath());
        
        File txtFile = new File(relativeFolder, "Employee.txt ");
        boolean isCreated = txtFile.createNewFile();
        String message = isCreated 
                            ? "File" + txtFile.getAbsolutePath() + "created" 
                            : "File" + txtFile.getAbsolutePath() + "Alredy exist";
        System.out.println(message);
        return relativeFolder;
    }
}
