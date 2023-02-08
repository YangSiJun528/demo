package kr.hellogsm.demo.domain.record.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "record")
public class Record {

    @Id
    @Column(name = "record_id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "season_id")
    private List<Season> Seasons; // 자유학기 포함 전체학기 리스트

    @Enumerated(EnumType.STRING)
    @Column(name = "record_academic_record")
    AcademicRecord academicRecord;

}
