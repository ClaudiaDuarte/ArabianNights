package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class GrumpyGenie extends Genie {


    public GrumpyGenie(int maxWishes){
        super(maxWishes);
    }


    @Override
    public void grantWish() {
        System.out.print("Grumpy Genie:");
        if(getWishedGranted() == 0){
            super.grantWish();
        } else {
            System.out.println("Sorry, you have no wishes");
        }




    }
    @Override
    public String toString(){
    	return "Grumpy Genie -> "  + super.toString();
    }
}

