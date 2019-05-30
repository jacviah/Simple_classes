package by.jacviah.jc1.simple_classes_book.entity;

import java.util.ArrayList;
import java.util.Iterator;

public class BookList implements Iterable<Book> {

    ArrayList<Book> list = new ArrayList<Book>();

    public void addBook(Book book) {
        if (!book.authors.isEmpty() & book.getTitle() != null) {
            boolean flag = true;
            for (Book i : list) {
                if (i == book) {
                    flag = false;
                }
            }
            if (flag) {
                list.add(book);
            } else {
                System.out.println("Book is already in the list");
            }
        } else {
            System.out.println("You must fill in the details book title and authors");
        }
    }

    public void deleteBook(Book book) {

        boolean flag = true;
        for (Book i : list) {
            if (i == book) {
                flag = false;
            }
        }
        if (flag) {
            list.remove(book);
        } else {
            System.out.println("Book isn't already in the list");
        }
    }

    @Override
    public Iterator<Book> iterator() {
        return list.iterator();
    }
}
