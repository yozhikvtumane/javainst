package konzult;

public class Spousteni {
	
	public static void main(String[] args) {
		Robot r = new Robot("Robot Karel" , 20000);
		r.pozdrav();
		r.pozdravNekoho("Pavel" , "Kriz");
		
		Robot r2 = new Robot("Robot Anton", 25000);
		r2.pozdrav();
		
		
		System.out.println("-------------------------------------------------");
		//int y = r.sectiDveCisla(1, 3);
		r.sectiDveCisla(1, 2);
		r.sectiDveCisla(1, 2);
		r.sectiDveCislaAVityskni(2, 5);
		
		
		int celkoveMzdoveZaklady = 0;
		celkoveMzdoveZaklady = celkoveMzdoveZaklady + r.vypocitejPlat(50);
		celkoveMzdoveZaklady = celkoveMzdoveZaklady + r2.vypocitejPlat(70);
		System.out.println(celkoveMzdoveZaklady);
		
		r.setZakladPlatu(22000);
		r2.setZakladPlatu(30000);
		System.out.println(r.vypocitejPlat(10));
		System.out.println(r2.vypocitejPlat(15));
	}
}