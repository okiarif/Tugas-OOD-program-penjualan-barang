import java.util.Scanner;
class Admin {
	public String nama ;
	public String id;
	public String alamat;
	public void input_Admin(){
	Scanner input = new Scanner (System.in);
	System.out.println("INPUT ADMIN");
	System.out.print("Nama   :");
	nama = input.nextLine();
	System.out.print("ID     :");
	id = input.nextLine();
	System.out.print("Alamat :");
	alamat = input.nextLine();

	}
	public void update_Admin(){

	}
}