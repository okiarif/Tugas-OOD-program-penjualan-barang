import java.util.Scanner;

class Barang {
	
	public String nama_brg;
	public String harga_brg;
	public String jumlah;
	public String supplier;

	public void tambah(){
	Scanner input = new Scanner (System.in);
	System.out.println("INPUT BARANG");
	System.out.print("Nama Barang     :");
	nama_brg = input.nextLine();
	System.out.print("harga Barang    :");
	harga_brg = input.nextLine();
	System.out.print("Jumlah Barang   :");
	jumlah = input.nextLine();
	System.out.print("Supplier Barang :");
	supplier = input.nextLine();


	}
	public void ubah(){
		
	}
	public void hapus (){
		
	}
	public void retur(){
		
	}
}