package leetcode;

public class LeetCode3633 {
    public static void main(String[] args) {
        int[] landStart1 = {1};
        int[] landDur1 = {3};
        int[] waterStart1 = {2};
        int[] waterDur1 = {4};

        int result1 = earliestFinishTime(landStart1, landDur1, waterStart1, waterDur1);
        System.out.println("Test Case 1 - " + result1);

        int[] landStart2 = {2, 10};
        int[] landDur2 = {8, 5};
        int[] waterStart2 = {5, 11};
        int[] waterDur2 = {7, 9};

        int result2 = earliestFinishTime(landStart2, landDur2, waterStart2, waterDur2);
        System.out.println("Test Case 2 - " + result2);
    }

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd, landStartTime[i] + landDuration[i]);
        }

        int landFirstTotalEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            int actualWaterStart = Math.max(waterStartTime[i], minLandEnd);
            landFirstTotalEnd = Math.min(landFirstTotalEnd, actualWaterStart + waterDuration[i]);
        }

        int minWaterEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterEnd = Math.min(minWaterEnd, waterStartTime[i] + waterDuration[i]);
        }

        int waterFirstTotalEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int actualLandStart = Math.max(landStartTime[i], minWaterEnd);
            waterFirstTotalEnd = Math.min(waterFirstTotalEnd, actualLandStart + landDuration[i]);
        }

        return Math.min(landFirstTotalEnd, waterFirstTotalEnd);
    }
}
