package kodlamaIo.dataAcces.CourseDao;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	// veritabanı simule edildiği için geriye boş bir kurs döndüğü olasılığı
	// işlenecek
	@Override
	public void add(Course course) {
		System.out.println("JDBC ile kurs veritabanına eklendi");
	}

	@Override
	public Course select(Course course) {
		System.out.println("JDBC ile kurs veritabanında arandı");
		return new Course();
	}

	@Override
	public Course select(Course course, String parameter1) {
		System.out.println("JDBC ile kurs veritabanında string bir parametreye göre arandı");
		return new Course();

	}

	@Override
	public Course select(Course course, int parameter1) {
		System.out.println("JDBC ile kurs veritabanında int bir parametreye göre arandı");
		return new Course();

	}

}
