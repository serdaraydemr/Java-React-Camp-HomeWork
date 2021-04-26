package homeWork;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course (1, "Yazılım Geliştirici Yetiştirme Kampı C#", "Engin Demiroğ", "2 Ay Sürücek",27.99);
		Course course2 = new Course (2,"Yazılım Geliştirici Yetiştirme Kampı Java","Fatih Serdar Aydemir","2 Ay Sürücek",14.99);
		Course course3 = new Course (3,"Programlamaya Giriş İçin Temel Kurs","Faruk Aydın", "Süresiz Erişim", 14.99 );
		
		Course[] courses = {course1, course2, course3};
		
		for(Course course : courses) {
			System.out.println("Kursun Adı: "+course.courseName);
			System.out.println("Eğitmen Adı: "+course.instructorName);
			System.out.println("Eğitim Detayı: "+course.detail);
			System.out.println("Eğitim Ücreti: "+course.price);
			System.out.println("*************************************");
			
	
			
		}
		 
		CourseCategory category1 = new CourseCategory();
		category1.id =1;
		category1.name = "Programlama";
		
		CourseManager courseManager = new CourseManager ();
		courseManager.Register(course1);
		courseManager.Register(course2);
		courseManager.Register(course3);
		
		System.out.println("************************************");
		
		CourseManager courseManager1 = new CourseManager ();
		courseManager1.Login(course1);
		courseManager1.Login(course2);
		courseManager1.Login(course3);
		
		
		
		
		
		
				
		
		

	}

}
