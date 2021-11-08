package responmodul4;

import java.util.Scanner;

public class ResponModul4 {

    public static Scanner sc = new Scanner(System.in);
    public static int x,y,z,totalBelanja,saldo,simpan;
    public static String[] keranjang;
    public static int[] simpanHarga;
    
    public static void main(String[] args) {
        
        System.out.println("----> Selamat Datang di Toko Uno-Uno :)<----");
        System.out.println("----> Edisi Ramdan diskonn 50%, tapi bookng <---- \n");
        saldo = 2000000;
        keranjang = new String[50];
        for(int i = 0; i<keranjang.length; i++){
            keranjang[i] = "";
        }
        simpanHarga = new int[50];
        for(int i = 0; i<simpanHarga.length; i++){
            simpanHarga[i] = 0;
        }
        simpan = 0;
        
        menu();

    }
    public static int menu(){
        System.out.println("Menu");
        String pilih[] = {"Pilih Barang","Uangku","Kurangi isi keranjang","Bayar","Exit"};
        for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s \n",i+1,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        switch (x){
            case 1:
                pilihBarang();
                break;
            case 2:
                uangku();
                break;
            case 3:
                keranjang();
                break;
            case 4:
                bayar();
                break;
            case 5:
                System.out.println("Terima kasih sudah berkunjung :)");
                System.exit(0);
                break;
            default:
                System.out.println("Input salah");
                return menu();
        }
        return 0;
    }
    
    public static int pilihBarang(){
        String barang[] = {"Kaos","Kemeja","Celana","Rok","Sepatu"};
         for(int i=0; i<barang.length;i++){
            System.out.printf("%d. %s \n",i+1,barang[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        switch(x){
            case 1:
                kaos();
                break;
            case 2:
                kemeja();
                break;
            case 3:
                celana();
                break;
            case 4:
                rok();
                break;
            case 5:
                sepatu();
                break;  
            default:
                System.out.println("Input salah");
                return pilihBarang();
        }
        return 0;
    }
    public static void kaos(){
        String nama = "Kaos";
        System.out.println("Jenis " + nama);
        String pilih[] = {"Klasik","oblong","Oplosan","Tebal","Asli",
            "Palsu","Murah","Boongan","Mahal","Biasa"};
         for(int i=0; i<pilih.length;i++){
             System.out.printf("%d. %s %s \n",i+1,nama,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        if(x % 2 == 0){
            detail2(nama,pilih,x);
        }
        detail(nama,pilih,x);
            
    }
    public static void kemeja(){
        String nama = "Kemeja";    
        System.out.println("Jenis " + nama);
        String pilih[] = {"Pria","Wanita","Anak","Girl","Boys",
            "Bayi","Bagus","Keren","Mahal","Biasa"};
         for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s %s \n",i+1,nama,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        if(x % 2 == 1){
            detail2(nama,pilih,x);
        }
        detail(nama,pilih,x);
    }
    public static void celana(){
        String nama = "Celana";    
        System.out.println("Jenis " + nama);
        String pilih[] = {"Panjang","Pendek","Sekolah","Kuliah","kantor",
            "Jeans","Kain","Gayaku","Mahal","Biasa"};
         for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s %s \n",i+1,nama,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        if(x % 2 == 1){
            detail2(nama,pilih,x);
        }
        detail(nama,pilih,x);
    }
    public static void rok(){
        String nama = "Rok";    
        System.out.println("Jenis " + nama);
        String pilih[] = {"Panjang","Pendek","Sekolah","Kuliah","kantor",
            "Jeans","Kain","Sutra","Mahal","Biasa"};
         for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s %s \n",i+1,nama,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        if(x % 2 == 0){
            detail2(nama,pilih,x);
        }
        detail(nama,pilih,x);
    }
    public static void sepatu(){
        String nama = "Sepatu";    
        System.out.println("Jenis " + nama);
        String pilih[] = {"Kantor","Pantopel","Kuda","Tali","Non-tali",
            "Murah","Keren","Gayaku","Sport","Santai"};
         for(int i=0; i<pilih.length;i++){
            System.out.printf("%d. %s %s \n",i+1,nama,pilih[i]);
        }
        System.out.print("Masukan opsi anda : ");
        x = sc.nextInt();
        if(x % 2 == 0){
            detail2(nama,pilih,x);
        }
        detail(nama,pilih,x);
    }
    
    public static void detail(String nama,String x[],int y){
        System.out.println("-> "+ nama +" "+ x[y-1]);
        System.out.println("Merek : Intel");
        System.out.println("Harga : 10000");
        int harga = 10000;
        System.out.println("Ukuran : M");
        System.out.println("Warna : Black vander");
        System.out.print("Masukkan Jumlah : ");
        z =sc.nextInt();
        harga = harga * z;
        System.out.println("Total : " + harga);
        System.out.print("Masukkan ke keranjang ? (y/n) ");
        char jawab = sc.next().charAt(0);
        if(jawab == 'y'){
            System.out.println("\nBarang berhasil dimasukan ke keranjang\n");
            simpanHarga[simpan] = harga;
            String barang = nama +" "+ x[y-1];
            keranjang[simpan] = barang;
            simpan++;
            menu();
        }
        menu();
    }
    
    public static void detail2(String nama,String x[],int y){
        System.out.println("-> "+ nama +" "+ x[y-1]);
        System.out.println("Merek : Yamaha");
        System.out.println("Harga : 230000");
        int harga = 230000;
        System.out.println("Ukuran : L");
        System.out.println("Warna : Magenta");
        System.out.print("Masukkan Jumlah : ");
        z =sc.nextInt();
        harga = harga * z;
        System.out.println("Total : " + harga);
        System.out.print("Masukkan ke keranjang ? (y/n) ");
        char jawab = sc.next().charAt(0);
        if(jawab == 'y'){
            System.out.println("\nBarang berhasil dimasukan ke keranjang\n");
            simpanHarga[simpan] = harga;
            String barang = nama +" "+ x[y-1];
            keranjang[simpan] = barang;
            simpan++;
            menu();
        }
        menu();
    }
    
    public static void uangku(){
        System.out.println("Saldo Terakhir : " + saldo);
        System.out.println("Opsi");
        System.out.println("1. Isi Saldo");
        System.out.println("2. Kembali");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        if(pilih == 1){
            System.out.print("Masukkan Nominal : ");
            int nominal = sc.nextInt();
            saldo = saldo + nominal;
            System.out.println("\nSaldo anda sekarang Rp "+saldo + "\n");
            menu();
        }
        menu();

    }
    public static int keranjang(){
        System.out.println("Keranjang anda");
        System.out.println("Daftar Keranjang\n");
        int w = 1;
        for(int i = 0; i < keranjang.length;i++){
            for(int j = 0; j<keranjang.length-1; j++){
                if("".equals(keranjang[j])){
                    String temp = keranjang[j];
                    keranjang[j]= keranjang[j+1];
                    keranjang[j+1]= temp; 
                }
                
                if(simpanHarga[j] == 0){
                    int temp = simpanHarga[j];
                    simpanHarga[j]= simpanHarga[j+1];
                    simpanHarga[j+1]= temp;
                }
            }
            if(!"".equals(keranjang[i])){
                System.out.printf("%d. %s   | Rp. %d\n",w,keranjang[i],simpanHarga[i]);
                w++;
            }
        }
        System.out.println("\n1. Kurangi List");
        System.out.println("2. Kosongkan Semua");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
        int jawab = sc.nextInt();
        switch (jawab){
            case 1:
                System.out.print("Masukkan urutan daftar : ");
                int hapus = sc.nextInt();
                keranjang[hapus-1] = "";
                simpanHarga[hapus-1] = 0;
                System.out.print("Lagi? (y/n) ");
                char pilih = sc.next().charAt(0);
                if(pilih == 'y'){
                    return keranjang();
                }
                menu();
                break;
            case 2:
                for(int i = 0; i<keranjang.length; i++){
                keranjang[i] = "";
                simpanHarga[i] = 0;
                }
                System.out.print("Lagi? (y/n) ");
                pilih = sc.next().charAt(0);
                if(pilih == 'y'){
                    return keranjang();
                }
                menu();
                break;
            case 3:
                menu();
                break;
            default:
                menu();
        }
        return 0;
    }
    
    public static void bayar(){
        System.out.println("Keranjang anda");
        System.out.println("Daftar Keranjang\n");
        int w = 1;
        for(int i = 0; i<keranjang.length;i++){
             if(!"".equals(keranjang[i])){
            System.out.printf("%d. %s   | Rp. %d\n",w,keranjang[i],simpanHarga[i]);
            w++;
            }
        }
        System.out.println("\nOpsi");
        System.out.println("1. Bayar");
        System.out.println("2. kembali");
        
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        
        if(pilih == 1){
            for(int i = 0; i<simpanHarga.length;i++){
                totalBelanja = totalBelanja + simpanHarga[i];
            }
            System.out.println("Biaya yang dibayarkan adalah Rp. " + totalBelanja);
            System.out.println("Diskon 50%");
            totalBelanja = totalBelanja /2 ;
            System.out.println("Total pembayaran : Rp. " + totalBelanja);
            System.out.println("Saldo anda sebesar Rp. " + saldo);
            if(saldo < totalBelanja){
                System.out.println("\nSALDO ANDA TIDAK MENCUKUPI !!!\n");
                totalBelanja = 0;
                menu();
            }
            saldo = saldo - totalBelanja;
            System.out.println("\nSisa saldo anda Rp. " + saldo + "\n");
            totalBelanja = 0;
            for(int i = 0; i<keranjang.length; i++){
                keranjang[i] = "";
                simpanHarga[i] = 0; 
            }
            menu();
        }
        menu();

    }
    
}
