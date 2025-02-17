
import java.util.*;

public class Solution {
    public static void main(String[] args) throws java.lang.Exception {
        // Create an ArrayList of Interval objects
        ArrayList<Interval> x = new ArrayList<>();

        // Add intervals to the ArrayList
        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

        // Merge overlapping intervals
        x = merge(x);

        // Print the merged intervals
        for (Interval i : x) {
            System.out.println(i.getStart() + " " + i.getEnd());
        }
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Check for the number of intervals
        if (intervals.size() == 0 || intervals.size() == 1)
            return intervals;

        // Sort the intervals based on the start values
        Collections.sort(intervals, new IntervalComparator());

        // Initialize the variables
        Interval first = intervals.get(0);
        int start = first.getStart();
        int end = first.getEnd();

        // Create a list for the merged intervals
        ArrayList<Interval> result = new ArrayList<Interval>();

        // Merge overlapping intervals
        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.getStart() <= end) {
                end = Math.max(current.getEnd(), end);
            } else {
                result.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        // Add the last merged interval
        result.add(new Interval(start, end));
        return result;
    }
}

class Interval {
    private int start;
    private int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2) {
        // Compare intervals based on start values
        return i1.getStart() - i2.getStart();
    }
}
