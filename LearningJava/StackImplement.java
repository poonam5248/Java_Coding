package LearningJava;
import java.util.NoSuchElementException;
import java.util.Scanner;

 class arrayStack {
	
	protected int arr[];
	protected int top,size,len;
	
	public arrayStack(int n)
	{
		size=n;
		len=0;
		arr=new int[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public int getSize()
	{
		return len;
	}
	
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("UnderFlow Exception");
		return arr[top];
	}
	
	public void push(int i)
	{
		if(top+1>=size)
			throw new IndexOutOfBoundsException("OverFlow Exception");
		if(top+1<size)
			arr[++top]=i;
		len++;
	}
	
	public int pop()
	{
		if(isEmpty())
			throw new NoSuchElementException("UnderFlow Exception");
		len--;
		return arr[top--];
	}
	
	public void display()
	{
		System.out.print("\nStack= ");
		if(len==0) 
		{
			
			System.out.print("Empty\n");
			return;	
	}

	for (int i=top;i>=0;i--)
		System.out.print(arr[i]+" ");
	System.out.println();
	}
	}


public class StackImplement {
	
		public static void main(String[] args) 
		{
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Stack Test\n");
			System.out.println("Enter Size of Integer Stack ");
			int n=scan.nextInt();
			arrayStack stk = new arrayStack(n);
			
			char ch;
			
			do {
				System.out.println("\nStack Operations ");
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Peek");
				System.out.println("4. Check Empty");
				System.out.println("5. Check Full");
				System.out.println("6. Size");
				
				int choice=scan.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter integer Element to Push ");
					try
					{
						stk.push(scan.nextInt());
					}
					catch(Exception e)
					{
						System.out.println("Error: "+ e.getMessage());
					}
					break;
				case 2:
					try
					{
						System.out.println("Popped Element= " + stk.pop());
					}
					catch (Exception e)
					{
						System.out.println("Error : " + e.getMessage());
					}
					break;
				case 3:
					try 
					{
						System.out.println("Peek Element= " + stk.peek());
					}
					catch (Exception e)
					{
						System.out.println("Error : " + e.getMessage());
					}
					break;
				case 4:
					System.out.println("Empty Status= " + stk.isEmpty());
				    break;
				case 5:
					System.out.println("Full Status= " + stk.isFull());
					break;
				case 6:
					System.out.println("Size= " +stk.getSize());
					break;
				default :
					System.out.println("Wrong Entry\n ");
					break;
				}
				stk.display();
				System.out.println("\n Do You Want To Continue(Type y or n) \n");
				ch = scan.next().charAt(0);
				
			}
			while (ch=='Y'||ch=='y');
		}
	}
