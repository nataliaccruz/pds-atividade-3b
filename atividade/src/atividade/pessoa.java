package atividade;

public class pessoa {
	
	    private String nome;
	    private int idade;

	    // Construtor
	    public pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    // Getters
	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    // Método para exibir informações
	    public void exibirInformacoes() {
	        System.out.println("Nome: " + nome + ", Idade: " + idade);
	    }
	}


