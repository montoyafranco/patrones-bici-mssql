package org.example.menu;


import org.example.entidad.Usuario;
import org.example.servicio.case1.Caso1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static void functionMenu (){
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar bicicleta");
            System.out.println("3. Alquilar bicicleta");
            System.out.println("4. Devolver bicicleta");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Registro de usuario");
                    Caso1.registroUsuarios();
                    break;
                case 2:
                    System.out.println("Registro de bicicleta");
                    // Código para registrar una bicicleta
                    break;
                case 3:
                    System.out.println("Alquiler de bicicleta");
                    // Código para alquilar una bicicleta
                    break;
                case 4:
                    System.out.println("Devolución de bicicleta");
                    // Código para devolver una bicicleta
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (option != 5);

        scanner.close();
    }

    }








