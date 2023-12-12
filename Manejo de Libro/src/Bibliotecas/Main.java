package Bibliotecas;

import Bibliotecas.menu.Menu;
import Bibliotecas.modelos.LibroElectronico;
import Bibliotecas.modelos.LibroFisico;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.iniciarListas();

        LibroFisico libroFisico1 = new LibroFisico("Libro Fisico 1", "Marco Aurelio 1", "2011", 255);
        LibroFisico libroFisico2 = new LibroFisico("Libro Fisico 2", "Marco Aurelio 2", "2012", 355);
        LibroFisico libroFisico3 = new LibroFisico("Libro Fisico 3", "Marco Aurelio 3", "2013", 455);

        biblioteca1.libroFisicoList.add(libroFisico1);
        biblioteca1.libroFisicoList.add(libroFisico2);
        biblioteca1.libroFisicoList.add(libroFisico3);


        LibroElectronico libroElectronico1 = new LibroElectronico("Libro Electronico 1", "Sancho 1", "2021", "PDF");
        LibroElectronico libroElectronico2 = new LibroElectronico("Libro Electronico 2", "Sancho 2", "2022", "EPUB");
        LibroElectronico libroElectronico3 = new LibroElectronico("Libro Electronico 3", "Sancho 3", "2023", "PDF");

        biblioteca1.libroElectronicoList.add(libroElectronico1);
        biblioteca1.libroElectronicoList.add(libroElectronico2);
        biblioteca1.libroElectronicoList.add(libroElectronico3);

        Menu.menu(biblioteca1);
    }
}