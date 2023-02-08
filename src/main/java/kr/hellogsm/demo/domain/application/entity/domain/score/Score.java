package kr.hellogsm.demo.domain.application.entity.domain.score;

import jakarta.persistence.*;
import kr.hellogsm.demo.domain.application.entity.domain.Application;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Getter
@Entity
@Table(name = "score")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Score {

    @Id
    @Column(name = "score_id")
    Long id;

    @OneToOne
    @JoinColumn(name = "title_id")
    Title title;

    @Column(name = "score_value")
    BigDecimal value;

    @ManyToOne
    @JoinColumn(name = "application_id")
    Application application;

}
