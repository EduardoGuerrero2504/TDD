package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroUnitTest {

    @Test
    void test(){
        Assertions.assertTrue(true);
    }

    @Test
    void instanceBook_allFieldsOK_success(){

        Book myBook= Book.instance("Titulo",
                "Autor",
                "Genero",
                "ISBN",
                LocalDate.of(2026,10,5),
                "Tipo",
                464,
                "Editorial");

        assertEquals("Titulo", myBook.getTitulo());
        assertEquals("Autor", myBook.getAutor());
        assertEquals("Genero", myBook.getGenero());
        assertEquals("ISBN", myBook.getIsbn());
        assertEquals(LocalDate.of(2026,10,5), myBook.getFecha());
        assertEquals("Tipo", myBook.getTipo());
        assertEquals(464, myBook.getPaginas());
        assertEquals("Editorial", myBook.getEditorial());

    };

}
