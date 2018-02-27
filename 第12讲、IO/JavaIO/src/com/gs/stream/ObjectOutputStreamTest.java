package com.gs.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.gs.bean.QQAccount;

public class ObjectOutputStreamTest {
	
	@Test
	public void testOutput() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/io_test/obj"));
			QQAccount a = new QQAccount();
			a.setNumber(10000);
			a.setNickname("tet");
			a.setPwd("123456");
			oos.writeObject(a);
			oos.close();
			
			ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(new File("d:/io_test/obj1"), true));
			oos1.writeObject(a);
			QQAccount b = new QQAccount();
			b.setNickname("aaa");
			oos1.writeObject(b);
			oos1.close();
			
			List<QQAccount> accounts = new ArrayList<QQAccount>();
			accounts.add(a);
			accounts.add(b);
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("d:/io_test/obj2"));
			oos2.writeObject(accounts);
			oos2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
