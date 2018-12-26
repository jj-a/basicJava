package oop1204;

public class ScoreResultTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ScoreResultTest ]"+"\n");
		
		Score student[]={new Score(1,"홍길동",1,2,1,1,1), new Score(2,"무궁화",1,1,1,1,1), 
				new Score(3,"라일락",3,2,4,2,1), new Score(4,"진달래",2,1,4,1,1), new Score(5,"봉선화",1,1,4,3,2)};
		int size=student.length;
		
		// rank (미완)
		
		int min=0;
		for(int i=0;i<size;i++) {
			min=i;
			for(int j=i+1;j<size;j++) {
				if(student[j].score<student[min].score) {
					min=j;
					System.out.println("i="+i+" j="+j+" min="+min);
				}
				else {
					System.out.println("i="+i+" j="+j+" min="+min);
				}
				student[min].rank=size-i;
			}
			System.out.println();
		}
		
		/*
		int min;
		for(int i=0;i<size;i++) {
			min=0;
			for(int j=i+1;j<size;j++) {
				if(student[i].score>student[j].score) {
					min=j;
					student[j].rank=student[i].rank+1;
				}
			}
			System.out.println(min);
		}
		*/
		
		
		
		System.out.println("          ** 시험결과 **");
		System.out.println("====================================");
		System.out.println("번호 이름    1  2  3  4  5  점수 등수");
		System.out.println("------------------------------------");
		
		for(int i=0;i<size;i++) student[i].disp();
		
		System.out.println("------------------------------------");

	}

}


class Score {
	private int no;
	private String name;
	private int answer[]=new int[5];
	private char ox[]=new char[5];
	public int score;
	public int rank;
	private static int Count=0;
	
	
	public Score(int no, String name, int a, int b, int c, int d, int e) {
		this.no=no;
		Count++;
		this.name=name;
		this.answer[0]=a;
		this.answer[1]=b;
		this.answer[2]=c;
		this.answer[3]=d;
		this.answer[4]=e;
		rank=1;
		compute();
	}
	
	public Score(String name, int a, int b, int c, int d, int e) {
		this.no=Count;
		Count++;
		this.name=name;
		this.answer[0]=a;
		this.answer[1]=b;
		this.answer[2]=c;
		this.answer[3]=d;
		this.answer[4]=e;
		rank=1;
		compute();
	}
	
	public Score() {
		this.no=Count;
		Count++;
	}
	
	
	public void compute() {		// 정답확인
		int correct[]= {1,1,1,1,1};
		for(int i=0;i<answer.length;i++) {
			if(answer[i]==correct[i]) ox[i]='○';
			else ox[i]='X';
		}
		checkScore();
	}
	
	public void checkScore() {
		int cnt=0;
		for(int i=0;i<ox.length;i++) {
			if(ox[i]=='○') cnt++;
		}
		score=cnt*20;
	}
	
	
	public void disp() {
		System.out.print(no+"    "+name+"  ");
		for(char c : ox) System.out.print(c+" ");
		System.out.println(score+"   "+rank);
	}
	
}
