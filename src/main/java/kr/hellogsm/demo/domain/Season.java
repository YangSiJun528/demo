package kr.hellogsm.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Season {

    @Id
    Long id;

    @Enumerated(EnumType.STRING)
    private Semester semester;

    private Boolean freeSemester;

    public Boolean isFreeSemester() {
        return freeSemester;
    }
}

