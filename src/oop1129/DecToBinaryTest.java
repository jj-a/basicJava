package oop1129;
// ** 2진수 변환 **
// 10진수를 2진수로 변환 후 출력하는 프로그램
public class DecToBinaryTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - DecToBinaryTest ]"+"\n");
		
		Convert num=new Convert(16);
		num.toBinary();
		
		num=new Convert(23);
		num.toBinary();
		
	}
}

class Convert {
	private int n;
	private byte bin[];
	// bin[] length: (n<2)==1, (2<=n<4)==2, (4<=n<8)==3, (8<=n<16)==4, 
	//  (16<=n<32)==5, (32<=n<64)==6, (64<=n<128)==7, (128<=n<256)==8 
	
	public Convert(int n){
		this.n=n;
		setLength();
	}
	
	public Convert() {
		;
	}
	
	public void toBinary() {		// convert Decimal to Binary
		int x=n;
		System.out.print(n+" -> ");

		int cnt=bin.length-1;
		do {
			bin[cnt]=(byte)(x%2);
			x/=2;
			cnt--;
		}while(x>0);
		
		for(int i=0;i<bin.length;i++) System.out.print(bin[i]+" ");
		System.out.println();
		
	}
	
	private void setLength() {		// 2진수 자리수 계산
		int maxLength=8;
		for(int i=1;i<=maxLength;i++) {
			if(Math.abs(n)<Math.pow(2,i)) {		// 2의 n승값과 비교하여 배열 길이 할당
				bin=new byte[i];
				break;
			}
		}
	}
	
}