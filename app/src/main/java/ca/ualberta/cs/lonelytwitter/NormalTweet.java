/**
 * Important Tweet
 * Version 1.0
 * 01/30/2018
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * You can find a copy of the licese in this project. Otherwise please contact contact@abc.ca
 * @date January 30, 2018
 * @see: Tweet.java
 *  Created by dezfuli on 1/16/18.
*/ 

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweet extends Tweet {

    /**
     * @param message: the message being tweeted.
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * @param message: the message being tweeted.
     * @param date: date of tweet
    */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
