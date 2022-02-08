/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaCanciones;

import java.util.Objects;

/**
 *
 * @author hinda
 */
public class Cancion {
    //atributos

    private String idioma;
    private String titulo;
    private String artista;
    private int rating;

    //constrector parametrizado
    public Cancion(String idioma, String titulo, String artist, int rating) {
        this.idioma = idioma;
        this.titulo = titulo;
        this.artista = artist;
        this.rating = rating;
    }

    //constrector por defecto
    public Cancion() {
    }

    //getters y setters 
    public String getidioma() {
        return idioma;
    }

    public void setidioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtist() {
        return artista;
    }

    public void setArtist(String artist) {
        this.artista = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //tostring
    @Override
    public String toString() {
        return " idioma= " + idioma+" | "
                + " titulo= " + titulo+" | "
                + " artist= " + artista+" |"
                + " rating= " + rating; 
    }

    //equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idioma);
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.artista);
        hash = 59 * hash + this.rating;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.artista, other.artista)) {
            return false;
        }
        return true;
    }

}
