package Arrays;

public class trappinRainWater {
    public static int trapWater(int[] height, int w) {
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; ++i) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        System.out.print("\n left max height  ");

        for (int i = 0; i < height.length; ++i) {
            System.out.print(leftMax[i] + " ");
        }

        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; --i) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        System.out.print(" \n right max height ");

        for (int i = 0; i < height.length; ++i) {
            System.out.print(rightMax[i] + " ");
        }

        int TWL = 0;

        for (int i = 0; i < height.length; ++i) {
            int WLH = Math.min(leftMax[i], rightMax[i]);
            System.out.println("\nWLH " + WLH);
            int WL = 0;
            WL += (WLH - height[i]) * w;
            System.out.println("WL " + WL);
            TWL += WL;
        }

        return TWL;
    }

    public static void main(String[] args) {
        int[] height = new int[]{4, 5, 2, 3, 9, 7, 5};
        int w = 1;
        int trapWaterLevel = trapWater(height, w);
        System.out.println("\n trapped water level " + trapWaterLevel);
    }
}
