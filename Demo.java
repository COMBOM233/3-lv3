package lv3;

public class Demo {
    public  static void main(String[] args){
        Consumer me = new Consumer();
        Dogshop shop = new Dogshop();
        shop.setConsumer(me);
        me.setDogshop(shop);
        me.sendRequest("114514");
        shop.sendPc("r700p");
        shop.info();
    }
}
