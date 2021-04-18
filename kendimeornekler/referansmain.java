package kendimeornekler;

public class referansmain {
    public static void main(String[] args) {
        ref input=new ref("BMW",4450);

       ref input2=input; // input degerleri ref referansi ile input2ye pushladik.

       input2.showInfos();  //input2 nin icindeki derleri public void showInfos(; daki bilgileri gsoterdi
    }
}
