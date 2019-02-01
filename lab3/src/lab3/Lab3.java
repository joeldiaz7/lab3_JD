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
    static int pos;
    static String mod;
    static String mod2;
    static String mod3;
    static String mod4;
    static String mod5;

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
                case 3:
                    System.out.print("Ingrese posicion a eliminar: ");
                    pos = l.nextInt();
                    System.out.print("Ingrese correo: ");
                    usuario = l.next();
                    System.out.print("Ingrese contraseña: ");
                    contraseña = l.next();
                    if (((Empresa) Connective_line.get(pos)).getContraseña().equalsIgnoreCase(contraseña)
                            && ((Empresa) Connective_line.get(pos)).getCorreo().equalsIgnoreCase(usuario)) {

                    } else if (((Freelance) Connective_line.get(pos)).getContraseña().equalsIgnoreCase(contraseña)
                            && ((Freelance) Connective_line.get(pos)).getNombre().equalsIgnoreCase(usuario)) {
                        System.out.print("Que desea modificar(usar _ como espacios): ");
                        mod = l.next();
                        System.out.println("");
                        if (mod.equalsIgnoreCase("deseñador_web")) {
                            System.out.print("Ingrese lenguaje: ");
                            mod2 = l.next();
                            System.out.print("Ingrese Idioma: ");
                            mod4 = l.next();
                            System.out.print("Ingrese Universidad: ");
                            mod3 = l.next();
                            ((Desarrollador_web) Connective_line.get(pos)).setLenguaje(mod2);
                            ((Desarrollador_web) Connective_line.get(pos)).setIdioma(mod4);
                            ((Desarrollador_web) Connective_line.get(pos)).setUni(mod3);
                            System.out.println("");
                        } else if (mod.equalsIgnoreCase("fotografo")) {
                            System.out.print("Ingrese camara: ");
                            mod2 = l.next();
                            System.out.print("Ingrese numero marca: ");
                            mod3 = l.next();
                            ((Fotografo) Connective_line.get(pos)).setCamara(mod2);
                            ((Fotografo) Connective_line.get(pos)).setNombreMarca(mod3);
                            System.out.println("");
                        } else if (mod.equalsIgnoreCase("diseñador_grafico")) {
                            System.out.print("Ingrese hobbies: ");
                            mod2 = l.next();
                            System.out.println("Ingrese universidad: ");
                            mod3 = l.next();
                            ((Desñador_grafico) Connective_line.get(pos)).setHobbies(mod2);
                            ((Desñador_grafico) Connective_line.get(pos)).setUni(mod3);
                            System.out.println("");
                        } else if (mod.equalsIgnoreCase("medios_audiovisuales")) {
                            System.out.print("Ingrese camara: ");
                            mod2 = l.next();
                            System.out.print("Ingrese numero marca: ");
                            mod3 = l.next();
                            ((Medios_Audiovisuales) Connective_line.get(pos)).setCamara(mod2);
                            ((Medios_Audiovisuales) Connective_line.get(pos)).setMarca(mod3);
                            System.out.println("");
                        } else if (mod.equalsIgnoreCase("marketing")) {
                            System.out.print("Ingrese red social: ");
                            mod2 = l.next();
                            ((Marketing) Connective_line.get(pos)).setRedSocial(mod2);
                            System.out.println("");
                        } else if (mod.equalsIgnoreCase("contador")) {
                            System.out.print("Ingrese hobbies: ");
                            mod2 = l.next();
                            System.out.println("Ingrese universidad: ");
                            mod3 = l.next();
                            ((Contador) Connective_line.get(pos)).setHobbies(mod2);
                            ((Contador) Connective_line.get(pos)).setUni(mod3);
                            System.out.println("");
                        } else {
                            System.out.println("Opcion de modificar empresa no valida");
                        }//Fin del if de las modificaciones de la empresa
                    } else {
                        System.out.println("Alguno de los parametros no es valido");
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
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
                            for (int i = 0; i < Connective_line.size(); i++) {
                                ((Desarrollador_web) Connective_line.get(i)).getLenguaje();
                                System.out.println(((Freelance) Connective_line.get(i)).getEmpresa().get(i).getProyecto());
                            }//FIn del for que muestra los proyectos webs
                            System.out.println("");
                            System.out.println("");

                        } else if (proyecto.equalsIgnoreCase("proyecto_publicitario")) {
                            for (int i = 0; i < Connective_line.size(); i++) {
                                ((Desarrollador_web) Connective_line.get(i)).getLenguaje();
                                System.out.println(((Freelance) Connective_line.get(i)).getEmpresa().get(i).getProyecto());
                            }//FIn del for que muestra los proyectos webs
                            System.out.println("");
                            System.out.println("");

                        } else if (proyecto.equalsIgnoreCase("proyecto_comercial")) {
                            for (int i = 0; i < Connective_line.size(); i++) {
                                ((Desarrollador_web) Connective_line.get(i)).getLenguaje();
                                System.out.println(((Freelance) Connective_line.get(i)).getEmpresa().get(i).getProyecto());
                            }//FIn del for que muestra los proyectos webs
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
                case 4:
                    System.out.print("Ingrese posicion a eliminar: ");
                    pos = l.nextInt();
                    System.out.print("Ingrese correo: ");
                    usuario = l.next();
                    System.out.print("Ingrese contraseña: ");
                    contraseña = l.next();

                    if (((Empresa) Connective_line.get(pos)).getContraseña().equalsIgnoreCase(contraseña)
                            && ((Empresa) Connective_line.get(pos)).getCorreo().equalsIgnoreCase(usuario)) {
                        Connective_line.remove(pos);
                    } else if (((Administradores) Connective_line.get(pos)).getContaseña().equalsIgnoreCase(contraseña)
                            && ((Administradores) Connective_line.get(pos)).getNombre_usuario().equalsIgnoreCase(usuario)) {
                        Connective_line.remove(pos);
                    } else if (((Freelance) Connective_line.get(pos)).getContraseña().equalsIgnoreCase(contraseña)
                            && ((Freelance) Connective_line.get(pos)).getNombre().equalsIgnoreCase(usuario)) {
                        Connective_line.remove(pos);
                    } else {
                        System.out.println("Alguno de los argumentos no son los correctos");
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    System.out.println("");
            }//Fin del switch del menu
            System.out.print("¿Volver al menu?1.-Si,2.-No: ");
            r = l.nextInt();
        }//Fin del while del menu
    }

}
