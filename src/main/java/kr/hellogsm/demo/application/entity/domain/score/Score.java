package kr.hellogsm.demo.application.entity.domain.score;

import com.example.demo.application.entity.domain.Application;
import jakarta.persistence.Embedded;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Score {

    Long id;

    @Embedded
    Title title;
    BigDecimal value;

    @ManyToOne
    Application application;

}
