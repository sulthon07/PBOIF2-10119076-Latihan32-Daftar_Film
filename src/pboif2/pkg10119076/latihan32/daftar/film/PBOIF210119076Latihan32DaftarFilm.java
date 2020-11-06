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
public class PBOIF210119076Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film flm = new Film();

        System.out.println("=====Daftar Film Sedang Tayang=====");

        flm.filmName = "Venom";
        flm.filmGenre = "Action,Horor,SciFi";
        flm.filmRating = 8.5;
        flm.filmDuration = 120;

        

        flm.FilmSedangTayang();

        

        flm.filmName = "Small Foot";
        flm.filmGenre = "Animation";
        flm.filmRating = 9.0;
        flm.filmDuration = 96;

        

        flm.FilmSedangTayang();

        

        flm.filmName = "Crazy Rich Asian";
        flm.filmGenre = "Comedy";
        flm.filmRating = 7.8;
        flm.filmDuration = 119;

        

        flm.FilmSedangTayang();

        

        flm.filmName = "Asih";
        flm.filmGenre = "Horor";
        flm.filmRating = 6.0;
        flm.filmDuration = 100;

        

        flm.FilmSedangTayang();

        



    }

    

}