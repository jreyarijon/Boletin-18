/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_18;

import java.util.Scanner;
import validar.pedirDato;

/**
 *
 * @author Josemolamazo
 */
public class Arrays {

    int[] numeros = new int[6];
    int[] notas = new int[5];
    String[] nome = new String[5];

// ejercicio 1
    public void crearArrayNum() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.floor(Math.random() * 50 + 1);
        }
    }

    public void verArrayNum() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void verArrayInverso() {
        System.out.println("***ARRAY INVERSO***");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
// ejercicio 2

    public void crearArrayNotas() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) Math.floor(Math.random() * 10 + 1);

        }
    }

    public void verArrayNotas() {
        System.out.println("***CALIFICACIONES***");
        int aprobados = 0;
        int suspensos = 0;
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
            if (notas[i] < 5) {
                suspensos++;
                System.out.println("Suspenso: " + notas[i]);
            } else {
                aprobados++;
                System.out.println("Aprobado: " + notas[i]);

            }
        }
        System.out.println("TOTAL aprobados= " + aprobados + "\tTOTAL suspensos= " + suspensos);
        System.out.println("MEDIA= " + Math.floor(acumulador / notas.length));

    }

    public void notaMaior() {
        int maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (maior < notas[i]) {
                maior = notas[i];
            }

        }
        System.out.println("NOTA MAIS ALTA: " + maior);

    }
// ejercicio 3

    public void crearArrayNome() {
        for (int i = 0; i < nome.length; i++) {
            nome[i] = pedirDato.pedirString();
        }
    }

    public void verArrayNome() {
        System.out.println("///// Array nome /////");
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
    }

    public void verNome() {
        System.out.println("__________________________");
        System.out.println("NOME DO ALUMNO");
        String nomeAlumno = pedirDato.pedirString();
        int posicion = 0;
        for (int i = 0; i < notas.length; i++) {
            if (nome[i].equals(nomeAlumno)) {
                System.out.println(notas[posicion]);
                break;
            }

        }

    }

    public void listaAprobados() {
        System.out.println("__________________");
        System.out.println("LISTA APROBADOS");
        String[] aprobados = new String[notas.length];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < nome.length; j++) {
                if (notas[i] > 5) {
                    aprobados[i] = nome[i];
                    System.out.println(aprobados[i] + " , " + notas[i]);
                    break;
                }
            }
        }
    }

    public void ordenarNotas() {
        System.out.println("___________________");
        System.out.println("NOTAS ORDENADAS");
        int aux;
        String auxnome;
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxnome = nome[i];
                    nome[i] = nome[j];
                    nome[j] = auxnome;
                }
            }
        }
    }

    public void verAlumnoPredeterminado() {
        System.out.println("________________________");
        System.out.println("NOTA DE ALUMNO");
        Scanner sc = new Scanner(System.in);
        String nomeAl = sc.nextLine();
        for (int i = 0; i < nome.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (nomeAl.equals(nome[i])) {
                    System.out.println("Nota: " + notas[j]);
                    break;
                }
            }
        }
    }
// ejercicio 4

    public void crearArrayNIF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee numero NIF: ");
        int num = (int) Math.floor(sc.nextInt());
        int div = num % 23;
        System.out.println(div);
        String[] letra = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < letra.length; i++) {
            switch (div) {
                case 1:
                    System.out.println(letra[15]);
                    break;
                case 2:
                    System.out.println(letra[19]);
                    break;
                case 3:
                    System.out.println(letra[0]);
                    break;
                case 4:
                    System.out.println(letra[6]);
                    break;
                case 5:
                    System.out.println(letra[11]);
                    break;
                case 6:
                    System.out.println(letra[21]);
                    break;
                case 7:
                    System.out.println(letra[5]);
                    break;
                case 8:
                    System.out.println(letra[13]);
                    break;
                case 9:
                    System.out.println(letra[3]);
                    break;
                case 10:
                    System.out.println(letra[20]);
                    break;
                case 11:
                    System.out.println(letra[1]);
                    break;
                case 12:
                    System.out.println(letra[12]);
                    break;
                case 13:
                    System.out.println(letra[8]);
                    break;
                case 14:
                    System.out.println(letra[22]);
                    break;
                case 15:
                    System.out.println(letra[16]);
                    break;
                case 16:
                    System.out.println(letra[14]);
                    break;
                case 17:
                    System.out.println(letra[18]);
                    break;
                case 18:
                    System.out.println(letra[7]);
                    break;
                case 19:
                    System.out.println(letra[10]);
                    break;
                case 20:
                    System.out.println(letra[2]);
                    break;
                case 21:
                    System.out.println(letra[9]);
                    break;
                case 22:
                    System.out.println(letra[4]);
                    break;
                default:
                    System.out.println(letra[17]);
                    break;

            }
            break;
        }
    }
}
