/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Umar
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
public class read_Utf8 {

    /**
     * @param args the command line arguments
     */
   ArrayList <String>  ar=new ArrayList <String>();
   public ArrayList<String> read (String s) {


	try {
		File fd = new File(s+".txt");

		BufferedReader br = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fd), "UTF8"));

		String str;

		while ((str = br.readLine()) != null) {
             
                    ar.add(str);
		   // System.out.println(str);
		}

                br.close();
	    }
	    catch (UnsupportedEncodingException e)
	    {
			System.out.println(e.getMessage());
	    }
	    catch (IOException e)
	    {
			System.out.println(e.getMessage());
	    }
	    catch (Exception e)
	    {
			System.out.println(e.getMessage());
	    }
        return ar;
	}
}
