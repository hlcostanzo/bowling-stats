package bowling.stats.bowlingstats.controller;

import bowling.stats.bowlingstats.domain.Student;
import bowling.stats.bowlingstats.domain.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stats")
public class StatsController
{
    @Autowired
    private StudentsRepository studentsRepository;

    @RequestMapping("/")
    public List<String> getStats()
    {
        List<String> response = new ArrayList<>();
        response.add("Hello");
        response.add("Goodbye");

        Student holly = studentsRepository.findByFirstName("Holly");
        response.add(holly.toString());

//        Student create = new Student();
//        create.setId(2);
//        create.setFirstName("New");
//        create.setLastName("Student");
//        create.setGender("Male");
//
//        studentsRepository.save(create);

        return response;
    }
}
