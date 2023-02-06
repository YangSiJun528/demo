package kr.hellogsm.demo.domain.application.domain.entity.record;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Rating {
    private Long id;
    private Semester semester;
    private Subject subject;
    private BigDecimal value;

    @ManyToOne
    Record record;
}
