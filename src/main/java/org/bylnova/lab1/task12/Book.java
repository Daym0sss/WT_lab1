package org.bylnova.lab1.task12;

import java.math.BigInteger;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;

    private String isbn;

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price
                && (title != null && title.equals(book.title))
                && (author != null && author.equals(book.author));
    }

    public int hashCode() {
        int result = 5;
        result = 37 * result + this.price;
        result = 37 * result + edition;
        result = 37 * result + (this.title == null ? 0 :
                this.title.hashCode());
        result = 37 * result + (this.author == null ? 0 :
                this.author.hashCode());
        return result;
    }

    public String toString() {
        return "Book: " +
                "title = " + title +
                ", author = " + author +
                ", price = " + price;
    }

    protected Object clone() throws CloneNotSupportedException {
        Book book = new Book();
        book.price = this.price;
        book.author = this.author;
        book.title = this.title;
        return book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book book) {
        String firstIsbn = book.isbn;
        String secondIsbn = this.isbn;

        firstIsbn = firstIsbn.replaceAll("-", "");
        secondIsbn = secondIsbn.replaceAll("-", "");

      //  return new BigInteger(firstIsbn).compareTo(new BigInteger(secondIsbn));
        return firstIsbn.compareTo(secondIsbn);
    }


}
