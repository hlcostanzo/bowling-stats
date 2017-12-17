package bowling.stats.bowlingstats.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Student
{
    @Id
    private Integer id;

    private String firstName;
    private String lastName;

    private String gender;

}
