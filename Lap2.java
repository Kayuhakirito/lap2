/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lap2;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Lap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            do {
                System.out.println("Nhap(1/2/3/4):");
                choiceNumber = scanner.nextInt();
            } while ((choiceNumber < 1) || (choiceNumber > 4));
             
            switch (choiceNumber) {
                case 1 -> {
                    int aNumber , bNumber;
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Nhap a:");
                    aNumber = myObj.nextInt();
                    System.out.println("Nhap b:");
                    bNumber = myObj.nextInt();
                    if(aNumber==0){
                        if(bNumber==0){
                            System.out.println("Phuong trinh vo so nghiem");
                        } else {
                            System.out.println("Phuong trinh vo nghiem");
                        }
                    } else {
                        float x = (float) -bNumber/aNumber;
                        System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
                    }         }
                case 2 -> {
                    int aNumber , bNumber, cNumber;
                    double delta;
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Nhap a:");
                    aNumber = myObj.nextInt();
                    System.out.println("Nhap b:");
                    bNumber = myObj.nextInt();
                    System.out.println("Nhap c:");
                    cNumber = myObj.nextInt();
                    System.out.println("Pt co dang:" +aNumber+"x^2+"+bNumber+"x+"+cNumber+"=0");
                    if(aNumber==0){
                        if(bNumber==0){
                            if(cNumber==0){
                                System.out.println("Phuong trinh vo so nghiem");
                            } else {
                                System.out.println("Phuong trinh vo nghiem");
                            }
                        } else {
                            float x = (float) -cNumber/bNumber;
                            System.out.println("Phuong trinh co mot nghiem duy nhat : " + x);
                        }
                    }                 if(aNumber!=0){
                        delta = bNumber*bNumber-4*aNumber*cNumber;
                        if(delta<0){
                            System.out.println("Phuong trinh vo nghiem");
                        }
                        if(delta==0){
                            float x = (float) -bNumber/(2*aNumber);
                            System.out.println("Phuong trinh co nghiem kep:"+x);
                        }
                        if(delta>0){
                            float x1 = (float) (-bNumber+Math.sqrt(delta))/(2*aNumber);
                            float x2 = (float) (-bNumber-Math.sqrt(delta))/(2*aNumber);
                            System.out.println("Phuong trinh co 2 nghiem phan biet: x1="+x1+"va x2="+x2);
                        }
                    }         }
                case 3 -> {
                    int soDien;
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Nhap so dien:");
                    soDien = myObj.nextInt();
                    if(soDien<50){
                        int tien = soDien*1000;
                        System.out.println("So tien la:"+tien);
                    }else{
                        int tien = 50*1000 + (soDien - 50)*1200;
                        System.out.println("So tien la:"+tien);
                    }         }
                case 4 -> {
                    System.out.println("ket thuc! Tam biet!");
                    System.exit(0);
                  }
            }
        }
    }
    
}
