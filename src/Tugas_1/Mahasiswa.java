
package Tugas_1;


public class Mahasiswa {
   private String nim,prodi;
   private int spp,angkatan,semester,bayar_spp_semester;
   
   //Setter
   public void setNim(String nim){
        this.nim=nim;
    }
   
   public void setProdi(String prodi){
        this.prodi=prodi;
    }
   
   public void setAngkatan(int angkatan){
        this.angkatan=angkatan;
    }
   
   public void setSemester(int semester){
        this.semester=semester;
    }
   
   public void setNama(int semester){
        this.semester=semester;
    }
   
   public void setBayar_spp_semester(int bayar_spp_semester){
        this.bayar_spp_semester=bayar_spp_semester;
    }
   
   //getter
   public String getNim(){
        return this.nim;
    }
    
    public String getProdi(){
        return this.prodi;
    }
    
    public int getAngkatan(){
        return this.angkatan;
    }
    
       
    public int getSemester(){
        return this.semester;
    }
    
    public int getBayar_spp_semester(){
        return this.bayar_spp_semester;
    }
    
    public int getSPP(){
        if (angkatan>17){
        spp=15000000;
        spp=spp*bayar_spp_semester;
        }else{
        spp=12000000;
        spp=spp*bayar_spp_semester;
        }   
        return this.spp;
    }
   
}
