import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {

    public static ArrayList<Produto> produtos = new ArrayList<>();

    protected static void cadastrarProduto() {
        System.out.println("Digite o nome do produto");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Valor do produto :");
        System.out.println("use , para valores quebrados");

        double valor = scan.nextDouble();
        Produto produto = new Produto(nome, valor);
        produtos.add(produto);
        System.out.println("Produto foi cadastrado no sistema: " + produto.getNome());

    }


}
