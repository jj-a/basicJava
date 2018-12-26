package oop1203;

// Anonymous class (익명 클래스)
public class AnonymousTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - AnonymousTest ]"+"\n");
		
		Message msg=new Message();
		msg.msgPrint();
		
		IMessage msg2=new Message();
		msg2.msgPrint();
		
		IMessage msg3=new IMessage() {
			@Override
			public void msgPrint() {
				System.out.println("Anonymous 익명 내부 클래스");
			}
		};
		
		msg3.msgPrint();
		
	}
}

interface IMessage {
	
	public void msgPrint();
	
}

class Message implements IMessage {

	@Override
	public void msgPrint() {
		System.out.println("Message 클래스");
	}
	
}