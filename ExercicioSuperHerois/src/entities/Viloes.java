package entities;

import java.util.ArrayList;

public class Viloes {
	private String nomeVilao;
	private String identidadeSecreta;
	private ArrayList<String> poderes;
		
	public Viloes() {
		
	}
		
	public Viloes(String nomeVilao, String identidadeSecreta, ArrayList<String> poderes) {
		super();
		this.nomeVilao = nomeVilao;
		this.identidadeSecreta = identidadeSecreta;
		this.poderes = poderes;
	}
	public String getNomeVilao() {
		return nomeVilao;
	}
	public void setNomeVilao(String nomeVilao) {
		this.nomeVilao = nomeVilao;
	}
	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}
	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}
	public ArrayList<String> getPoderes() {
		return poderes;
	}
	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nomeVilao;
	}

}
