package org.academiadecodigo.arabiannights.genie;

/**
 * Created by cadet on 22/09/15.
 */
public class RecyclableDemon extends Genie {

    private boolean noFeedDemon = true;

    public RecyclableDemon(int maxWishes) {
        super(maxWishes);
    }

    //getter noFeedDemon

    public void recycle(boolean noFeedDemon) {
        this.noFeedDemon = noFeedDemon;
    }

    @Override
    public void grantWish() {
        System.out.print("Recyclable Demon:");
        if (noFeedDemon) {
            super.grantWish();

        } else {
            System.out.println("Sorry, you have no wishes");
        }


    }

    @Override
    public String toString() {
        return "Recyclable Demon -> Wishes Used: " + getWishedGranted();
    }

}
