

import java.util.ArrayList;
    public class Catalogo extends Cadastrar {

        protected static void catalogoprodutos(){
            if (!Cadastrar.produtos.isEmpty()){
                System.out.println("lista de produtos : \n");
                for (Produto p: Cadastrar.produtos ){
                    System.out.println(p);
                }
            }
            else{
                System.out.println("nenhum produto cadastrado");

            }
        }
    }


