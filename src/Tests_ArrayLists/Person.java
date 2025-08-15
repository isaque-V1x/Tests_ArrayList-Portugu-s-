package Tests_ArrayLists;


public class Person {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome da pessoa: " + nome + ", Idade: " + idade;
    }
}

