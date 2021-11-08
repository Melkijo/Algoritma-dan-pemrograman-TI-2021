/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalno1fix;
import java.util.Scanner;

public class JURNALNO1FIX {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;
        int ax,bx,cx,dx,ex,fx;
        System.out.print("Masukan banyak buah ember a: ");
        a = sc.nextInt();
        System.out.print("Masukan banyak buah ember b: ");
        b = sc.nextInt();
        System.out.print("Masukan banyak buah ember c: ");
        c = sc.nextInt();
        System.out.print("Masukan banyak buah ember d: ");
        d = sc.nextInt();
        System.out.print("Masukan banyak buah ember e: ");
        e = sc.nextInt();
        System.out.print("Masukan banyak buah ember f: ");
        f = sc.nextInt();
        
        System.out.println("\nBanyak buah sebelum di pindah");
        
        System.out.println("Banyak buah ember a: " + a);
        System.out.println("Banyak buah ember b: " + b);
        System.out.println("Banyak buah ember c: " + c);
        System.out.println("Banyak buah ember d: " + d);
        System.out.println("Banyak buah ember e: " + e);
        System.out.println("Banyak buah ember f: " + f);
        
        ax = c;
        bx = f;
        cx = e;
        dx = a;
        ex = b;
        fx = d;
        System.out.println("\nBanyak buah sesudah di pindah");
        
        System.out.println("Banyak buah ember a: " + ax);
        System.out.println("Banyak buah ember b: " + bx);
        System.out.println("Banyak buah ember c: " + cx);
        System.out.println("Banyak buah ember d: " + dx);
        System.out.println("Banyak buah ember e: " + ex);
        System.out.println("Banyak buah ember f: " + fx);
    }
    
}
