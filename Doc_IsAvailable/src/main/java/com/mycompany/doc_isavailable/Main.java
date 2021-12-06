package com.mycompany.doc_isavailable;

import java.util.Scanner;

/**
 *
 * @author eber
 */
public class Main {
    public static Admin admin = new Admin();
    
    public static void main(String[] args) {
        boolean existeUsuario;
        String nombre = "";
        String contrasena = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("Cargando sistema...");
        admin.cargarDatos();
        // (proceso de lectura de usuarios admin, citas, medicos y pacients en archivos json)
        
        System.out.println("Inicio de sesión (Ingrese su usuario y contraseña en los campos correspondientes)");
        System.out.println("Nombre de usuario: ");
        nombre = lector.nextLine();
        System.out.println("Contraseña: ");
        contrasena = lector.nextLine();
        existeUsuario = admin.validarCredenciales(nombre, contrasena);
        if(existeUsuario){
            System.out.println("Bienvenido! " + nombre);
            admin.menu();
        } else{
            System.out.println("El usuario no existe");
        }
        System.out.println("Gracias por tu visita!");
    }
}
