package kr.hellogsm.demo.domain.application.entity.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "desired_department")
public class DesiredDepartment {

    @Id
    @Column(name = "desired_department_id")
    Long order;

    @Column(name = "desired_department_department")
    @Enumerated(EnumType.STRING)
    Department department;
}
