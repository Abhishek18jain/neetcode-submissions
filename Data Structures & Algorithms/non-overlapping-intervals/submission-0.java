class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count =0;
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
       int lastKeptEnd = intervals[0][1];  
        for (int i = 1; i < intervals.length; i++){
               int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
              // 3. Overlap
            if (currentStart < lastKeptEnd) {
                // Current interval remove
                count++;
                // lastKeptEnd update nahi hoga
                // kyunki current ko keep hi nahi kiya

            } else {

                // No overlap -> current ko keep karo
                lastKeptEnd = currentEnd;
            }
        }

        return count;
        }

    }

