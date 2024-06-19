package wiproPro;

import java.util.HashSet;

public class HashSetDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> Scooter=new HashSet<String>();
		Scooter.add("Honda");
		Scooter.add("TVS");
		Scooter.add("Yamaha");
//		Scooter.add("Yamaha");
		System.out.println(Scooter);
		System.out.println(Scooter.contains("Honda"));

		
		Scooter.clear();
		System.out.println(Scooter)	;
		
	}

}
