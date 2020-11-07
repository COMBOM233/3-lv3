package lv3;

public class Consumer implements ConsumerBehave{
    private Dogshop shop;
    public void setDogshop(Dogshop shop){
        this.shop = shop;
    }
    @Override
    public void sendRequest(String request){
        System.out.println("发送"+request+"号订单");
        shop.receiveRequest("114514");
    }
    @Override
    public void receivePc(String pc){
        System.out.println("收到"+pc+"电脑");
    }
}