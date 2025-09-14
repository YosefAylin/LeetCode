class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxGainClass = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
            );
        for (int[] c : classes) {
            double pass = c[0], total = c[1];
            double gain = ((pass + 1) / (total + 1)) - (pass / total);
            maxGainClass.offer(new double[]{gain, pass, total});
        }    
        while (extraStudents-- > 0) {
            double[] top = maxGainClass.poll();
            double pass = top[1] + 1;
            double total = top[2] + 1;
            double gain = ((pass + 1) / (total + 1)) - (pass / total);
            maxGainClass.offer(new double[]{gain, pass, total});
        }
        double totalRatio = 0;
        for (double[] c : maxGainClass) {
            totalRatio += c[1] / c[2];
        }
        return totalRatio / classes.length;
    }
}
