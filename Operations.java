package operations;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) 
	{
		int sayi1,sayi2,sonuc;
		String islem=" ";
		Scanner scan = new Scanner(System.in);
		System.out.print("1.Sayıyı Girin: ");
		sayi1= scan.nextInt();
		System.out.print("2.Sayıyı Girin: ");
		sayi2= scan.nextInt();
		System.out.print("Yapmak istediğiniz işlemi girin: ");
		islem=scan.next();
		scan.close();
		
		sonuc=0;
		if(islem.equals("+"))
			sonuc=sayi1+sayi2;
		else if(islem.equals("-"))
			sonuc=sayi1-sayi2;
		else if(islem.equals("*"))
			sonuc=sayi1*sayi2;
		else if(islem.equals("/"))
			sonuc=sayi1/sayi2;
		System.out.println("Sonuç:"+ sonuc);	
	}

}
