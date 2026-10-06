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

        Book myBook= Book.instance("titulo","autor","genero","isbn",LocalDate.of(2026,10,5),"tecnico",464,"Robert C. Martin");

        assertEquals("titulo", myBook.getTitulo());
        assertEquals("autor", myBook.getAutor());
        assertEquals("genero", myBook.getGenero());
        assertEquals("isbn", myBook.getIsbn());
        assertEquals(LocalDate.of(2026,10,5), myBook.getFecha());
        assertEquals("tecnico", myBook.getTipo());
        assertEquals(464, myBook.getPaginas());
        assertEquals("Robert C. Martin", myBook.getEditorial());

    };

}
