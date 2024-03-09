package com.iopackages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWithMultipleTryCatchBlocks {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in); // System.in reads from console
		BufferedReader br = new BufferedReader(ir);

		try {
			String s1 = null;

			do {
				System.out.println("Please enter text, exit to stop\n");
				s1 = br.readLine();
				System.out.println(s1);
			} while (!s1.equalsIgnoreCase("exit"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
