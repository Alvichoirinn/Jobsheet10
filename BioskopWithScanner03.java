import java.util.Scanner;
/**
 * BioskopWithScanner03
 */
public class BioskopWithScanner03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("pilih menu (1/2/3);");
            int pilihan = sc.nextInt();
            sc.nextLine();

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <=2){
                
                System.out.println("Data penonton berhasil disimpan. ");
            }else {
                System.out.println("Baris atau kolom kursi tidak tersedia. ");
            }

            if (penonton[baris - 1][kolom - 1] != null) {
                System.out.println("Kursi tidak tersedia");
            }

            penonton[baris - 1][kolom - 1] = nama;


            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                
            }

            break;

            case 2:
            System.out.println("Daftar Penonton: ");
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 2; j++){
                nama = (penonton[i][j] !=null)? penonton[i][j] : "***";
                System.out.println("Baris Kursi Ke- "+ (i+1) + ", Kolom " + (j+1) + " : " + nama);
                }
            }    
            break;

        case 3:
            sc.close();
            System.out.println("Terima kasih!");
            break;
        }
    }  
}
}


    
