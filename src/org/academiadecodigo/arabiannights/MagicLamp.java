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
    Genie genie;
    private int numberOfDemons;

    public int getNumberOfGenies() {
        return numberOfGenies;
    }

    public int getMaxGenies() {
        return maxGenies;
    }


    //constructor
    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
    }

    //create new genie
    public Genie rub(int wishes) {
        if (numberOfGenies < maxGenies) {
            if (numberOfGenies % 2 == 0) {
            	numberOfGenies++;
                return new FriendlyGenie(wishes);
            } else {
            	numberOfGenies++;
                return new GrumpyGenie(wishes);
            }
        }
        numberOfDemons++;
        return new RecyclableDemon();
    }

    //feedDemon
    public Genie feedDemon(RecyclableDemon demon) {
        demon.setNoFeedDemon(false);
        numberOfGenies = 0;
        

        return genie;
    }

    //compare capacity, number of remaning geniuses and demons
    public boolean compareLamps(MagicLamp lamp2){
        System.out.println("Capacity of lamp 1: "+ this.maxGenies + " Capacity of lamp 2: "+lamp2.maxGenies);
        System.out.println("Remaining geniuses of lamp 1: "+ this.numberOfGenies + "Remaining geniuses of lamp 2: " +lamp2.numberOfGenies);
        System.out.println("Remaning demons of lamp 1: "+this.numberOfDemons + "Remaning demons of lamp 2: " + lamp2.numberOfDemons);
       
        
        
        return (this.maxGenies == lamp2.maxGenies && this.numberOfGenies == lamp2.numberOfGenies && this.numberOfDemons == lamp2.numberOfDemons);
    	
        }

	
}

	

