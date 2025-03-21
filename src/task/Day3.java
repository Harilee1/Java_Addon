package task;

public class Day3 {
	public static void main(String args[]) {
		Hari obj=new Hari(){
			public void name() {
				System.out.println("irah");
			}
		};
	}
}

abstract class Hari{
	public abstract void name();
	public void marks()
{
		System.out.println("mark is 100");
		}
}
interface danish{
		public void name();
		public void marks();
		
}