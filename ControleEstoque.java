import java.util.ArrayList;

class ControleEstoque{   
    public String itensEstoque;
    public String fluxoEstoque;

    ControleEstoque(String itens){
        this.itensEstoque = itens;
    }
} 

 class Main {
    public static void main(String[] args) {
        ArrayList<ControleEstoque> listaItens = new ArrayList<>();

        ControleEstoque i1 = new ControleEstoque("café");

        listaItens.add(i1);

        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println(listaItens.get(i));
        }   
    }
}
