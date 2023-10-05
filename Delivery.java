class Delivery{
    public boolean confirmaçãoEntrega;

    Delivery(String tempoEntrega, boolean confirmaçãoEntrega){
        this.confirmaçãoEntrega = confirmaçãoEntrega;
    }

    public void confirmarEntrega(boolean confirmaçãoEntrega){
        confirmaçãoEntrega = confirmarEntrega();
          if(confirmaçãoEntrega = true){
              System.out.println("Sua entrega foi confirmada")
          }
          else{
              System.out.println("Sua entrega ainda não foi realizada")
          }
    }
}