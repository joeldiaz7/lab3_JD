package lab3;

import java.util.*;

public class Lab3 {

    static ArrayList Connective_line = new ArrayList();
    static Scanner l = new Scanner(System.in);
    static String login;
    static String contraseña;
    static String usuario;
    static int cont = 0;
    static String proyecto;

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
                        System.out.print("Ingrese correo: ");
                        usuario = l.next();
                        System.out.print("Ingrese la contraseña: ");
                        contraseña = l.next();
                        ((Empresa) Connective_line.get(cont)).setContraseña(contraseña);
                        ((Empresa) Connective_line.get(cont)).setNombre(usuario);
                        cont++;
                        System.out.println("");
                        System.out.println("");

                    } else if (login.equalsIgnoreCase("administrador")) {

                        Connective_line.add(new Administradores());
                        System.out.print("Ingrese correo: ");
                        usuario = l.next();
                        System.out.print("Ingrese la contraseña: ");
                        contraseña = l.next();
                        ((Administradores) Connective_line.get(cont)).setContaseña(contraseña);
                        ((Administradores) Connective_line.get(cont)).setNombre_usuario(usuario);
                        for (int i = 0; i < Connective_line.size(); i++) {
                            System.out.println(((Administradores) Connective_line.get(i)).getIngresos().get(i));
                        }//Fin del for que mustras los ingresos
                        cont++;
                        System.out.println("");
                        System.out.println("");

                    } else if (login.equalsIgnoreCase("freelance")) {

                        Connective_line.add(new Freelance());
                        System.out.print("Ingrese correo: ");
                        usuario = l.next();
                        System.out.print("Ingrese la contraseña: ");
                        contraseña = l.next();
                        ((Freelance) Connective_line.get(cont)).setContraseña(contraseña);
                        ((Freelance) Connective_line.get(cont)).setNombre(usuario);
                        System.out.print("Ingrese proyecto a visualizar(usar _ como espacios): ");
                        proyecto = l.next();
                        if (proyecto.equalsIgnoreCase("proyecto_web")) {
                            ((Desarrollador_web) Connective_line.get(cont)).getLenguaje();
                            System.out.println(((Freelance) Connective_line.get(cont)).getEmpresa().get(cont).getProyecto());
                            System.out.println("");
                            System.out.println("");

                        } else if (proyecto.equalsIgnoreCase("proyecto_publicitario")) {
                            ((Proyecto_Publicitario) Connective_line.get(cont)).getFreelance();
                            System.out.println(((Freelance) Connective_line.get(cont)).getEmpresa().get(cont).getProyecto());
                            System.out.println("");
                            System.out.println("");

                        } else if (proyecto.equalsIgnoreCase("proyecto_comercial")) {
                            ((Proyecto_Comercial) Connective_line.get(cont)).getFreelance();
                            System.out.println(((Freelance) Connective_line.get(cont)).getEmpresa().get(cont).getProyecto());
                            System.out.println("");
                            System.out.println("");

                        } else {
                            System.out.println("Ese proyecto no existe");
                        }
                        cont++;
                        System.out.println("");
                        System.out.println("");

                    } else {
                        System.out.println("Login invalido\n");
                    }//Fin del if del login de cada tipo
                    System.out.println("");
                    System.out.println("");
                    break;
            }
            System.out.print("¿Volver al menu?1.-Si,2.-No: ");
            r = l.nextInt();
        }//Fin del while del menu
    }

}
