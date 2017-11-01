import java.util.Scanner;
class Transaksi {
	public String no_trans;
	public String tgl_trans;

	public void membuat_transaksi(){
	Scanner input = new Scanner (System.in);
	System.out.println("BUAT TRANSAKSI");
	System.out.print("No Transaksi      :");
	no_trans = input.nextLine();
	System.out.print("Tanggal Transaksi :");
	tgl_trans = input.nextLine();

	}
}