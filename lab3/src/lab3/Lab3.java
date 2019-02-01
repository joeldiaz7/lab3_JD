package lab3;

import java.util.*;

public class Lab3 {

    static ArrayList Connective_line = new ArrayList();
    static Scanner l = new Scanner(System.in);
    static String login;
    static String contraseña;
    static String usuario;

    public static void main(String[] args) {
        Connective_line.add(new Connective_Line());
        int r = 1;
        while (r == 1) {
            System.out.println("1. Registar administrador,frelance, empresas");
            System.out.println("2. Login de empresa, admistrador y frelance");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar\n");
            System.out.print("Ingrese una opcion: ");
            int op = l.nextInt();
            switch (op) {
                case 2:
                    System.out.print("Quien desea login: ");
                    login = l.next();
                    if (login.equalsIgnoreCase("empresa")) {
                        Connective_line.add(new Empresa());
                    } else if (login.equalsIgnoreCase("administrador")) {
                        Connective_line.add(new Administradores());
                    } else if (login.equalsIgnoreCase("freelance")) {
                        Connective_line.add(new Freelance());
                    } else {
                        System.out.println("Login invalido");
                    }//Fin del if del login de cada tipo
                    break;
            }
            System.out.print("¿Volver al menu?1.-Si,2.-No: ");
            r = l.nextInt();
        }//Fin del while del menu
    }

}
