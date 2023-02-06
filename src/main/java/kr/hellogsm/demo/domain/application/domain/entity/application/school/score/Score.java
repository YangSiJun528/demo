package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Score {

    Long id;
    Title title;
    BigDecimal value;

}
