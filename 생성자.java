package p0421;

public class 积己磊 {
	String a;
	String b;
	
	public 积己磊(String a,String b) {
		this.a = a;
		this.b=b;
	}
	public void B() {
		System.out.println("a");
	}
	public void C(int a,int b) {
		System.out.println(a+b);
	}
	public void D() {
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
	}
	public void arrA(String[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]="a"+(i+1);
		}

	public static void main(String[] args) {
		积己磊[] A=new 积己磊[5];
		积己磊 a=new 积己磊("官焊","港没捞");
		A[0]=new 积己磊("官焊","港没捞");
		A[0].B();
		A[0].D();
		A[0].arrA(args);
		
	}
}
