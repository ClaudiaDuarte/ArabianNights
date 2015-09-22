package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class Genie {

	protected int maxWishes;
	protected int numberOfWishes;

	public Genie(int maxWishes) {
		this.maxWishes = maxWishes;
		this.numberOfWishes = 0;
	}

	// default constructor
	public Genie() {
	}

	// grantWish

	public void grantWish() {

	}

	@Override
	public String toString() {
		return "Max wishes: "+ maxWishes + " Wishes Used: " + numberOfWishes;
	}

}
