import java.util.Scanner;

public class ModifikasiDoWhileCuti29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Jumlah hari cuti yang diminta melebihi jatah cuti Anda.");
                    System.out.print("Apakah anda ingin mengisi jumlah hari cuti lagi (y/t)? ");
                    konfirmasi = sc.next();
                    if (konfirmasi.equalsIgnoreCase("t")) {
                        break;
                    }
                }
            }
        } while (jatahCuti > 0);
    }
}
