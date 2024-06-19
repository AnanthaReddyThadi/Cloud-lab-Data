package javaproject;

public class ArreyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Collection of similar objects -> Same data tyepe
		String cities[]= {"BLR","Mysure","Pune","HYD","kolkata"};
		//index->0
	/*	System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		for (int i=0;i<cities.length;i++)
				
		{
					System.out.println(cities[i]);
					
				}*/
		// for -each
		for(String i:cities)
		{
			System.out.println(i);
			
		}
		int ages[]= {20,34,5,57,78};
		System.out.println("Arrey size is:"+ages.length);//Print the size of the arrey
		//logic to add all the numbers and then divide ->to get the avg
		int sum=0;
		for(int age:ages)
		{
			sum=sum+age;//sum+=age
					
		}
		//Calucalate the avg
		
		int avg=sum/ages.length;
		System.out.println("Avg age is:"+avg);
}
    
}
