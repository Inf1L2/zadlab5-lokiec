/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author lokyiec
 */
public class Ksiazka {
    private String autor;
    private int page;
    private int rok;
    private int cena;

    public Ksiazka(String autor, int page, int rok, int cena) {
        this.autor = autor;
        this.page = page;
        this.rok = rok;
        this.cena = cena;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getPage() {
        return page;
    }

    public int getRok() {
        return rok;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    
    @Override
    public String toString() {
        return "Ksiazka: autor=" + autor + ", liczba stron=" + page + ", rok wydania=" + rok + ", cena=" + cena;
    }
}
