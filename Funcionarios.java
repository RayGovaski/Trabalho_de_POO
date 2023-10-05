class Funcionarios{
    private double salario;
    private int cpf;

    Funcionarios(double salario, int cpf){
        this.salario = salario;
        this.cpf = cpf;
    }
    public double getSalario(){
        return salario;

    }
    public double setSalario(double salario){
        this.salario = salario
    }

    public int getCpf(){
        return cpf;

    }
    public int setCpf(double cpf){
        this.cpf = cpf
    }
    public void informacoes(){
        System.out.println("CPF do funcionario:"+ cpf)
        System.out.println("Salario do funcionario é: R$"+ salario)//
    }
}
