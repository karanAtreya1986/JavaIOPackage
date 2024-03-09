package com.iopackages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsoleInputStreamReader {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in); // System.in reads from console
		BufferedReader br = new BufferedReader(ir);

		String s1 = null;

		do {
			System.out.println("Please enter text, exit to stop\n");
			s1 = br.readLine();
			System.out.println(s1);
		} while (!s1.equalsIgnoreCase("exit"));

		br.close();
	}

}
