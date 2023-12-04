package Abstratas;

import Abstratas.Avaliacao;
import Abstratas.Reclameaqui;
import Interfaces.Autenticar;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Usuario  implements Autenticar {
    protected static String nome;
    protected static int senha;
    static Scanner scan = new Scanner(System.in);

    public Usuario(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public static void user() {
        System.out.println("crie um user ");
        nome = scan.next();

    }


    public static void senha() {
        System.out.println("crie uma senha ");

        senha = scan.nextInt();

        System.out.println("----CONTA CRIADA com sucesso----");
        }




    public static void logar (){
        String nomeUsuario;
        int senhaUsuario;
        System.out.println("----digite um login----");
        nomeUsuario = scan.next();
        System.out.println("----digite um senha----");
        senhaUsuario = scan.nextInt();
        if (nomeUsuario.equals(nome) && senhaUsuario==senha){
            System.out.println("----login feito com sucesso----");
        }
        else {
            System.out.println("----ocorreu um problema----");
            System.out.println("talvez vc n tenha conta deseja criar uma ");
            System.out.println("digite 1 pra criar 2 para sair");
            int op= scan.nextInt();
            if (op==1){
                user();
                senha();
                logar();
            }else {
                System.out.println("ADEUS");
            }

        }
    }

    public static void main() {
        System.out.println("digite 1 para logar ou 2 para cadastrar");
        int op= scan.nextInt();
        if (op==1){
            logar();
        }else{
            System.out.println("-------cadastro-------");
            //  System.out.println("digite seu login");
            user();
            //  System.out.println("digite sua senha");
            senha();
            System.out.println("logue sua conta");
            logar();


        }


}
}
