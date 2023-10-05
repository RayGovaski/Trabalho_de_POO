import java.util.HashMap;

class Orcamento {
    private double dinheiro;
    private HashMap<String, Integer> transacoes;
    private String cpfCliente;

    public Orcamento(double dinheiro, String cpfCliente) {
        this.dinheiro = dinheiro;
        this.transacoes = new HashMap<>();
        this.cpfCliente = cpfCliente;
    }


    public void receberDinheiro(double valor) {
        dinheiro += valor;
    }


    public void adicionarProduto(String produto, int quantidade) {
        transacoes.put(produto, quantidade);
    }


    public double verificarSaldo() {
        return dinheiro;
    }


    public void finalizarTransacao(Estoque estoque, DadosCliente dadosClientes) {

        if (dadosClientes.verificarCliente(cpfCliente)) {

            boolean produtosDisponiveis = true;
            for (String produto : transacoes.keySet()) {
                if (!estoque.verificarDisponibilidade(produto, transacoes.get(produto))) {
                    produtosDisponiveis = false;
                    System.out.println("Produto " + produto + " não está disponível em quantidade suficiente.");
                    break;
                }
            }


            if (produtosDisponiveis) {
                for (String produto : transacoes.keySet()) {
                    int quantidade = transacoes.get(produto);
                    estoque.removerProduto(produto, quantidade);
                }
                System.out.println("Transação realizada com sucesso!");
            } else {
                System.out.println("Transação não pode ser concluída devido à falta de produtos.");
            }
        } else {
            System.out.println("CPF não cadastrado. Transação não pode ser concluída.");
        }
    }
//
}
