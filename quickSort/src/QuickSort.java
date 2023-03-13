public class QuickSort {

        public  void quickSort(int[] dizi, int baslangic, int bitis) {
            if (baslangic < bitis) {
                int bolmeIndex = bolme(dizi, baslangic, bitis);         /* Bu methoda quicksort algoritmasının hangi şartta çalışacağını tek tek belirtim*/
                quickSort(dizi, baslangic, bolmeIndex - 1);
                quickSort(dizi, bolmeIndex + 1, bitis);
            }
        }

        private static int bolme(int[] dizi, int baslangic, int bitis) {
            int pivot = dizi[bitis];
            int i = baslangic - 1;
            for (int j = baslangic; j < bitis; j++) {
                if (dizi[j] < pivot) {
                    i++;
                    int temp = dizi[i];                             /* Bu methoda seçeceğimiz pivot değerinin hangi şartlarda olmasını kararlaştırdım*/
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
            int temp = dizi[i + 1];
            dizi[i + 1] = dizi[bitis];
            dizi[bitis] = temp;
            return i + 1;
        }

    }