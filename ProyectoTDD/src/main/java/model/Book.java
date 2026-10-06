package model;

import java.time.LocalDate;

public class Book {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private LocalDate fecha;
    private String tipo;
    private int paginas;
    private String editorial;

    private Book(String titulo, String autor, String genero, String isbn, LocalDate fecha, String tipo, int paginas, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.fecha = fecha;
        this.tipo = tipo;
        this.paginas = paginas;
        this.editorial = editorial;
    }

    public static Book instance (String titulo, String autor, String genero, String isbn, LocalDate fecha, String tipo, int paginas, String editorial) {

        return new Book(titulo,autor,genero,isbn,fecha,tipo,paginas,editorial);

    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public String getIsbn() {
        return isbn;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getTipo() {
        return tipo;
    }
    public int getPaginas() {
        return paginas;
    }
    public String getEditorial() {
        return editorial;
    }
}
