package org.example;

import model.Book;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {


        Book myBook = Book.instance(
                "Clean Code",
                "Robert C. Martin",
                "Programación",
                "123456",
                LocalDate.of(2008, 8, 1),
                "tecnico",
                462,
                "Prentice Hall"
        );

            System.out.println(myBook.getTitulo());
            System.out.println(myBook.getAutor());
            System.out.println(myBook.getGenero());
            System.out.println(myBook.getIsbn());
            System.out.println(myBook.getFecha());
            System.out.println(myBook.getTipo());
            System.out.println(myBook.getPaginas());
            System.out.println(myBook.getEditorial());





    }
}

