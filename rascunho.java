import java.util.HashMap;

class Estoque {
    private HashMap<String, Integer> inventario;

    public Estoque() {
        this.inventario = new HashMap<>();
    }

    public void adicionarItem(String produto, int quantidade) {
        inventario.put(produto, inventario.getOrDefault(produto, 0) + quantidade);
        System.out.println("Adicionado " + quantidade + " " + produto + "(s) ao estoque.");
    }


    public void removerItem(String produto, int quantidade) {
        if (inventario.containsKey(produto)) {
            int quantidadeAtual = inventario.get(produto);
            if (quantidade <= quantidadeAtual) {
                inventario.put(produto, quantidadeAtual - quantidade);
                System.out.println("Removido " + quantidade + " " + produto + "(s) do estoque.");
            } else {
                System.out.println("Quantidade insuficiente de " + produto + " no estoque.");
            }
        } else {
            System.out.println(produto + " não encontrado no estoque.");
        }
    }

    public int verificarDisponibilidade(String produto) {
        return inventario.getOrDefault(produto, 0);
    }

    // Método para exibir o inventário completo
    public void mostrarInventario() {
        System.out.println("Inventário:");
        for (String produto : inventario.keySet()) {
            int quantidade = inventario.get(produto);
            System.out.println(produto + ": " + quantidade);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Estoque
        Estoque estoque = new Estoque();
        estoque.adicionarItem("ProdutoA", 90);
        estoque.adicionarItem("ProdutoB", 30);
        estoque.mostrarInventario();

        estoque.removerItem("ProdutoA", 20);
        estoque.mostrarInventario();

        int quantidadeDisponivel = estoque.verificarDisponibilidade("ProdutoA");
        System.out.println("Quantidade disponível de ProdutoA: " + quantidadeDisponivel);
    }
}