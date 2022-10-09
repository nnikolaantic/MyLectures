/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReaderZadatak2;

/**
 *
 * @author Anta
 */
public class Knjiga {

    private String naslov;
    private String autor;
    private String ISBN;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null) {
            throw new RuntimeException("Autor ne sme da bude null");
        }
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String isbn) {
        if (isbn == null) {
            throw new RuntimeException("ISBN ne sme da bude null");
        }
        ISBN = isbn;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        if (naslov == null) {
            throw new RuntimeException("Naslov ne sme da bude null");
        }
        this.naslov = naslov;
    }

    public String toString() {
        return "Naslov: " + naslov + " Autor: " + autor + " ISBN: " + ISBN;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Knjiga)) {
            throw new RuntimeException("Morate uneti objekat klase " + "Knjiga");
        }
        Knjiga k = (Knjiga) (o);
        if (ISBN.equals(k.getISBN())) {
            return true;
        } else {
            return false;
        }
    }

}
