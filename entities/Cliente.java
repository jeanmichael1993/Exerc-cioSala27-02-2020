package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	
	private List<Filme> emprestados = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void devolver(Filme filme) {
		emprestados.remove(filme);
	}
	
	public void emprestar(Filme filme) {
		emprestados.add(filme);
	}
	
	public List<Filme> getEmprestados(){
		return emprestados;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Filme x : emprestados) {
			
			sb.append(x.getNome() + "\n");
		}
		return sb.toString();
	}
}
