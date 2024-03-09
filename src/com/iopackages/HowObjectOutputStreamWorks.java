package com.iopackages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HowObjectOutputStreamWorks {

	public static void main(String[] args) throws IOException {

		File f = new File("D:/abcde.txt");
		FileOutputStream fw = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fw);

		String s1 = new String("Testing Man");
		Integer i1 = new Integer(-324234324);

		byte b1 = 56;
		double d1 = 45.67;

		os.writeObject(s1);
		os.writeObject(i1);
		os.writeObject(b1);
		os.writeObject(d1);
		os.writeObject(s1);

		os.flush();
		os.close();
	}

}
