package kr.hellogsm.demo.domain.record.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "season")
@Getter
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Season {

    @Id
    @Column(name = "season_id")
    Long id;

    @Enumerated(EnumType.STRING)
    private Semester semester;

    private Boolean freeSemester;

    public Boolean isFreeSemester() {
        return freeSemester;
    }
}

