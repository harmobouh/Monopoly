package Jeu;

import Jeu.Carreau;
import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	public ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;

	public void payerLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public int getNbGares(Joueur aJProprio) {
		throw new UnsupportedOperationException();
	}

	public Carreau getCarreauActuel() {
		throw new UnsupportedOperationException();
	}

	public int getCash() {
		return this._cash;
	}

	public void setCarreau(Carreau aCarreau) {
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		throw new UnsupportedOperationException();
	}
}