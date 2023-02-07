package kr.hellogsm.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Record {

    @Id
    private Long id;

    @OneToMany
    private List<Season> freeSemesters; // 자유학기 리스트

}
