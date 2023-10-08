package Temel_Kavramlar;


import java.util.Scanner;
public class TamBölenlerSayisi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi = 80;
		int bolen = 1;
		int tamBolenlerTop = 0;
		while(bolen <= sayi) {
			if(sayi % bolen == 0) {
				System.out.println(sayi+" sayısı "+bolen+" sayısına tam bölünür.");
				tamBolenlerTop = tamBolenlerTop + bolen;
			}
			bolen++;
		}
		System.out.println("\n"+sayi+" sayısının tam bölenlerinin toplamı: "+tamBolenlerTop);

	}

}
