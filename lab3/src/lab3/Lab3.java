package lab3;

import java.util.*;

public class Lab3 {

    static ArrayList Connective_line = new ArrayList();
    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        Connective_line.add(new Connective_Line());
        int r = 1;
        while (r == 1) {
            System.out.println("1. Registar administrador");
            System.out.println("2. Registrar Freelance");
            System.out.println("3. Agragar Empresas");
            System.out.println("Ingrese una opcion: ");
            int op = l.nextInt();
            switch (op) {
                case 2:
                    break;
            }
        }//Fin del while del menu
    }

}
