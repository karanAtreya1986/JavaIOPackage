package com.iopackages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HowBufferedWriterWorksAndUsingOneLinerStatement {

	public static void main(String[] args) throws IOException {

//		File f = new File("D:/abc.txt");
//		FileWriter fw = new FileWriter(f);
//		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:/abcd.txt")));// three lines clubbed into one.

		bw.write("Hello Java");
		bw.newLine();
		bw.write(-12991289);
		bw.newLine();
		char ch[] = { 'A', 'b', 'z', 'D' };
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
