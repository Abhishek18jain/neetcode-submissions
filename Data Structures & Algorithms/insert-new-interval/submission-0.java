class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // first we'll create a new interval
        List<int []> list = new ArrayList<>();
        for(int i = 0; i<intervals.length;i++){
            list.add(intervals[i]);
        }
        list.add(newInterval);
        list.sort((a, b) -> Integer.compare(a[0], b[0]));
           for(int i = 0;i<list.size()-1;){
            int[] start1 = list.get(i);
            int[] start2 = list.get(i + 1);
            if(start1[1] >= start2[0]){
                // merge start
                  start1[0] = Math.min(start1[0], start2[0]);
                // Merge end
               start1[1] = Math.max(start1[1], start2[1]);
            //    remove from list
            list.remove(i+1);
            }else{
                i++;
            }
           }
            return list.toArray(new int[list.size()][]);
            }
}
