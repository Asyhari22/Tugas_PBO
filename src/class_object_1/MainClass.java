
package class_object_1;


public class MainClass {

    
    public static void main(String[] args) {
        //untuk bisa mengakses class hewan,burung dan ikan
        //perlu membuat object(instan of class)
        
        //akses suara,tipe, dan usia dari class hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method dari class burung dan ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi data suara,tipe, dan usia
        burung.setTipe("kakak tua");
        burung.setSuara("kuk..kuk..kuk");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba-lumba");
        ikan.setSuara("blurp..blurp..blurp");
        ikan.setUsia(0);
        
        //cara ambil data setter (hewan,ikan, dan burung)
        
        System.out.println("Aku "+ burung.getTipe() +
                " suaraku " + burung.getSuara()+ " usiaku "+ burung.getUsia()+".");
        b.terbang();
        
        System.out.println("Aku "+ ikan.getTipe() +
                " suaraku " + ikan.getSuara()+ " usiaku "+ ikan.getUsia()+".");
        i.berenang();
        
        
        
    }
    
}
