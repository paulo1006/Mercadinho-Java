package Abstratas;

import Interfaces.Avaliacaoint;

import java.util.Scanner;

public abstract class Avaliacao extends Usuario implements Avaliacaoint {


    public Avaliacao(String nome, int senha) {
        super(nome, senha);
    }
    static Scanner scan = new Scanner(System.in);


    public static void avaliar(){
        System.out.println("avalie o servico de 1 a 5 estrelas");
        int nota= scan.nextInt();
        if(nota==5){
            System.out.println("obrigado pela avaliacao cliente : "+ Usuario.getNome());
        }else if (nota>=3){
            System.out.println("iremos melhorar"+ Usuario.getNome());
        }else  {
            System.out.println("sentimos muito pela sua frustacao"+ Usuario.getNome());
        }
    }


}
