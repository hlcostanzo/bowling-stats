package bowling.stats.bowlingstats.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentsRepository extends MongoRepository<Student, Integer>
{
    List<Student> findAll();
    Student findByFirstName(String firstName);
    List<Student> findByGender(String gender);
    Student save(Student student);
}
