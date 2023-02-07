package kr.hellogsm.demo.domain.record.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Record {

    @Id
    private Long id;

    @OneToMany
    private List<Season> freeSemesters; // 자유학기 리스트

    @Enumerated(EnumType.STRING)
    AcademicRecord academicRecord;

}
