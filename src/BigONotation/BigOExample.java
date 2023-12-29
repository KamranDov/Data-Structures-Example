package BigONotation;

public class BigOExample {
    public static void main(String[] args) {
//        constantTime(1);
//        logarithmicTime(10);
//        linearTime(6);
//        logLinearTime(5);
//        quadraticTime(2);
//        exponentialTime(8);
        factorialTime(6);
    }

    public static void constantTime(int n) { // O(1)
        System.out.println("Constant time example: " + n);
        /*bunun constant time olma sebebi sadece 1 step-de islemesi nece defe isdesen metodu cagir veya metodun icinde
          n deyerini cagir yende 1 step-de isi hell olunur.*/
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void logarithmicTime(int n) { // O(log (n))
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Logarithmic time example: " + i);
        }
        /*yazdigin algoritmanin logarithmic time islediyini bilmek ucun baxirsan yazdigin koda eger qurdugun algoritma
          da eger n ededini bolursense demeli qurdugun algoritma da logarithmic time-dan istifade edirsen.*/
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void linearTime(int n) { // O(n)
        for (int i = 1; i <= n; i++) {
            System.out.println("Linear time example: " + i);
        }

        /*Linear time array-ler de deyer elave etmek ve ya silmek, LinkedList-de index-ne gore ve ya value-ya gore
         * deyer axtarmaq, Singly LinkedList-in ortalarina deyer elave etmek, sonra Data Structures aid olan
         * algoritmalar: Linear search, Count sort, Bucket sort, 2 dene string muqayise etmek(compareTo()) ve s. kimi
         * yerlerde Linear time istifade olunur. Linear time sabit bir asagdan yuxari dogru qalxan xett kimi tessevur
         * ede bilerik. Big O papkasinin icinde ki sekilden de girib baxmaq olar. Yeni sirayla artan deyer kimi 1,2,3...
         * */
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void logLinearTime(int n) { // O(n log(n))
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                System.out.println("Log linear time: " + i + " and " + j);
            }
        }
        /*Log Linear time Merge sort ve Quick sort algoritmalar da istifade olunur. Log Linear time isleme prinsipini
         * basa dusmek ucun logLinearTime(int n) metodunun icinde ki nested loop-lara baxsaq goreririk ki 2 loop-da
         * n defe dovr edecek. 1-ci for(i) loop-da n defe dovr edecek, 2-ci for(j) loop-da n defe dovr edecek, onda
         * bu ne olur, 2 dene n-nin dovru olur buda olur O(n log(n)) Log Linear time yeni 2 dene n-nin dovru n log(n).
         * Onuda deyim ki algortimalarin time complexity-si(zaman murekkebliyi) Log Linear time(O(n log(n))-dan sora
         * pislesmeye baslayir. Yeni bundan(n log(n)) sonrakilar algortimalarin helli ucun meslehet gorulmeyen
         * secimlerdir.*/
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void quadraticTime(int n) { // O(n^2)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Quadratic time: " + i + " and " + j);
            }
        }
        /*Eger nested loop yazirsansa, while icinde loop yazirsansa, Bubble sort, Selection sort, Insertion sort
         * yazirsansa, bunlar hamisi Quadratic time-da isleyir. Quadratic time basa dusmek ucun quadraticTime(int n)
         * metodunu icine 2 deyerini ver cap et ve sonra 2 deyerini deyis 5 ele sonra neticeye bax goreceysen ki ne
         * qeder ferq var. 2 deyerin verdik de icindeki deyerler 4 defe cap olunacaq. Ama deyisib deyeri 5 etdik de
         * goreciyik ki icinde ki  25 defe cap olunub. Yeni bu demekdir ki Quadratic time isleme prinsipi verdiyin
         * deyerin kvadrati qeder isleyir. Men ic ice 3 dene for yazsam verdiyim deyerin misalcun 5-in kubu qeder
         * cap olunacadir.*/
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void exponentialTime(int n) { // O(2^n)
        for (int i = 1; i <= Math.pow(2, n); i++) {
            System.out.println("Exponential time: " + i);
        }
        /*Girilen deyeri 2-nin kvadrati kimi misalcun girilen deyer olsun 10, 2 ustu 10, yeni 1-den basliyaraq 10 defe
         * dyerler 2-ye vurularaq arta arta gedsin gerek. Buda 10 yerine misalcun 50 olsun veya 100 olsa tessevur
         * etmek olmaz ki bu deyerler hara gedib cixacaq. Buna misal olaraq sahmatin nece kesf olunduguna ve kesf eden
         * adamin sahdan ne isdediyine baxmaq olar. Qisaca bele bir misal qeyd edib ki yer kuresi uzre insan sayisi
         * 8 milyarddir buda teqribi 2 ustu 33-dur. Indi tessevur edin ki niye gore Exponential Time algortima
         * hellerinde niye pis bir secimdir.*/
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static void factorialTime(int n) { // O(n!)
        for (int i = 1; i < factorial(n); i++) {
            System.out.println("Factorial time: " + i);
        }
    }

    private static int factorial(int factoNum) {
        int result = 1;
        for (int k = 2; k <= factoNum; k++) {
            result = result * k;
        }
        return result;

        /*Exponential time-dan da daha pis Factorial time-dir. Ne olur olsun gerek yazdigin algortima Factorial time-da
         * yazilmasin gerek.*/
    }
}
