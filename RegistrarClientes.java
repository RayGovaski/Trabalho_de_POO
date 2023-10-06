 class RegistrarClientes extends DadosClientes{

    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String toString() {
        return "CPF: " + cpf + "\nNome: " + nome + "\nTelefone: " + telefone;
    }
}