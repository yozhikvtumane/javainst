package cz.uhk.pro1.students;

import cz.uhk.pro1.students.model.Student;

public class mainClass {
	
	public static void main(String[] args) {

		//Objektove
		
		Student s1 = new Student(); //konstruktor, s importem package
		//cz.uhk.pro1.students.model.Student s1; bez importa package
		s1.setFirstName("Pavel");
		s1.setLastName("Pupkin");
		s1.setHour(10);
		s1.setMinute( 15 );

		Student s2 = new Student("Petr" , "Hus" , 10, 18);
		System.out.println( s2.toString() );
		
		Student[] pole = new Student[3];
		pole[0] = s1;
		pole[1] = s2;
		pole[2] = new Student("Jan" , "Huk" , 11 , 35);

		Student minimum = pole[0];
		for (int i = 0; i < pole.length ; i++ ) {
			int t1 = minimum.getTotalMinutesAfterMidnight(); //cas prihodu 1 student
			int t2 = minimum.getTotalMinutesAfterMidnight(); //cas prihodu 2 student 

			if (t2 < t1) {
				minimum = pole[i];
			}
		}

		System.out.println(minimum.toString() );
	}
	
}
