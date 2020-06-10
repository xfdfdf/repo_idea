package package1;

public class PacketSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new PacketSender();
    }
}
