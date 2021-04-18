package kendimeornekler;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ref {
    private String model;
    private int price;

    public ref(String model, int price){
        this.model=model;
        this.price=price;
    }
    public void showInfos(){
        System.out.println("model=" + this.model);
        System.out.println("price=" + this.price);
    }

}
