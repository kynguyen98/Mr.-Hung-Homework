public class Assignment3 extends Thread
{
	public Assignment3 (int num)
	{
		if(num == 1 || num == 0)
		{
			Thread tmp = new Thread();
			tmp.start();
			System.out.println("id: "+tmp.getId());
			return;
		}
		else 
		{

			new Assignment3 (num-1);
			new Assignment3 (num-2);
		}
	}
	public static void main(String[] args) {
		new Assignment3 (3);
	}

}