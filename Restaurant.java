package W4StudiKasus;

public class Restaurant {
	
	public static class Menu {
		private String[] nama_makanan;
		private double[] harga_makanan; 
		private int[] stok;
		private static byte id = 0;
		
		public String[] getNama_makanan() {
			return nama_makanan;
		}

		public double[] getHarga_makanan() {
			return harga_makanan;
		}
		
		public int[] getStok() {
			return stok;
		}
		
		public static byte getId() {
			return id;
		}
	}
	
	private Menu[] menu; //deklarasi array bernama menu yang memiliki tipe data Menu.
	
	public Restaurant () { //constructor
	menu = new Menu[10];
	for (int i = 0; i < 10; i++) {
		menu[i] = new Menu();
		menu[i].nama_makanan = new String[10];
		menu[i].harga_makanan = new double[10];
		menu[i].stok = new int[10];
		}
	}
	
	public void tambahMenuMakanan (String nama, double harga, int stok) {
	menu[Menu.getId()].nama_makanan[Menu.getId()] = nama;
	menu[Menu.getId()].harga_makanan[Menu.getId()] = harga;
	menu[Menu.getId()].stok[Menu.getId()] = stok;
	Menu.getId();
	}
	
	public void tampilMenuMakanan () {
	for (int i=0; i<=Menu.getId(); i++) {
	if(!isOutOfStock (i)) {
	System.out.println(menu[i].nama_makanan[i] +" ["+menu[i].stok[i]+"]"+"\tRp. "+menu[i].harga_makanan[i]);
			}
		}
	}
	
	public boolean isOutOfStock (int id) {
	if (menu[id].stok[id] == 0) {
	return true;
	}else{
	return false;
		}
	}
	
	public static void nextId() {
	Menu.id++;
	}
	
	public void pesanMakanan (String nama, int jmlh) {
		for(int i = 0; i <= Menu.getId(); i++) {
			if(menu[i].nama_makanan[i].equalsIgnoreCase(nama)&&menu[i].stok[i]>=jmlh){
				System.out.println("Nama Menu: " + menu[i].nama_makanan[i]);
				System.out.println("Jumlah: " + jmlh);
				System.out.println("Total: Rp." + menu[i].harga_makanan[i] * jmlh);
				menu[i].stok[i]-=jmlh;
				tampilMenuMakanan();
				return;
			}
		}
	}
}