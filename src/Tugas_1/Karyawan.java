
package Tugas_1;


public class Karyawan {
   private String nik,bagian;
   private int kehadiran,gaji_perhari,totalgaji;
   
public void setNik(String nik){
        this.nik=nik;
    }

public void setBagian(String bagian){
        this.bagian=bagian;
    }

public void setKehadiran(int kehadiran){
        this.kehadiran=kehadiran;
    }

public void setGaji_perhari(int gaji_perhari){
        this.gaji_perhari=gaji_perhari;
    }

public void setTotalgaji(int totalgaji){
        this.totalgaji=totalgaji;
    }

//getter
public String getNik(){
        return this.nik;
    }

public String getBagian(){
        return this.bagian;
    }

public int getKehadiran(){
        return this.kehadiran;
    }

public int getGaji_perhari(){
        return this.gaji_perhari;
    }

public int getTotalgaji(){
        return this.totalgaji;
    }

public int getGaji(){
    return this.kehadiran*gaji_perhari;
}

   
}
