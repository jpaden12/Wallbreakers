/* Leetcide #56 Merge Intervals
    Given a collection of intervals, merge all overlapping intervals.

*/

public int[][] merge(int[][] intervals) {
    List<int[]> fixed_intervals = new ArrayList<>(); 
    List<Integer> merged_index = new ArrayList<>();
    for (int i = 0; i < intervals.length; i++) {
        if (i+1 < intervals.length - 1 && intervals[i][1] >= intervals[i+1][0]) {
            int[] fixed = {intervals[i][0], intervals[i + 1][1] };
            fixed_intervals.add(fixed);
            merged_index.add(i); 
        } else {
            if (i >= 1 && !merged_index.contains(i - 1)) {
                fixed_intervals.add(intervals[i]); 
            }
        }
        for (int j = 0; j < fixed_intervals.size(); j++) {
            //System.out.print(Arrays.toString(fixed_intervals.get(j))); 
        }
        //System.out.println(); 
    }
    return fixed_intervals.toArray(new int[1][fixed_intervals.size()]);
}