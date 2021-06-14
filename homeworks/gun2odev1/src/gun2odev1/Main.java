package gun2odev1;

public class Main {
public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (Java + React)", 150, "Engin Demiroğ");
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı(C# + Angular)", 100, "Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giriş İçin Temel Kurs",50,"Engin Demiroğ");
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		Student student = new Student(1,"Hilal","Bıyık");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		

	}
}
