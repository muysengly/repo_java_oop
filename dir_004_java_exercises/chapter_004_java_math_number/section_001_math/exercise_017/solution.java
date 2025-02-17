import java.util.*;

class Main {
    // Prints average of a stream of numbers
    static void streamAvg(float arr[]) {
        int n = arr.length;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            // avg = getAvg(avg, arr[i], i);
            avg = (avg * i + arr[i]) / (i + 1);
            System.out.printf("Average of %d numbers is %f \n",
                    i + 1, avg);
        }
        return;
    }

    // Calculate the new average
    static float getAvg(float prev_avg, float x, int n) {
        return (prev_avg * n + x) / (n + 1);
    }

    public static void main(String[] args) {
        float arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        streamAvg(arr);
    }
}
