package com.iopackages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatGPTCodeToReadUsingInputStreamReader {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter text, type 'exit' to quit:");
			String line;
			while ((line = reader.readLine()) != null) {
				if ("exit".equalsIgnoreCase(line.trim())) {
					System.out.println("Exiting...");
					break;
				}
				System.out.println("You entered: " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
