package project;

import java.util.ArrayList;

class Book {
	public String name, author;

	Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book{" + "name=' " + name + '\'' + ", author=' " + author + '\'' + '}';
	}
}

class MyLibrary {
	public ArrayList<Book> books;

	public MyLibrary(ArrayList<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		System.out.println("The book as been added to the library!");
		this.books.add(book);
	}

	public void returnBook(Book b) {
		System.out.println("The book has been returned");
		this.books.add(b);
	}

	public void issueBook(Book b, String issued_to) {
		System.out.println("The book has been issued from library to " + issued_to);
		this.books.remove(b);
	}

}

public class Library {
	public static void main(String[] args) {
		ArrayList<Book> bk = new ArrayList<>();
		Book b1 = new Book("Algorithm1", "CLRS");
		bk.add(b1);

		Book b2 = new Book("Algorithm2", "CLRS");
		bk.add(b2);

		Book b3 = new Book("Algorithm3", "CLRS");
		bk.add(b3);

		Book b4 = new Book("Algorithm4", "CLRS");
		bk.add(b4);

		Book b5 = new Book("Algorithm5", "CLRS");
		bk.add(b5);
		
		MyLibrary ml = new MyLibrary(bk);
		ml.addBook(new Book("algo6", "myauthor"));
		System.out.println(ml.books);
		ml.issueBook(b3, "Harry");
		System.out.println(ml.books);

	}

}
