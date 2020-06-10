package package1;

import java.util.Scanner;

public class SendFactoryTest {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        SendFactory sendFactory = new SendFactory();
//        System.out.print("请输入要创建的发送类型 ： ");
//        String type = input.nextLine();
//        if( null != sendFactory.produce(type) ) {
//            sendFactory.produce(type).send();
//            sendFactory.produceMail();
//            sendFactory.produceSms();
//        }

        Provider provider = new SmsSendFactory();
        provider.produce().send();

        Provider provider1 = new PacketSendFactory();
        provider1.produce().send();


    }
}
