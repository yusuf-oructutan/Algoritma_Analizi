public class MaxSayiBrutheForce {
    public  int maxSayiBruthe(int[] arr) {
        int n = arr.length;
        while (n > 1) {                                 /*Burada brutheforce algoritmasını oluşturdum*/
            int k = (n + 1) / 2;
            for (int i = 0; i < n / 2; i++) {
                arr[i] = Math.max(arr[i],

                        arr[i + k]);
            }
            n = k;
        }
        return arr[0];
    }
}

