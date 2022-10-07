package com.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreTextFile {
    public static void main(String args[]){
        
        
        String arr[]= {};
        try {
        	BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Raja\\Desktop\\LC.txt"));
	    	String str;
	    	List<String> list = new ArrayList<String>();
	    	
	    	while((str = in.readLine()) != null){
	    	    list.add(str);
	    	}
	
	    	arr = list.toArray(new String[0]);

	  
	   	for(String s:arr)
	    	System.out.println(s);
	    	
	    	in.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
}

}
