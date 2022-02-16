/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3buenaspracticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * PlayList 1.
 *
 * Representa la clase PlayList 1 que hereda los atributos de la clase abstracta
 * PlayList y así poder realizar la manipulación de los datos.
 *
 * @version 01.01.01 2022-02-14
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class PlayList1 extends PlayList {

    Scanner sc = new Scanner(System.in);

    /**
     * PlayList 1.
     *
     * @param id
     * @param title
     * @param genre
     * @param date
     * @param duration
     * @param cover
     * @param description
     */
    public PlayList1(int id, String title, String genre, String date, double duration, String cover, String description) {
        super(id, title, genre, date, duration, cover, description);
    }

    /**
     * Método para crear la PlayList 1. además, se implementa el manejo de
     * excepciones.
     *
     * @throws InputMismatchException
     */
    public void createList() throws InputMismatchException {

        PlayList play1 = new PlayList(1, "Matador ", " Rock en Español ", " Junio-1993 ", 5.2, " Caratula 1 ", " Canción de Los Fabulosos Cadillacs");
        PlayList play2 = new PlayList(2, "De Música Ligera ", "Rock en Español ", "Diciembre-1990 ", 6.3, " caratula 2 ", " Canción de Soda Stereo");
        PlayList play3 = new PlayList(3, "Clandestino ", " Rock en Español ", " Agosto-1998 ", 7.5, " Caratula 3 ", "Canción de Manu Chao");
        PlayList play4 = new PlayList(4, "Entre Dos Tierras", " Rock en Español ", " Abril-1990 ", 5.5, "Caratula 4", " Canción de Héroes del silencio");
        PlayList play5 = new PlayList(5, "Gimme tha Power ", " Rock en Español ", " Enero-1997 ", 6.8, "Caratula 5", " Csnción de Molotov");

        List<PlayList> playlistas = new ArrayList<PlayList>();

        playlistas.add(play1);
        playlistas.add(play2);
        playlistas.add(play3);
        playlistas.add(play4);
        playlistas.add(play5);

        /**
         * Se implementa entrada de datos para registrar dos números con los
         * cuales podemos ordenar la lista que se quiera ordenar de forma
         * ascendente o descendente.
         */
        System.out.print("Puedes ordenar la Play List de Rock en español por Fecha: "
                + "\nIngrese 1 para ordenar ascendente! "
                + "\nIngrese 2 para descendente "
                + "\nIngrese 1 o 2 : ");

        int numero = Integer.parseInt(sc.nextLine());

        /**
         * Crear comparación para determinar si quiere ordenar el atributo de
         * forma ascendente o descendente.
         *
         */
        try {
            if (numero == 1) {
                Collections.sort(playlistas);
            } else if (numero == 2) {
                Collections.sort(playlistas, Collections.reverseOrder());
            } else {
                System.out.println("Solo ingresa 1 o 2");
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un Error!! \nSolo ingresa 1 o 2");
        }

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
