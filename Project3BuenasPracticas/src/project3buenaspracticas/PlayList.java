/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3buenaspracticas;

/**
 * PlayList.
 *
 * Representa la clase abstracta en la cual creamos el método constructor y los
 * métodos de obtener y cambiar.
 *
 * @version 01.01.01 2022-02-14
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class PlayList implements Comparable<PlayList> {

    public int id;
    public String title;
    public String genre;
    public String date;
    public double duration;
    public String cover;
    public String description;

    public PlayList(int id, String title, String genre, String date, double duration, String cover, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.date = date;
        this.duration = duration;
        this.cover = cover;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Crear método ToString para poder retornar datos del ArrayList.
     *
     * @return Datos de los atributos del ArrayList.
     */
    @Override
    public String toString() {
        return "PlayList {" + id + "= title: " + title + "|| genre:" + genre + "|| date :" + date + "|| duration :" + duration + " Min || cover :" + cover + "|| description :" + description + '}' + "\n                                                                                                   ";
    }

    /**
     * Crear método para ordenar la lista en el orden que se quiera.
     *
     * @param t
     * @return Date en forma Ascendente o Descendente.
     */
    @Override
    public int compareTo(PlayList t) {
        return date.compareTo(t.getDate());

    }

}
