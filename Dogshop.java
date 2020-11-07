package lv3;

public class Dogshop implements DogshopBehave{
    private Consumer me;
    public void setConsumer(Consumer me){
        this.me = me;
    }
    @Override
    public void receiveRequest(String request){
        System.out.println("狗东收到"+request+"订单");
    }
    @Override
    public void sendPc(String pc){
        System.out.println("狗东发货");
    }
    @Override
    public void info(){
        System.out.println("派送完成");
        me.receivePc("r700p");
    }
}
