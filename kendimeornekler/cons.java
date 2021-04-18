package kendimeornekler;

public class cons {
    private String name;
    private String yazar;
    private int sayfa;
    private double fiyat;

public cons(String name,String yazar,int sayfa,double fiyat){
    this.name=name;
    this.yazar=yazar;
    this.sayfa=sayfa;
    this.fiyat=fiyat;
}
public void showInfos(){
    System.out.println("isim=" + this.name);
    System.out.println("yazar=" + this.yazar);
    System.out.println("sayfa=" + this.sayfa);
    System.out.println("fiyat=" + this.fiyat);
}
}
