package ARRAY;
// Given an array of time intervals where arr[i] = [starti, endi], the task is to merge all the overlapping intervals into one and output the result which should have only mutually exclusive intervals.
// Examples:
// Input: arr[] = [[1, 3], [2, 4], [6, 8], [9, 10]]
// Output: [[1, 4], [6, 8], [9, 10]]
// Explanation: In the given intervals, we have only two overlapping intervals [1, 3] and [2, 4]. Therefore, we will merge these two and return [[1, 4]], [6, 8], [9, 10]].
// Input: arr[] = [[7, 8], [1, 5], [2, 4], [4, 6]]
// Output: [[1, 6], [7, 8]]
// Explanation: We will merge the overlapping intervals [[1, 5], [2, 4], [4, 6]] into a single interval [1, 6].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array8 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array
        // Sort the given intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // If the list is empty or the current interval does not overlap with the last one
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(intervals[i]);
            } else {
                // There is an overlap, so we merge the current interval with the last one
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }
        
        // Convert the list of merged intervals to a 2D array
        return ans.toArray(new int[ans.size()][]);
    } 
}

