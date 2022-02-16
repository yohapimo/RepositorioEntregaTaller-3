/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3buenaspracticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PlayList 3.
 *
 * Representa la clase PlayList 3 que hereda los atributos de la clase abstracta
 * PlayList y así poder realizar la manipulación de los datos.
 *
 * @version 01.01.01 2022-02-14
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class PlayList3 extends PlayList {

    /**
     * PlayList 3.
     *
     * @param id
     * @param title
     * @param genre
     * @param date
     * @param duration
     * @param cover
     * @param description
     */
    public PlayList3(int id, String title, String genre, String date, double duration, String cover, String description) {
        super(id, title, genre, date, duration, cover, description);
    }

    /**
     * Metodo con un ArrayList para crear la PlayList 3, donde se ingresan 5
     * canciones.
     */
    public void createList() {

        PlayList play1 = new PlayList(1, "Burbujas de Amor ", " Romantica ", " Noviembre-1990 ", 6.5, " caratula 1 ", " Canción de Juan Luis Guerra 4.40");
        PlayList play2 = new PlayList(2, "Bailamos ", " Romantica ", " Febrero-1999 ", 5.2, " caratula 2 ", " Canción de Enrrique Iglesias");
        PlayList play3 = new PlayList(3, "Chiquitita ", " Romantica ", " Junio-1979 ", 5.5, " caratula 3 ", " Canción de ABBA");
        PlayList play4 = new PlayList(4, "Todo tiene su fin ", " Romantica ", " Mayo-1970 ", 7.1, " Caratula 4", " Canción de Módulos");
        PlayList play5 = new PlayList(5, "!Hola mi Amor! ", " Romantica ", " Octubre-1986 ", 4.9, " Caratula 5 ", " Canción de Junco");

        List<PlayList> playlistas = new ArrayList<PlayList>();

        playlistas.add(play1);
        playlistas.add(play2);
        playlistas.add(play3);
        playlistas.add(play4);
        playlistas.add(play5);

        /**
         * Método sort para poder ordenar la lista de forma ascendento o
         * descendente.
         */
        Collections.sort(playlistas);  // ascendente
        //Collections.sort(playlistas, Collections.reverseOrder());  // Descendente

        /**
         * Bucle foreach con el cual podemos recorrer la colección PlayList.
         */
        for (PlayList element : playlistas) {
            System.out.println(element);

        }

        /**
         * Bucle foreach con el cual podemos obtener los titulos y las fechas de
         * los PlayList.
         */
        System.out.println("Filtro de canciones por Titulo y Fecha.");
        for (PlayList elemento : playlistas) {

            System.out.println(elemento.getTitle() + "-" + elemento.getDate());
        }

    }

}
