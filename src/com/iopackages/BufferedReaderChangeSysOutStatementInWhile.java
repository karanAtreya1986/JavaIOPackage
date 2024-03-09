package com.iopackages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderChangeSysOutStatementInWhile {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/abc.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String s1 = br.readLine();
		while (s1 != null) {
			s1 = br.readLine();
			System.out.println(s1);
		}

		br.close();

	}

}
