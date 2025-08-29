package javaprograms;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile{
	
	
	public void readData() throws Exception {
		FileInputStream fis=new FileInputStream(".\\TestData\\ReadData.txt");
		FileOutputStream fos=new FileOutputStream(".\\TestData\\ReadData1.txt");
		int uniCodel;
		while((uniCodel=fis.read())!=-1) {
			
			System.out.println((char)uniCodel);
			fos.write(uniCodel);
		}
		
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
		
		File file=new File(".\\TestData\\ReadData.txt");
		FileReader fis=new FileReader(file);
		BufferedReader bis=new BufferedReader(fis);
		String line;
		while((line=bis.readLine())!=null) {
			System.out.println(line);
		}
		bis.close();
		
		
	}
	
	

}
	

