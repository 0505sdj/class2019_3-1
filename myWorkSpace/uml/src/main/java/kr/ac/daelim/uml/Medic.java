package kr.ac.daelim.uml;

public class Medic extends Unit {
	public void Healing() {
		System.out.println("메딕이 치료한다");
	}
	public static void main(String[] args) {
		Medic medic = new Medic();
		medic.move();
		
	}

}
