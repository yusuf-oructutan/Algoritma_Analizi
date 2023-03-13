public class MaxSayi {
    public  int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {                  /*Burada LinearSearch algoritmasını oluşturdum */
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
