package kendimeornekler;

public class main {
    public static void main(String[] args) {
        p1 input=new p1();

        input.setWriter("elif");
        input.setName("ASK");
        input.setPage(287);
        input.setPrice(22.99);

        System.out.println("yazar ismi=" + input.getWriter());
        System.out.println("KITAP ISMI=" + input.getName());
        System.out.println("KITAP FIYATI=" + input.getPage());
        System.out.println("FIYAT=" + input.getPrice());
    }
}
