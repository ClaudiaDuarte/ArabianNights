package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class GrumpyGenie extends Genie {


    public GrumpyGenie(int maxWishes){
        this.maxWishes = maxWishes;
        this.numberOfWishes = 0;
    }


    @Override
    public void grantWish() {
        if(numberOfWishes == 0){
            numberOfWishes++;
            System.out.println("This wish was granted");

        } else {
            System.out.println("Sorry, you have no wishes");
        }




    }
    @Override
    public String toString(){
    	return "Grumpy Genie -> "  + super.toString();
    }
}

