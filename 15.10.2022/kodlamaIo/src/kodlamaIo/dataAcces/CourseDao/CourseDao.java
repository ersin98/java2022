package kodlamaIo.dataAcces.CourseDao;

import kodlamaIo.entities.Course;

public interface CourseDao {
	void add(Course course);

	Course select(Course course);

	Course select(Course course, String parameter1);

	Course select(Course course, int parameter1);
}
