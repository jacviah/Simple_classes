package by.jacviah.jc1.simple_classes_book.main;

import static by.jacviah.jc1.simple_classes_book.entity.BindingType.*;

import java.util.ArrayList;

import by.jacviah.jc1.simple_classes_book.entity.*;
import by.jacviah.jc1.simple_classes_book.logic.BookListLogic;

public class BookDemo {
	public static void main(String[] args) {

		Book b1 = new Book("The Russian Messenger", 1869, 1440, 120, PERFECT_BOUND, "War and Peace",
				new Author("Leo", "Tolstoy"));
		Book b2 = new Book("The Russian Messenger", 1859, 173, 40, STAB_STITCHED, "Netochka Nezvanova",
				new Author("Fyodor", "Dostoevsky"));
		Book b3 = new Book("Oskolki", 1883, 1, 10, LOOP_STITCHED, "The Death of a Civil Servant",
				new Author("Anton", "Chekhov"));
		Book b4 = new Book("Pierre-Jules Hetzel", 1875, 486, 90, STAB_STITCHED, "The Mysterious Island",
				new Author("Jules", "Verne"));
		Book b5 = new Book("George Allen & Unwin", 1954, 423, 220, PERFECT_BOUND, "The Fellowship of the Ring",
				new Author("J. R. R.", "Tolkien"));
		Book b6 = new Book("Black Library", 2009, 232, 40, TAPE_BOUND, "Ciaphas Cain: Hero of the Imperium",
				new Author("Alexander Michael", "Stewart"), new Author("Sandy", "Mitchell"));

		BookList list = new BookList();
		list.addBook(b1);
		list.addBook(b5);
		list.addBook(b2);		
		list.addBook(b6);		
		list.addBook(b4);		
		list.addBook(b3);	
		list.addBook(b1);

		BookListLogic logic = new BookListLogic();
		logic.print(list);
		System.out.println("---------------------------------");
		logic.print(logic.findBookByAuthor(new Author("Sandy", "Mitchell"), list));
		System.out.println("---------------------------------");
		logic.print(logic.findBookByPublisher("The Russian Messenger", list));
		System.out.println("---------------------------------");
		logic.print(logic.findBookAfterYear(1880, list));		
	}
}
