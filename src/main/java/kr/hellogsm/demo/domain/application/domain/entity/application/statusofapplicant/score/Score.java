package kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.score;

import kr.hellogsm.demo.domain.application.domain.entity.application.Application;
import kr.hellogsm.demo.domain.application.domain.entity.record.Season;
import kr.hellogsm.demo.domain.application.domain.entity.record.Subject;
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
