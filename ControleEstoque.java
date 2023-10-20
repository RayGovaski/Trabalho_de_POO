import java.util.List;
import java.util.ArrayList;

public class ControleEstoque {
    private List<String> listaItens;

    public ControleEstoque() {
        listaItens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        listaItens.add(item);
        System.out.println("Adicionando" + item + "(s) ao estoque.");
    }

    public void removerItem(String item) {
        if (ControleEstoque.containsKey(item)) {
            int quantidadeAtual = ControleEstoque.get(item);
            if (quantidade <= quantidadeAtual) {
                ControleEstoque.put(item, quantidadeAtual - quantidade);
                System.out.println("Removido " + quantidade + " " + item + "(s) do estoque.");
            } else {
                System.out.println("Quantidade insuficiente de " + item + " no estoque.");
            }
        } else {
            System.out.println(item + " não encontrado no estoque.");
        }
    }

    public void imprimirLista() {
        for (String item : listaItens) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
       ControleEstoque i1 = new ControleEstoque();
        i1.adicionarItem("Item 1");
        i1.adicionarItem("Item 2");
        i1.imprimirLista();
        i1.removerItem("Item 1");
        i1.imprimirLista();
    }
}