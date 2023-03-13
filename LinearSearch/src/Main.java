import java.util.Random;

public class Main {

        public static void main(String[] args) {

            MaxSayi mx =new MaxSayi();

            System.out.println("--------------------------------------------------LinearSearch-------------------------------------------------");
            int[] dizi = new int[10000];// Bu kısımda 10000 Sayılık bir dizi oluşturdum
            Random rand = new Random();         // Bu kısıdma Random nesnesini kullandım
            for (int i = 0; i < dizi.length; i++) {
                dizi[i] = rand.nextInt();                    // Bu döngüde dizimize rastgele elemanlar atadım
            }
            double start = System.nanoTime(); // Burada işlemimizin kaç ms sürdüğünü ölçmek için işlemimizden önce start değişkeni tanımlıyorum ve System.nanotime kullanıyorum

            int max = mx.findMax(dizi);      // Bu kısımda max isimli değişken  tanımlıyorum ve değerlerimi tanımlıyorum
            double end = System.nanoTime();     // Burda işlemimizin Kaçıncı saniyede bittiğini ölçmek için System.nanotime i kullanıyorum
            double duration = (end - start) / 1000000;  // (Mili Saniyeye Çevirdik) Burada kaç ms sürdüğünü ölçüyoruz
            System.out.println("En büyük Sayi: " + max);
            System.out.println("Linear Arama Sonucunda: " + duration + " ms sürdü");

            System.out.println("----------------------------------------- BrutheAlgoritması --------------------------------------------------");

            MaxSayiBrutheForce bruthe =new MaxSayiBrutheForce();        //Buraada bruthe isimli nesnemizi oluşturuyorum.

s
            double startTime = System.nanoTime();
            int maxi = bruthe.maxSayiBruthe(dizi);
            double endTime = System.nanoTime();
            double sonuc = (endTime - startTime) / 1000000;
            System.out.println("En Büyük Sayi: " + maxi);
            System.out.println("BrutheForce algoritmamızda " + sonuc + " ms sürdü");
        }
    }
