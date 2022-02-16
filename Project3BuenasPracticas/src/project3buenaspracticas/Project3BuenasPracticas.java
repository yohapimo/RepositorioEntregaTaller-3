/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3buenaspracticas;

import java.util.Scanner;

/**
 * Clase Main.
 *
 * se realizan las instancias utilizadas según el caso.
 *
 * @version 01.01.01 2022-02-14
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class Project3BuenasPracticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Crear My PlayList 1 con los datos requeridos, en este caso solo se
         * crea una PlayList como ejemplo.
         */
        try {

            System.out.println("Puedes crear tu Play List.\nIngresa tu cancion favorita.");
            System.out.print("Asigne un codigo a la canción: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese Titulo de canción: ");
            String titulo = sc.nextLine();

            System.out.print("Ingrese Genero de canción: ");
            String genero = sc.nextLine();

            System.out.print("Ingrese la Fecha de la cancion. \nEjemplo: Enero-1: ");
            String fecha = sc.nextLine();

            System.out.print("Ingrese duracion de canción en minutos: \nEjemplo: 5.5: ");
            double duracion = Double.parseDouble(sc.nextLine());

            System.out.print("Ingrese breve descripción: ");
            String descripcion = sc.nextLine();

            System.out.println("\n");

            System.out.println("Mi play list creada es:");
            PlayList1 objPlayList1 = new PlayList1(id, titulo, genero, fecha, duracion, "Caratula disco", descripcion);
            System.out.println(objPlayList1);
            System.out.println("Play List Música 'ROCK EN ESPAÑOL' !!!");
            objPlayList1.createList();

            System.out.println(objPlayList1.getGenre());
        } catch (Exception e) {
            System.out.println("Ingresar un valor valido!");
        }

        System.out.println("\n");

        /**
         * Crear PlayList 2 y 3 que ya traen los parámetros por defecto.
         */
        PlayList2 objPlayList2 = new PlayList2(0, "Titulo 2", "Genero 2", "Fecha 2", 8.2, "caratula 2", "Descripción 2");
        System.out.println("Play List Música 'SALSA' !!!");
        objPlayList2.createList();
        System.out.println(objPlayList2.getTitle());

        System.out.println("\n");
//
        PlayList3 objPlayList3 = new PlayList3(0, "Titulo 3", "Genero 3", "Fecha 3", 8.2, "caratula 3", " Descripción 3");
        System.out.println("Play List Música 'ROMANTICA' !!!");
        objPlayList3.createList();
        System.out.println(objPlayList3.getTitle());

        System.out.println("\n");

    }

}
