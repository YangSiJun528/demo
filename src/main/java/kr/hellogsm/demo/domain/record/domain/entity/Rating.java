package kr.hellogsm.demo.domain.record.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@Entity
@Table(name = "rating")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Rating {
    @Id
    @Column(name = "rating_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "rating_semester")
    private Semester semester;


    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "rating_value")
    private BigDecimal value;

    @ManyToOne
    @JoinColumn(name = "record_id")
    Record record;
}
