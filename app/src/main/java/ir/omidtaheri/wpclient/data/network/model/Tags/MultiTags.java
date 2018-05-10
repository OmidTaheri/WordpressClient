package ir.omidtaheri.wpclient.data.network.model.Tags;

/**
 * Created by om on 10/29/2017.
 */

public class MultiTags {


    public static String toString(int[] tags) {
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < tags.length - 1; i++) {

            g.append(tags[i] + ",");
        }

        g.append(tags[tags.length - 1]);
        return g.toString().trim();
    }
}
