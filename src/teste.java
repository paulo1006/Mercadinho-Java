

import Abstratas.Avaliacao;
import Abstratas.Reclameaqui;
import Abstratas.Usuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste   {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------BEM VINDO AO SUPERMERCADO MINIMUN-------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

        Usuario.main();





        System.out.print("---------Escolha uma opção: ---------\n");
        System.out.println("Menu:");
        System.out.println("---------1. Cadastrar produto---------");
        System.out.println("---------2. Catálogo---------");
        System.out.println("---------3. Comprar---------");
        System.out.println("---------4. Reiniciar---------");
        System.out.println("---------5. reclamacao---------");
        System.out.println("---------5. avaliar---------");





       try {
           escolha = scan.nextInt();


           while (escolha != 7) {
               switch (escolha) {
                   case 1:
                       System.out.println("Você escolheu a Opção 1.\n");
                       Cadastrar.cadastrarProduto();
                       break;
                   case 2:
                       System.out.println("Você escolheu a Opção 2.\n");
                       Catalogo.catalogoprodutos();
                       break;
                   case 3:
                       System.out.println("Você escolheu a Opção 3.\n");
                       Comprar.comprarProdutos();
                       break;
                   case 4:
                       System.out.println("Volte sempre.\n");
                       break;
                   case 5:
                       System.out.println("reclamacaao.\n");
                       Reclameaqui.reclamar();
                       break;
                   case 6:
                       System.out.println("avaliar\n");
                       Avaliacao.avaliar();
                       break;
                   default:
                       System.out.println("Opção inválida. Tente novamente.\n");
               }

               System.out.println("Menu:");
               System.out.println("---------1. Cadastrar produto---------");
               System.out.println("---------2. Catálogo---------");
               System.out.println("---------3. Comprar---------");
               System.out.println("---------4. Reiniciar---------");
               System.out.println("---------5. reclamacao---------");
               System.out.println("---------6. avaliar---------");
               escolha = scan.nextInt();
           }
       }catch (InputMismatchException e){
           System.out.println("dados incorretos");
                 escolha=4;
       }


        }




}
