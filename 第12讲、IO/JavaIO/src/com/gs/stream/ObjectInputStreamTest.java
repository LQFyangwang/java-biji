package com.gs.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import org.junit.Test;

import com.gs.bean.QQAccount;

public class ObjectInputStreamTest {
	
	@Test
	public void testObjectInputStream() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/io_test/obj"));
			QQAccount a = (QQAccount) ois.readObject();
			System.out.println(a.getNickname() + a.getPwd() + a.getNumber());
			ois.close();
			
			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File("d:/io_test/obj1")));
			Object b = ois1.readObject();
			if (b instanceof QQAccount) {
				QQAccount b1 = (QQAccount) b;
				System.out.println(b1.getNickname() + b1.getPwd() + b1.getNumber());
			}
			QQAccount c = (QQAccount) ois1.readObject();
			System.out.println(c.getNickname() + c.getPwd() + c.getNumber());
			ois1.close();
			
			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("d:/io_test/obj2")));
			@SuppressWarnings("unchecked")
			List<QQAccount> accounts = (List<QQAccount>) ois2.readObject();
			for (QQAccount aa : accounts) {
				System.out.println(aa.getNickname());
			}
			ois2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
