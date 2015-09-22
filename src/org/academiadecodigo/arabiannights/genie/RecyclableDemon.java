package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class RecyclableDemon extends Genie {


    private boolean noFeedDemon = true;



    public void setNoFeedDemon(boolean noFeedDemon) {
        this.noFeedDemon = noFeedDemon;
    }



    //getter noFeedDemon





    public RecyclableDemon() {
        this.numberOfWishes = 0;
    }


    @Override
    public void grantWish() {
        if(noFeedDemon){
            numberOfWishes++;
            System.out.println("This wish was granted");

        } else {
            System.out.println("Sorry, you have no wishes");
        }


    }
    
    @Override
    public String toString(){
    	return "Recyclable Demon -> Wishes Used: " + numberOfWishes;
    }

}
