public class NetPrice {
    // Function calculating Net Price based on Gross Price and Tax Rate (in percentage) parameters.
    public static float calculate(float grossPrice, float taxRate) {
        return grossPrice / ((1 + taxRate / 100));
    }
}
