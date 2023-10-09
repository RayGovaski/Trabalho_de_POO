import java.util.ArrayList;

class ControleEstoque{   
    public String itensEstoque;
    public String fluxoEstoque;

    ControleEstoque(String itens){
        this.itensEstoque = itens;
    }

    public String getItens() {
        return itensEstoque;
    }

    public void criarLista(String itens) {
        
    }

    public void setItens(String itens) {
  
    }
} 

 class Main {
    public static void main(String[] args) {  //agora tenho que trocar o tipo String p classe p conseguir usar o atributo como lista
        ArrayList<String> listaItens = new ArrayList<String>();
        listaItens.add("Café");
        listaItens.add("açúcar");

        for (int i = 0; i < listaItens.size(); i ++) {
        System.out.println(listaItens.get(i));
    }
    }    
}
