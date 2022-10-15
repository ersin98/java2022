package kodlamaIo.dataAcces.CourseDao;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao {
	// veritabanı simule edildiği için geriye boş bir kurs döndüğü olasılığı
	// işlenecek
	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs veritabanına eklendi");

	}

	@Override
	public Course select(Course course) {
		System.out.println("Hibernateile kurs veritabanında arandı");
		return null;
	}

	@Override
	public Course select(Course course, String parameter1) {
		System.out.println("Hibernateile kurs veritabanında String parametreyle arandı");
		return null;
	}

	@Override
	public Course select(Course course, int parameter1) {
		System.out.println("Hibernateile kurs veritabanında int parametreyle arandı");
		return null;
	}

}
