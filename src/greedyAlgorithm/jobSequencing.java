package greedyAlgorithm;

import java.util.*;

public class jobSequencing {

    static class Job {
        int id, deadline, profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public int[] JobScheduling(Job[] arr, int n) {

        // Sort by profit descending
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int countJobs = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {

            for (int j = arr[i].deadline; j > 0; j--) {

                if (slots[j] == -1) {
                    slots[j] = arr[i].id;
                    countJobs++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }

        return new int[]{countJobs, totalProfit};
    }

    public static void main(String[] args) {

        Job[] jobs = {
                new Job(1,4,40),
                new Job(2,1,10),
                new Job(3,1,40),
                new Job(4,1,30)
        };

        jobSequencing solver = new jobSequencing();

        int[] result = solver.JobScheduling(jobs, jobs.length);

        System.out.println("Jobs performed: " + result[0]);
        System.out.println("Total profit: " + result[1]);
    }
}