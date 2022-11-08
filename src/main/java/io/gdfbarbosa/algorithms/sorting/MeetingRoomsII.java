package io.gdfbarbosa.algorithms.sorting;

import java.util.*;

/**
 * Meeting rooms II problem using Heap to control conflicts in rooms.
 * <a href="https://leetcode.com/problems/meeting-rooms-ii/description/">253. Meeting Rooms II</a>
 */
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // min-heap to keep finish time of meeting
        Queue<Integer> calendar = new PriorityQueue<>(intervals.length, Comparator.comparingInt(a -> a));

        // sort by starting time
        Arrays.sort(intervals, Comparator.comparingInt((int[] o) -> o[0]));

        // add end of meeting
        calendar.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // meeting is starting after end of another meeting, remove from calendar
            Integer endOfMeeting = calendar.peek();
            if (endOfMeeting != null && intervals[i][0] >= endOfMeeting) {
                calendar.poll();
            }
            // add end of meeting
            calendar.add(intervals[i][1]);
        }
        // total meetings with conflicts
        return calendar.size();
    }
}
