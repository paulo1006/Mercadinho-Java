import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Comprar extends Cadastrar {
    private static Map<Produto, Integer> carrinho;

    protected static void comprarProdutos() {
        if (carrinho == null) {
            carrinho = new HashMap<>();
        }

        if (!produtos.isEmpty()) {


            System.out.println("--------------- Produtos Disponíveis ---------------");

            for (Produto p : produtos) {
                System.out.println(p);
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Código do produto: ");
            int codigo = Integer.parseInt(scan.next());
            boolean validador = false;

            for (Produto p : produtos) {
                if (p.getCodigo() == codigo) {
                    int quantidadeP = 0;
                    try {
                        quantidadeP = carrinho.get(p);
                        carrinho.put(p, quantidadeP + 1);
                    } catch (NullPointerException e) {
                        carrinho.put(p, 1);
                    }
                    System.out.println(p.getNome() + " foi adicionado");
                   validador = true;
                    break;
                }
            }

            if (!validador) {
                System.out.println("Produto não encontrado");
            }

            System.out.println("Digite 1 para finalizar a compra ou 2 para adicionar mais produtos");
            int opcao = Integer.parseInt(scan.next());
            if (opcao == 1) {
                finalizarCompras();
            } else if (opcao == 2) {
                comprarProdutos();
            }
        } else {
            System.out.println("Não há produtos cadastrados");
        }
    }

    protected static void finalizarCompras() {
        double valorCompra = 0.0;
        System.out.println("Seus produtos: ");
        for (Produto p : carrinho.keySet()) {
            int quantidade = carrinho.get(p);
            valorCompra += p.getValor() * quantidade;
            System.out.println(p);
            System.out.println("Quantidade: " + quantidade);
        }
        System.out.println("O valor de sua compra é " + valorCompra);
        carrinho.clear();
    }
}