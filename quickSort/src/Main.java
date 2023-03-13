import java.util.Random;
public class Main {
    public static void main(String[] args) {
            int[] arr = new int[10000];     // Bu kısımda 10000 Sayılık bir dizi oluşturdum
            Random rand = new Random();     // Bu kısıdma Random nesnesini kullandım

        for (int i = 0; i < 10000; i++) {
            arr[i] = rand.nextInt(10000);       // Bu döngüde dizimize rastgele elemanlar atadım
        }
            long start = System.nanoTime();             // Burada işlemimizin kaç ms sürdüğünü ölçmek için işlemimizden önce start değişkeni tanımlıyorum ve System.nanotime kullanıyorum

            QuickSort q =new QuickSort();
            q.quickSort(arr, 0, arr.length - 1);        // Bu kısımda Quicksort nesnemizi tanımlıyorum ve değerlerimi tanımlıyorum quicksort methoduna


        long end = System.nanoTime();   // Burda işlemimizin Kaçıncı saniyede bittiğini ölçmek için System.nanotime i kullanıyorum

        long time = (end - start) /  1000000; // (Mili Saniyeye Çevirdik) Burada kaç ms sürdüğünü ölçüyoruz


        System.out.println("Quicksort Süresi: " + time + " ms");


        BruteForceSort bruteForceSort =new BruteForceSort(); /*  Bu kod blogunda ilk önce nesnemizi oluşturduk daha sonra quickSorttaki gibi işlemlerimizi tanımladık*/

        long startTime = System.nanoTime();
        bruteForceSort.bubbleSort(arr);
        long endTime = System.nanoTime();
        long time2 = (endTime - startTime) / 1000000;
        System.out.println("BubbleSort süresi: " + time2 + "ms");

    }
    }


