
public class Assignment_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short lowerBound=2,upperBound=100,counter1,counter2;
		boolean flag=false;
		
		System.out.println("The Prime numbers between 1 and 100 ");
		for(counter1=lowerBound;counter1<upperBound;counter1++)
		{
			for(counter2=lowerBound;counter2<=Math.sqrt(counter1);counter2++)
			{
				if((counter1%counter2)==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.print(counter1 + " ");
				
			}
			else
				flag=false;
		}

	}

}
