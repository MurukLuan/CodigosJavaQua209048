package entities;

import java.util.ArrayList;

public class Herois {
	private String identidadeSecreta;
	private String universoPertence;
	private String nomeDeHeroi;
	private String pertenceAoGrupoLiga;
	private String cidadeNatal;
	private String baseSecreta;
	private String planetaNatal;
	private ArrayList<String> superPoderes;
	private int idade;
	private boolean estaNaAtiva;

	public Herois() {
	}

	public Herois(String identidadeSecreta, String universoPertence, String nomeDeHeroi, String pertenceAoGrupoLiga,
			String cidadeNatal, String baseSecreta, String planetaNatal, ArrayList<String> superPoderes, int idade,
			boolean estaNaAtiva) {
		super();
		this.identidadeSecreta = identidadeSecreta;
		this.universoPertence = universoPertence;
		this.nomeDeHeroi = nomeDeHeroi;
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
		this.cidadeNatal = cidadeNatal;
		this.baseSecreta = baseSecreta;
		this.planetaNatal = planetaNatal;
		this.superPoderes = superPoderes;
		this.idade = idade;
		this.estaNaAtiva = estaNaAtiva;
	}

	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}

	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}

	public String getUniversoPertence() {
		return universoPertence;
	}

	public void setUniversoPertence(String universoPertence) {
		this.universoPertence = universoPertence;
	}

	public String getNomeDeHeroi() {
		return nomeDeHeroi;
	}

	public void setNomeDeHeroi(String nomeDeHeroi) {
		this.nomeDeHeroi = nomeDeHeroi;
	}

	public String getPertenceAoGrupoLiga() {
		return pertenceAoGrupoLiga;
	}

	public void setPertenceAoGrupoLiga(String pertenceAoGrupoLiga) {
		this.pertenceAoGrupoLiga = pertenceAoGrupoLiga;
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public String getBaseSecreta() {
		return baseSecreta;
	}

	public void setBaseSecreta(String baseSecreta) {
		this.baseSecreta = baseSecreta;
	}

	public ArrayList<String> getSuperPoderes() {		
		return superPoderes;
	}

	public void setSuperPoderes(ArrayList<String> superPoder) {
		this.superPoderes = superPoder;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEstaNaAtiva() {
		return estaNaAtiva;
	}

	public void setEstaNaAtiva(boolean estaNaAtiva) {
		this.estaNaAtiva = estaNaAtiva;
	}
	

	public String getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Identidade Secreta: " + getIdentidadeSecreta()
				+"\nUniverso que pertence: " + getUniversoPertence()
				+"\nNome de heroi: " + getNomeDeHeroi()
				+"\nPlaneta natal: " + getPlanetaNatal()
				+"\nGrupo ou liga: " + getPertenceAoGrupoLiga()
				+"\nCidade natal: " + getCidadeNatal()
				+"\nBase secreta: " + getBaseSecreta()
				+"\nSuper Poderes: " + getSuperPoderes()
				+"\nIdade: " + getIdade()
				+"\nEsta na ativa: " + isEstaNaAtiva()
				+"\n";
	}

}
