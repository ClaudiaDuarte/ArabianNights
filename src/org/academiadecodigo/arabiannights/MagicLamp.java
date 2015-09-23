package org.academiadecodigo.arabiannights;

import org.academiadecodigo.arabiannights.genie.FriendlyGenie;
import org.academiadecodigo.arabiannights.genie.Genie;
import org.academiadecodigo.arabiannights.genie.GrumpyGenie;
import org.academiadecodigo.arabiannights.genie.RecyclableDemon;

/**
 * Created by cadet on 22/09/15.
 */
public class MagicLamp {

    private int numberOfGenies;
    private int maxGenies;
    private int numberOfDemons;

    //constructor
    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
    }

    public int getNumberOfGenies() {
        return numberOfGenies;
    }

    public int getMaxGenies() {
        return maxGenies;
    }

    //create new genie
    public Genie rub(int wishes) {

        Genie genie;
        if (numberOfGenies < maxGenies) {
            if (numberOfGenies % 2 == 0) {
                genie = new FriendlyGenie(wishes);
            } else {
                genie = new GrumpyGenie(wishes);
            }
            numberOfGenies++;
        } else {
            numberOfDemons++;
            genie = new RecyclableDemon(wishes);
        }

        return genie;
    }

    //feedDemon
    public void feedDemon(RecyclableDemon demon) {
        demon.recycle(false);
        numberOfGenies = 0;
    }

    //compare capacity, number of remaning geniuses and demons
    public boolean equals(MagicLamp lamp) {
        return (this.maxGenies == lamp.maxGenies &&
                this.numberOfGenies == lamp.numberOfGenies &&
                this.numberOfDemons == lamp.numberOfDemons);
    }


}

	

