/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan32.daftar.film;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Daftar Film
 */
public class Film {
    String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;
       
    public void FilmSedangTayang() {
    
    System.out.println("Judul Film " + filmName);
    System.out.println("Genre Film " + filmGenre);
    System.out.println("Rating Film " + filmRating );
    System.out.println("Duration Film " + filmDuration + "Menit");
    System.out.println();
}
}
