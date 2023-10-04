import java.util.Scanner;
    public class ModifHargaBayar14 {
        public static void main (String[] args) {
Scanner sc =new Scanner(System.in);
int harga, jumlah, jumlahHalaman;
double dis, total, bayar, jmlDis;
String merkBuku;

System.out.println("Masukkan merk buku ");
merkBuku=sc.next();
System.out.println("Masukkan halaman buku ");
jumlahHalaman=sc.nextInt();
System.out.println("Masukkan harga barang yang dibeli ");
harga=sc.nextInt();
System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
jumlah=sc.nextInt();
System.out.println("Masukkan besar diskon (0.1 sebagai 10%) ");
dis=sc.nextDouble();

total=harga*jumlah;
jmlDis=total*dis;
bayar=total-jmlDis;

System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
System.out.println("Jumlah yang harus dibayar adalah " +bayar);
        }
    }