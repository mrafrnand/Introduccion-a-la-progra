package com.mycompany.clase3semana4;

import javax.swing.JOptionPane;

public class Clase3Semana4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Ciclo For incremento
        for (int i = 0; i <= 5; i++) {
            System.out.println("El valor de i es: " + i);
        }

        //Ciclo For decremento
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Feliz Año Nuevo!");

        //Ciclo While
        int i = 0;
        int suma = 0;
        while (i <= 10) {
            //suma+=i;
            suma = suma + i;
            System.out.println(i);
            ++i;

        }

        System.out.println("La sumatoria es:" + suma);

        /**
         * *********************Ejercicio************************
         */
        for (int j = 0; j < 5; j++) {
            System.out.println("@@@@@@@@@@");
        }

        //Ciclo do while
        int j = 0;

        do {
            System.out.println("El valor de j es:" + j);
            ++j;

        } while (j < 5);

        /**
         * *****************ejercicio2*************************
         */
        System.out.println("ejercicios");

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 10; l++) {
                System.out.println("@");
            }
            System.out.println("");
        }

        /**
         * Practica en clase*
         */
        int num;
        String numeroLectura = JOptionPane.showInputDialog("Ingrese el numero a multiplicar");
        num = Integer.parseInt(numeroLectura);
        for (int m = 1; m <= 10; m++) {
            int resultado = num * m;
            System.out.println(resultado);
        }

        /**
         * Ejercicio3*
         */
        for (int f = 0; f < 1; f++) {
            System.out.println("*");
        }
        for (int f = 0; f < 1; f++) {
            System.out.println("**");
        }
        for (int f = 0; f < 1; f++) {
            System.out.println("***");
        }
        for (int f = 0; f < 1; f++) {
            System.out.println("****");
        }
        for (int f = 0; f < 1; f++) {
            System.out.println("*****");
        }
        /**
         * ejercicio3 bien hecho*
         */
        for (int s = 0; s < 5; s++) {
            for (int e = 0; e <= s; e++) {
                System.out.print("*");

            }
            System.out.println("");
        }

        int cantidadEstudiantes;
        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        int mayor = 0;
        int menor = 0;
        int promedio = 0;
        int cantidadAprobados = 0;

        for (int k = 1; k < cantidadEstudiantes; k++) {
            String notaLectura = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:");
            int nota = Integer.parseInt(notaLectura);

            promedio = promedio + nota;

            if (k == 1) {
                menor = nota;
            } else if (nota < menor) {
                menor = nota;

            }

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota > 70) {
                cantidadAprobados = cantidadAprobados + 1;
            }

        }

        System.out.println("La nota mayor es:" + mayor);
        System.out.println("La nota menor es:" + menor);
        System.out.println("El promedio de las notas fue:" + promedio / cantidadEstudiantes);
        System.out.println("La cantidad de aprobados fue:" + cantidadAprobados);

        //ejercicio6
        int mayor2 = 0;
        int menor2 = 0;
        int promedio2 = 0;
        int n = 1;
        int contadorEstudiantes = 1;

        while (n == 1) {
        }
        int nota2 = 0;
        promedio2 = promedio2 + nota2;

        if (n == 1) {
            menor2 = nota2;
        } else if (nota2 < menor2) {
            menor2 = nota2;

        }

        if (nota2 > mayor2) {
            mayor2 = nota2;
        }

        if (nota2 > 70) {
            cantidadAprobados = cantidadAprobados + 1;
        }
        contadorEstudiantes = contadorEstudiantes + 1;

        n = nota2;
        
        System.out.println("La nota mayor es:" + mayor);
        System.out.println("La nota menor es:" + menor);
        System.out.println("El promedio de las notas fue:" + promedio / cantidadEstudiantes);
        System.out.println("La cantidad de aprobados fue:" + cantidadAprobados);

    }

}
