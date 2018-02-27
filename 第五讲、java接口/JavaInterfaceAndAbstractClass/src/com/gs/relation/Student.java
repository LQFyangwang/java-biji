package com.gs.relation;

public class Student {
	
	private String name;
	private int age;
	private String subject;
	private Book book; // 一个学生有一本书
	private Book[] books; // 一个学生有多本书
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("小明");
		stu.setAge(20);
		stu.setSubject("计算机");
		Book book = new Book();
		book.setTitle("Java编程思想");
		book.setTotalPage(880);
		book.setPrice(147);
		stu.setBook(book);
		
		Book[] books = new Book[3];
		books[0] = book;
		books[1] = book;
		books[2] = book;
		stu.setBooks(books);
	}
	
}
