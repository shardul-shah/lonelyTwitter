/**
 * Important Tweet
 * Version 1.0
 * 01/30/2018
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * You can find a copy of the licese in this project. Otherwise please contact contact@abc.ca
 * @see: Tweet.java
 * @version: 1.0.1
 * @date January 30, 2018
 * Created by dezfuli on 1/16/18.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    /**
     * @param message: the message in the Tweet
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * @param message: the message in the tweet
     * @param date: the date of the tweet
    */

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
