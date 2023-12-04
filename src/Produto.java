public class Produto {
    private static int cont=10;
    private int codigo;
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.codigo=cont;
        this.nome = nome;
        this.valor = valor;
        Produto.cont+=3;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        String horizontalLine = "===================================";
        String newLine = "\n";

        return horizontalLine + newLine +
                "| Produto:" + newLine +
                "| Nome: " + this.getNome() + newLine +
                "| Valor: R$ " + this.getValor() + newLine +
                "| Código: " + this.getCodigo() + newLine +
                horizontalLine + newLine;
    }

}
