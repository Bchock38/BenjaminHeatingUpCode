/**
 * The class WeatherPatterns finds the longest span of days in which
 * each day’s temperature is higher than on the previous day in that sequence.
 *
 * @author Zach Blick
 * @author YOUR NAME HERE
 */

public class WeatherPatterns {


    /**
     * Longest Warming Trend
     * @param temperatures
     * @return the longest run of days with increasing temperatures
     */
    public static int longestWarmingTrend(int[] temperatures) {
        // TODO: Write your code here!
    int currentBigNum;
    int trend = 1;
    currentBigNum = temperatures[0];
    int orgNum = temperatures[0];
    for (int i = 1; i < temperatures.length; i++){
        if (currentBigNum < temperatures[i]){
            trend++;
            currentBigNum = temperatures[i];
        }
        else if (orgNum > temperatures[i] && temperatures.length - i > trend){
            orgNum = temperatures[i];
            currentBigNum = temperatures[i];
            trend = 1;
        }
    }

        return trend;
    }
}
