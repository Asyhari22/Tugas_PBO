package Tugas_1;

import java.io.*;

public class MainTugas {

    

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Undika und = new Undika();
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kar = new Karyawan ();
        
            try{
            
            do{
                System.out.println("--Program SPP dan Gaji Undika--");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih Menu : ");
                int pilih = Integer.parseInt(br.readLine());
                System.out.println("");
                
                switch(pilih){
                    case 1:
                        System.out.println("--Cek SPP Mahasiswa--");
                        System.out.print("Nama : ");
                        und.setNama(br.readLine());
                        
                        System.out.print("Alamat : ");
                        und.setAlamat(br.readLine());
                        
                        System.out.print("Nim : ");
                        mhs.setNim(br.readLine());
                        
                        System.out.print("Prodi : ");
                        mhs.setProdi(br.readLine());
                        
                        System.out.print ("Angkatan : ");
                        mhs.setAngkatan(Integer.parseInt(br.readLine()));
                        
                        System.out.print ("Semester : ");
                        mhs.setSemester(Integer.parseInt(br.readLine()));
                        
                        System.out.print ("Bayar SPP Semester : ");
                        mhs.setBayar_spp_semester(Integer.parseInt(br.readLine()));
                        
                        System.out.println("");
                        System.out.println("==Detail SPP Mahasiswa==");
                        System.out.println("");
                        System.out.println("Nama : " + und.getNama());
                        System.out.println("Alamat : " + und.getAlamat());
                        System.out.println("NIM : " + mhs.getNim());
                        System.out.println("Prodi : " + mhs.getProdi());
                        System.out.println("Angkatan : " + mhs.getAngkatan());
                        System.out.println("Semester : " + mhs.getSemester());
                        System.out.println("Bayar SPP Semester : " + mhs.getBayar_spp_semester());
                        System.out.println("Biaya SPP : " + mhs.getSPP());
                        break;
                    case 2:
                        System.out.println("Cek Gaji Karyawan");
                        System.out.print("Nama : ");
                        und.setNama(br.readLine());

                        System.out.print("Alamat : ");
                        und.setAlamat(br.readLine());

                        System.out.print("NIK : ");
                        kar.setNik(br.readLine());

                        System.out.print("Bagian : ");
                        kar.setBagian(br.readLine());

                        System.out.print("Kehadiran : ");
                        kar.setKehadiran(Integer.parseInt(br.readLine()));

                        System.out.print("Gaji per-Hari : ");
                        kar.setGaji_perhari(Integer.parseInt(br.readLine()));
                        System.out.println("");
                        
                        System.out.println("==Detail Gaji Karyawan==");

                        System.out.println("Nama : " + und.getNama());
                        System.out.println("Alamat : "+ und.getAlamat());
                        System.out.println("NIK : " + kar.getNik());
                        System.out.println("Bagian : " + kar.getBagian());
                        System.out.println("Kehadiran : " + kar.getKehadiran());
                        System.out.println("Gaji per-Hari : " + kar.getGaji_perhari());
                        System.out.println("Total Gaji : " + kar.getGaji());
                        break;
                    case 3:
                        System.exit(0);
                }
            }while (true);
      
        }catch(Exception e){
        }
    
    }
}
