package kr.hellogsm.demo.application.entity.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class DesiredDepartment {

    @Id
    Long order;

    @Enumerated(EnumType.STRING)
    Department department;
}
