package presentacion;

import java.util.Scanner;
import control.Gestor;
import dominio.Catalogo;

public class Interfaz {
    //Costructores

    //Métodos
    public static boolean interfaz (Catalogo catalogo) {
        Scanner scanner = new Scanner(System.in);
        int selector;
        System.out.println("---------------------\nSelecciona una opción\n---------------------\n1-. Alta\n2-. Baja\n3-. Modificar\n4-. Mostrar\n 0-. Guardar y salir\n---------------------");
        selector = scanner.nextInt();
        switch (selector) {
            //Alta
            case 1: {
                System.out.println("---------------------\nSelecciona una opción\n---------------------\n1-. Bien\n2-. Servicio\n---------------------");
                selector = scanner.nextInt();
                switch (selector) {
                    //Alta de un bien
                    case 1: {
                        Gestor.altaBien(catalogo);
                        return (true);
                    }
                    //Alta de un servicio
                    case 2: {
                        Gestor.altaServicio(catalogo);
                        return (true);
                    }
                    default: {
                        System.out.println("Valor no válido");
                        return (true);
                    }

                }
            }
            //Baja
            case 2: {
                Gestor.baja();
                return (true);
            }
            //Modificar
            case 3: {
                System.out.print("Introduce el ID del producto: ");
                Gestor.modificar(scanner.nextLine());
                return (true);
            }
            //Mostrar
            case 4: {
                Gestor.mostrar(catalogo);
                return (true);
            }
            //Salir
            case 0: {
                return (false);
            }
            //Otros valores
            default: {
                System.out.println("Valor no válido");
                return (true);
            }
        }
    }
}
