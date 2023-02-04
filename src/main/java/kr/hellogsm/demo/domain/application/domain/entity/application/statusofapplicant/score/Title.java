package kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.score;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Title {

    Title parents;
    String name;
}
