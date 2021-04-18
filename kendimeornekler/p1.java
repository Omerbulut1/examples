package kendimeornekler;

public class p1 {
    private String writer;
    private String name;
    private int page;
    private double price;


    public void setWriter(String writer){
        this.writer=writer;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPage(int page){
        this.page=page;
    }
    public void  setPrice(double price) {
        if (price < 20.0) {
        this.price = price;
        }
        else System.out.println("kitap fiyati cok yuksek");
    }
    public String getWriter(){
        return this.writer;
    }
    public String getName(){
        return this.name;
    }
    public int getPage(){
        return this.page;
    }
    public double getPrice(){
        return this.price;
    }

}
