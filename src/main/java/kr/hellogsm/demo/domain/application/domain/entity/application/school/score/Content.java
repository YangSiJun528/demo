package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
public class Content {

    Title curriculum = new Title(null, "교과 성적");
    Title nonCurriculum = new Title(null, "비교과 성적");
    Title curriculumTotal = new Title(null, "합계");
    List<Title> curriculums = new ArrayList<Title>(List.of(new Title(curriculum, "2-1"), new Title(curriculum, "2-2"), new Title(curriculum, "3-1")));
    List<Title> nonCurriculums = new ArrayList<Title>(List.of(new Title(nonCurriculum, "출석"), new Title(nonCurriculum, "봉사활동"), new Title(nonCurriculum, "소계")));

    public List<Title> getAllTitle() {
        List<Title> rs = new ArrayList<>();
        rs.addAll(getCurriculums());
        rs.addAll(getNonCurriculums());
        rs.add(getCurriculum());
        rs.add(getCurriculumTotal());
        rs.add(getNonCurriculum());
        return rs;
    }
}

