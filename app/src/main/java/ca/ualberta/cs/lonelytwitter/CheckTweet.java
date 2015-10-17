package ca.ualberta.cs.lonelytwitter;

/**
 * Created by rupehra on 10/16/15.
 */
public class CheckTweet  {
    private static CheckTweet ourInstance = new CheckTweet();

    public static CheckTweet getInstance() {
        return ourInstance;
    }

    private CheckTweet() {
    }
}
