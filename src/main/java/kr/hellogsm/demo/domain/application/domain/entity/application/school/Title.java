package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Title {

    Title parents;
    String value;
}
