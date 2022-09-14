
package class_object_2;

import java.io.*;
public class MainClass {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Handphone hp = new Handphone();
        Samsung samsung = new Samsung();
                
        try{
            
            do{
                System.out.println("--PBO CELL");
                System.out.println("1. Isi Data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih Menu :");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("--Isi Data HP--");
                        System.out.println("Tipe : ");
                        hp.setTipe(br.readLine());
                        System.out.println("Warna : ");
                        hp.setWarna(br.readLine());
                        System.out.println("Kapasitas : ");
                        hp.setKapasitas(br.readLine());
                        System.out.println("Harga : ");
                        samsung.setHarga(Integer.parseInt(br.readLine()));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("--Beli HP--");
                        System.out.println("Jumlah Beli :");
                        samsung.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.println("Total Bayar : "+samsung.getBeli());
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                }
            }while (true);
            
            
            
        
        
        }catch(Exception e){
        }
    }
    
}
