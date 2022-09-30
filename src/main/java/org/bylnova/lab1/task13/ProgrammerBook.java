package org.bylnova.lab1.task13;

import org.bylnova.lab1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String toString() {
        return "ProgrammerBook: " +
                "language = " + language +
                ", level = " + level;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (super.equals(obj)) {
            ProgrammerBook programmerBook = (ProgrammerBook) obj;
            return level == programmerBook.level
                    && (language != null && language.equals(programmerBook.language));
        }
        return false;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 37 * result + this.level;
        result = 37 * result + (this.language == null ? 0 :
                this.language.hashCode());
        return result;
    }
}
