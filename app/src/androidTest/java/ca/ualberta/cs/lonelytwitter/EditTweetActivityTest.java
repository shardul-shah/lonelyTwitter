package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.robotium.solo.Solo;
import junit.framework.TestCase;


/**
 * Created/modified by shardul on 3/1/18.
 */

public class EditTweetActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public EditTweetActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testEditViewText() throws Exception {

        solo.assertCurrentActivity("Wrong Activity!", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Tweet test!");
        solo.clickOnButton("Save");
        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong activity!", EditTweetActivity.class);
        assertTrue(solo.waitForText("Tweet test!"));

    }


    @Override
    public void tearDown() throws Exception{
        solo.finishOpenedActivities();
    }

}
