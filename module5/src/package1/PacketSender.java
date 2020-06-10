package package1;

public class PacketSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送包裹");
    }
}
