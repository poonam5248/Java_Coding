package LearningJava;

public class This_Keyword {

	int a,b;
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void showData()
	{
		System.out.println("Value of a= " +a);
		System.out.println("Value of b= " +b);
	}
	public static void main(String args[])
	{
		This_Keyword obj=new This_Keyword();
		obj.setData(5,6);
		obj.showData();
		
	}
}
