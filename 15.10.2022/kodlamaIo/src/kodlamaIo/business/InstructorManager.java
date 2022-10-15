package kodlamaIo.business;

import kodlamaIo.common.logging.Logger;
import kodlamaIo.dataAcces.InstructorDao.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}
}
