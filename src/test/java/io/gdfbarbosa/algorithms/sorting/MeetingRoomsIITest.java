package io.gdfbarbosa.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeetingRoomsIITest {

    @Test
    public void minMeetingRooms1() {
        assertEquals(2, new MeetingRoomsII().minMeetingRooms(new int[][]{
                {0,30},
                {5,10},
                {15,20}
        }));
    }

    @Test
    public void minMeetingRooms2() {
        assertEquals(1, new MeetingRoomsII().minMeetingRooms(new int[][]{
                {7,10},
                {2,4}
        }));
    }
}