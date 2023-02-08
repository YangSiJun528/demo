package kr.hellogsm.demo.domain.record.domain.entity;

import jakarta.persistence.*;
import kr.hellogsm.demo.domain.application.entity.domain.score.Title;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "subject")
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Subject {

    @Id
    @Column(name = "subject_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Subject parents;

    @OneToMany(mappedBy = "parents")
    List<Subject> child = new ArrayList<>();

    @Column(name = "subject_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "subject_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "record_id")
    private Record record;
}
