package tp1;

import java.util.Arrays;

public class Friend implements Comparable<Friend>{
	private String name;
	private int age;
	
	public Friend(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Friend o) {
		if(this.age<o.age) {
			return -1;
		}
		else if(this.age==o.age){
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void afficheAmi(Friend [] listeAmi) {
		for(int i = 0;i<listeAmi.length;i++) {
			System.out.println(listeAmi[i].name +" est agé de "+listeAmi[i].age+"ans" );
		}
	}
	
	public static void main(String[] args) {
		Friend hugo = new Friend("HUGO",29);
		Friend valentin = new Friend("VALENTIN",20);
		Friend miki = new Friend("Miki",12);
		Friend [] listeAmi = new Friend[] {hugo,valentin,miki};
		afficheAmi(listeAmi);
		Arrays.sort(listeAmi);
		System.out.println("TRIE");
		afficheAmi(listeAmi);
	}
}
