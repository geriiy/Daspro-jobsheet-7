import java.util.Scanner;

public class WhileKelipatan12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlah = 0, kelipatan, counter = 0, average = 0;
       

        System.out.print("Masukkan bilangan kelipatan  (1-9): ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                average = jumlah / counter;

            }
            
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
            System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, average);
            
            i++;
                    
            
        }

        
    }
    
}
