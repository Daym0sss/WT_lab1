package org.bylnova.lab1.task15;

import org.bylnova.lab1.task12.Book;

import java.util.Comparator;

public class BookTitleThenAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getTitle().compareTo(o2.getTitle());
        if (result == 0) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        return result;
    }
}
