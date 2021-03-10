package greedyAlgorithms.activitySelectionProblem;

import java.util.Arrays;
import java.util.Comparator;

/*
Given n activities, choose maximum number of activities with no clashing start and end times.
Eg :
    Activity    A1      A2      A3      A4      A5      A6
    Start       0       3       1       5       5       8
    Finish      6       4       2       9       7       9

    Output : A3 => A2 => A5 => A6

    Algo :
        1. Sort by finish time
        2. Print the first activity
        3. If start time of activity is greater or equal to finish time of the
           previous activity pick it

Time complexity : O(N + N * log N)
complexity N * log N for sorting and N for printing the correct activity
 */
public class ActivitySelectionProblem {
    public static class Activity {
        int start;
        int end;
        String activityName;

        Activity(int start, int end, String activityName) {
            this.start = start;
            this.end = end;
            this.activityName = activityName;
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
        new Activity(0, 6, "A1"),
        new Activity(3, 4, "A2"),
        new Activity(1, 2, "A3"),
        new Activity(5, 9, "A4"),
        new Activity(5, 7, "A5"),
        new Activity(8, 9, "A6")
        };
        Arrays.sort(activities, Comparator.comparingInt(o -> o.end));

        Activity previous = activities[0];
        System.out.print(previous.activityName + " ===> ");
        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= previous.end) {
                System.out.print(activities[i].activityName + " ===> ");
                previous = activities[i];
            }
        }
    }
}
