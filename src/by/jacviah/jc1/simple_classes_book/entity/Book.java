package by.jacviah.jc1.simple_classes_book.entity;
import java.util.ArrayList;
import java.util.Objects;

public class Book {
    {
        idGenerator++;
    }

    public static int idGenerator = 1;
    int id = idGenerator;
    String title;
    ArrayList<Author> authors = new ArrayList<Author>();
    String publisher;
    int year;
    int pageNumber;
    int price;
    BindingType bindingType;

    public Book(String publisher, int year, int pageNumber, int price, BindingType bindingType, String title, Author... authors) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
        this.bindingType = bindingType;

        for (Author i: authors) {
            this.authors.add(i);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", bindingType=" + bindingType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                pageNumber == book.pageNumber &&
                price == book.price &&
                Objects.equals(title.toUpperCase(), book.title.toUpperCase()) &&
                Objects.equals(authors, book.authors) &&
                Objects.equals(publisher.toUpperCase(), book.publisher.toUpperCase()) &&
                bindingType == book.bindingType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authors, publisher, year, pageNumber, price, bindingType);
    }
}
