package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import kr.hellogsm.demo.domain.application.domain.entity.record.Rating;
import kr.hellogsm.demo.domain.application.domain.entity.record.Season;
import kr.hellogsm.demo.domain.application.domain.entity.record.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;


@Getter
@AllArgsConstructor
public class ScoreUtil {

    final Title curriculum = new Title(null, "교과 성적");
    final Title nonCurriculum = new Title(null, "비교과 성적");
    final Title curriculumTotal = new Title(null, "합계");
    final List<Title> curriculums = new ArrayList<Title>(List.of(new Title(curriculum, "2-1"), new Title(curriculum, "2-2"), new Title(curriculum, "3-1")));
    final List<Title> nonCurriculums = new ArrayList<Title>(List.of(new Title(nonCurriculum, "출석"), new Title(nonCurriculum, "봉사활동"), new Title(nonCurriculum, "소계")));

    public List<Title> getAllTitle() {
        List<Title> rs = new ArrayList<>();
        rs.addAll(getCurriculums());
        rs.addAll(getNonCurriculums());
        rs.add(getCurriculum());
        rs.add(getCurriculumTotal());
        rs.add(getNonCurriculum());
        return rs;
    }

    public List<Score> callRandomCurriculumsScores() {
        return createRandomScores(curriculums);
    }

    public List<Score> callRandomNonCurriculumsScores() {
        return createRandomScores(nonCurriculums);
    }

    public List<Score> callAllRandomScores() {
        List<Score> rs = new ArrayList<>();
        rs.addAll(callRandomCurriculumsScores());
        rs.addAll(callRandomNonCurriculumsScores());
        return rs;
    }

    public List<Score> createRandomScores(List<Title> titles) {
        List<Score> randTitles = new ArrayList<>();
        AtomicLong index = new AtomicLong();
        Random random = new Random();
        for (Title title : titles) {
            randTitles.add(new Score(index.getAndIncrement(), title, new BigDecimal(random.nextInt(5)+1)));
        }
        return randTitles;
    }
}

