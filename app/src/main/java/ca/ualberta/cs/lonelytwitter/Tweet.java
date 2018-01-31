/**
 * Important Tweet
 * Version 1.0
 * 01/30/2018
 * Copyright © 2018 Team K. CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * You can find a copy of the licese in this project. Otherwise please contact contact@abc.ca
 * Created by dezfuli on 1/16/18.
 *  @date January 30, 2018
*/ 


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;



public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

/**
 * @param message: the message in the tweet
*/

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * @param message: the message in the tweet
     * @param date: the date of the tweet
     */

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * @param message: the message in the tweet
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    /**
     * @param date: the date of the tweet
     */

    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    public String toString() {
        return date.toString() + " | " + message;
    }

}
