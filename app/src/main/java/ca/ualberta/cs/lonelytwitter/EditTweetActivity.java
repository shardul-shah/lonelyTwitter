package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Edited by Shardul on March 1, 2018
 */

public class EditTweetActivity extends Activity {
    private String theTweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent intent = getIntent();

        theTweet = intent.getStringExtra("theTweet");

        final TextView editView =(TextView) findViewById(R.id.TweetDisplay);
        editView.setText(theTweet);

    }

    public String getOldTweet(){
        return theTweet;
    }

}
