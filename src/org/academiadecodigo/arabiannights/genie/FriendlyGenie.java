package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class FriendlyGenie extends Genie {


    //constructor
    public FriendlyGenie(int maxWishes){
        super(maxWishes);
    }


    @Override
    public void grantWish() {
        System.out.print("Friendly Genie: ");
        if(getWishedGranted()<= getMaxWishes()){
            super.grantWish();

        } else {
            System.out.println("Sorry, you have no wishes");
        }




    }
    @Override
    public String toString(){
    	return "Friendly Genie -> "  + super.toString();
    }
}

