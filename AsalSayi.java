package com.mycompany.asalsayi;
import java.util.Scanner;
public class AsalSayi {
    

public class AsalSayiKontrolu {
    
    // Asal sayı kontrolü yapan fonksiyon
    public static boolean asalMi(int sayi) {
        // 1 asal sayı değildir
        if (sayi <= 1) {
            return false;
        }
        
        // 2 asal sayıdır
        if (sayi == 2) {
            return true;
        }
        
        // 2'den büyük bir sayı için
        if (sayi % 2 == 0) {
            return false;  // Eğer sayı çiftse, asal olamaz
        }
        
        // Sayının kareköküne kadar olan sayılara bakarak kontrol et
        for (int i = 3; i * i <= sayi; i += 2) {
            if (sayi % i == 0) {
                return false; // Sayı, bu i ile tam bölünüyor, asal değil
            }
        }
        
        return true; // Sayı asal
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        // Asal sayıyı kontrol et
        if (asalMi(sayi)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
        
        scanner.close();
    }}}