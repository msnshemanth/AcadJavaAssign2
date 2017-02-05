
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ad= new A1();
		ad.a();
		ad.b();
		ad.c();
		ad.d();
	}
	
}
class A1
{
	int a=20;
	int b=10;
	
	void a(){
	int b = a-- - --a;
	System.out.println("The Ans = "+b);
	}
	void b(){
		int c=a--;
		System.out.println("The Ans = "+c);
	}
	void c(){
		int d=a>>2;
		System.out.println("The Ans = "+d);
	}
	
	void d(){
		int e=a&b;
		System.out.println("The Ans = "+e);
	}
	
}

