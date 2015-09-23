package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class Genie {

	private int maxWishes;
	private int wishedGranted = 0;

	public Genie(int maxWishes) {
		this.maxWishes = maxWishes;
	}

	public int getWishedGranted() {
		return wishedGranted;
	}

	public int getMaxWishes() {
		return maxWishes;
	}

	// grantWish

	public void grantWish() {
		wishedGranted++;
		System.out.println("This wish was granted");
	}

	@Override
	public String toString() {
		return "Max wishes: "+ maxWishes + " Wishes Used: " + wishedGranted;
	}

}
