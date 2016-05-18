package Jeu;

public abstract class Carreau {
	private int _numero;
	private String _nomCarreau;

	public Joueur action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	public int getPos() {
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		throw new UnsupportedOperationException();
	}
}