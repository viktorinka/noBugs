package org.example.task1_1;

import java.util.HashSet;

public class BookCollection {
    private HashSet<Book> books;

    public BookCollection(HashSet<Book> books) {
        this.books = books;
    }

    public BookCollection(){
        this.books = new HashSet<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(Book book){
        this.books.remove(book);
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public void removeBooks(String title){

        Book targetBook = null;

        for (Book book : books) {
            if(book.getTitle().equals(title)){
                targetBook = book;
            }
        }
        if (targetBook != null) {
            this.books.remove(targetBook);
        }else {
            System.out.println("Book not found");
        }
    }

    int count = 0;
    public void checkBook(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Book with name: " + name + " was found");
        }
        else {
            System.out.println("Book with name: " + name + " wasn't found");
        }
    }

}
