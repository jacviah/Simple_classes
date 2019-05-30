package by.jacviah.jc1.simple_classes_book.logic;

import java.util.ArrayList;

import by.jacviah.jc1.simple_classes_book.entity.*;

public class BookListLogic {

	public BookList findBookByAuthor(Author author, BookList list) {

		BookList result = new BookList();
		for (Book i : list) {
			if (i.getAuthors().contains(author)) {
				result.addBook(i);
			}
		}
		return result;
	}

	public BookList findBookByPublisher(String publisher, BookList list) {

		BookList result = new BookList();
		for (Book i : list) {
			if (i.getPublisher().compareTo(publisher) == 0) {
				result.addBook(i);
			}
		}
		return result;
	}

	public BookList findBookAfterYear(int year, BookList list) {

		BookList result = new BookList();
		for (Book i : list) {
			if (i.getYear() > year) {
				result.addBook(i);
			}
		}
		return result;
	}

	public void print(BookList list) {

		for (Book i : list) {
			System.out.println(i);
		}
	}

}
