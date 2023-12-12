package Bibliotecas.menu;

import Bibliotecas.Biblioteca;

import java.util.Scanner;

public class Menu {
    public static void menu(Biblioteca biblioteca){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar los libros fisicos.");
            System.out.println("2. Mostrar los libros electronicos.");
            System.out.println("3. Mostrar todos los libros por categoría.");
            System.out.println("4. Mostrar todos los libros.");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            System.out.println("");
            switch (opcion) {
                case 1:
                    biblioteca.mostrarLibrosPorCategoria("Fisicos");
                    break;
                case 2:
                    biblioteca.mostrarLibrosPorCategoria("Electronicos");
                    break;
                case 3:
                    biblioteca.mostrarLibrosPorCategoria("Todos");
                    break;
                case 4:
                    biblioteca.mostrarLibrosSinFormato();
                    break;
                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}
