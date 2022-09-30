package portafolio1;

import javax.swing.JOptionPane;

public class Portafolio1 {

    public static void main(String[] args) {
        System.out.println("Hello World");


        int edad;
        String edadLectura;


        /**
         ************ Ejercicio 2 *******************/
        edadLectura = JOptionPane.showInputDialog("Ingrese su Edad");
        edad = Integer.parseInt(edadLectura);

        if (edad >= 0 && edad <= 5) {
            System.out.println("Primera Infancia");
        }

        if (edad >= 6 && edad <= 11) {
            System.out.println("Infancia");
        }

        if (edad >= 12 && edad <= 18) {
            System.out.println("Adolescencia");
        }

        if (edad >= 19 && edad <= 30) {
            System.out.println("Juventud");
        }

        if (edad >= 31 && edad <= 59) {
            System.out.println("Adultez");
        }
        
        if (edad >=60) {
            System.out.println("Persona Mayor");
        }
        
    }
}
