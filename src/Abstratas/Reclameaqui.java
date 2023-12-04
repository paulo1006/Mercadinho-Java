package Abstratas;

import Interfaces.ReclameInt;

import java.util.Scanner;

public abstract class Reclameaqui implements ReclameInt {

    static Scanner scan = new Scanner(System.in);
    public static void reclamar(){
        System.out.println("Conforme o itens abaixo qual deles nao lhe satifez");
        System.out.println("1-atendimento \n2-falta de itens\n 3=outros");

        int denucia= scan.nextInt();
        if (denucia == 1) {
            System.out.println("Sentimos muito, iremos melhorar.");
        } else if (denucia == 2) {
            System.out.println("Iremos aumentar o estoque.");
        } else {
            System.out.println("Com uma única palavra diga-nos o que nao lhe agradou.");
            String critica = scan.next();
            System.out.println("iremos estudar a respeito de "+critica);
        }
    }

}
