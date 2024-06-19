package wiproPro;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> teams =new LinkedList<String>();
		teams.add("SRH");
		teams.add("KKH");
		teams.add("RCB");
		teams.add("RR");
		System.out.println(teams);
		teams.remove();
		System.out.println(teams);
		teams.remove(2);
		System.out.println(teams);
		teams.addFirst("MI");
		System.out.println(teams);
        System.out.println(teams.get(2));
	
		

	}

}
