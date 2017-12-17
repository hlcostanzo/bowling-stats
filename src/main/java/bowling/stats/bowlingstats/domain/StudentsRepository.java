package bowling.stats.bowlingstats.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentsRepository extends MongoRepository<Student, Integer>
{
    Student findByFirstName(String firstName);
    List<Student> findByGender(Gender gender);
    Student save(Student student);
}
