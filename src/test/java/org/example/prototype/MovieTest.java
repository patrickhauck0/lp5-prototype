package org.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Movie movie = new Movie("Duro de Matar", new TipoFilme("Jan de Bont", "Ação", 2), 240, 8);

        Movie movieClone = movie.clone();
        movieClone.setTitulo("Gente Grande");
        movieClone.getTipoFilme().setGenero("Comédia");
        movieClone.setBilheteria(271);
        movieClone.setAvaliacao(6);

        assertEquals("Movie{titulo=Duro de Matar, tipoFilme=TipoFilme{diretor='Jan de Bont', genero='Ação', duracao=2}, bilheteria=240.0, avaliacao=8}", movie.toString());
        assertEquals("Movie{titulo=Gente Grande, tipoFilme=TipoFilme{diretor='Jan de Bont', genero='Comédia', duracao=2}, bilheteria=271.0, avaliacao=6}", movieClone.toString());
    }
}