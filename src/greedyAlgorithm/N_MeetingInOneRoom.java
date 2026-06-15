package greedyAlgorithm;

import java.util.Arrays;

public class N_MeetingInOneRoom {
    static class timing {
        int st, ed, pos;

        timing(int st, int ed, int pos) {
            this.st = st;
            this.ed = ed;
            this.pos = pos;
        }
    }

    public static int maxMeetingPerform(timing[] meeting) {
        Arrays.sort(meeting, (a, b) -> a.ed - b.ed);
        int cnt = 0;
        int endtime = -1; // meeting end time  -1 means no meeting performed
        for (int i = 0; i < meeting.length; i++) {
            if (endtime < meeting[i].st) {
                endtime = meeting[i].ed;
                cnt++;
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        int start[] = {0, 3, 1, 5, 5, 8};
        int end[] = {5, 4, 2, 9, 7, 9};
        int n = start.length;
        timing[] meeting = new timing[n];
        for (int i = 0; i < n; i++) {

            meeting[i] = new timing(start[i], end[i], i + 1);
        }
        int res = maxMeetingPerform(meeting);
        System.out.println(res);

    }

}
