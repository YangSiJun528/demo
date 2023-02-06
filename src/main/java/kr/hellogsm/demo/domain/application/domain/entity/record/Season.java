package kr.hellogsm.demo.domain.application.domain.entity.record;

import jakarta.persistence.Embeddable;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Embeddable
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Season {
    private Semester semester;

    private Boolean freeSemester;

    public Boolean isFreeSemester() {
        return freeSemester;
    }
}
