package konzult;

public class Robot {
	
	private String mojeJmeno;
	
	private int zaklad;
	
	public Robot(String mojeJmeno, int zaklad) {
		this.mojeJmeno = mojeJmeno; //konstruktor
		//this.zaklad = zaklad;
	}
	
	
	public void setZakladPlatu(int novyZakladPlatu) {
		zaklad = novyZakladPlatu;
	}
	
	public void pozdrav() {
		System.out.println("Ahoj Vse! jmenuju se " + mojeJmeno);
	}
	
	public void pozdravNekoho(String jmeno, String prijmeni) {
		System.out.println("Ahoj" + " " + jmeno + " " + prijmeni);
	}
	
	public int sectiDveCisla(int a, int b) {
		int soucet = a + b;
		return soucet;
	}
	
	public void sectiDveCislaAVityskni(int a, int b) {
		int soucet = a + b;
		System.out.println(soucet);
	}
	
	public int vypocitejPlat(int effectivita) {
		//int zaklad = 20000;
		int bonus = effectivita * 20;
		return zaklad + bonus;
	}
}
