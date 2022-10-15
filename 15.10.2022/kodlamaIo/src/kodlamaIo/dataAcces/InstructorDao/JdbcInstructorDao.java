package kodlamaIo.dataAcces.InstructorDao;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDB ile eğitmen veri tabanına eklendi");
	}
}
