package com.iopackages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HowObjectInputStreamWorks {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f = new File("D:/abcde.txt");
		FileInputStream fr = new FileInputStream(f);
		ObjectInputStream os = new ObjectInputStream(fr);

		Object o1 = os.readObject();
		while (o1 != null) {
			String s1 = o1.toString();// convert object to string.
			System.out.println(s1);
			o1 = os.readObject();
		}

		os.close();
	}

}
