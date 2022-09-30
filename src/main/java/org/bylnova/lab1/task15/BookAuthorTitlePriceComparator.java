package org.bylnova.lab1.task15;

import org.bylnova.lab1.task12.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        int titleComparison;
        if (authorComparison == 0) {
            titleComparison = o1.getTitle().compareTo(o2.getTitle());
            if (titleComparison == 0) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
            return titleComparison;
        }
        return authorComparison;
    }
}
