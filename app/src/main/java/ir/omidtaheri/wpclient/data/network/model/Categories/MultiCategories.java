package ir.omidtaheri.wpclient.data.network.model.Categories;


public class MultiCategories {


    public static String toString(int[] categories) {
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < categories.length - 1; i++) {

            g.append(categories[i] + ",");
        }

        g.append(categories[categories.length - 1]);

        return g.toString();
    }
}
