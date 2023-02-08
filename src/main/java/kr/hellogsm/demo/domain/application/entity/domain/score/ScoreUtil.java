package kr.hellogsm.demo.domain.application.entity.domain.score;

import kr.hellogsm.demo.domain.application.entity.domain.Application;
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

    private final Application dummy_application = null;
    private final Title curriculum = new Title(1L, null, new ArrayList<>(), "교과 성적");
    private final Title nonCurriculum = new Title(2L,  null, new ArrayList<>(), "비교과 성적");
    private final Title curriculumTotal = new Title(3L,  null, new ArrayList<>(), "합계");
    private final List<Title> curriculums = new ArrayList<Title>(List.of(new Title(4L, curriculum, new ArrayList<>(), "2-1"), new Title(5L, curriculum, new ArrayList<>(), "2-2"), new Title(6L, curriculum, new ArrayList<>(), "3-1")));
    private final List<Title> nonCurriculums = new ArrayList<Title>(List.of(new Title(7L, nonCurriculum, new ArrayList<>(), "출석"), new Title(8L, nonCurriculum, new ArrayList<>(), "봉사활동"), new Title(9L, nonCurriculum, new ArrayList<>(), "소계")));

    public List<Title> getAllTitle() {
        List<Title> rs = new ArrayList<>();
        rs.addAll(getCurriculums());
        rs.addAll(getNonCurriculums());
        rs.add(getCurriculum());
        rs.add(getCurriculumTotal());
        rs.add(getNonCurriculum());
        return rs;
    }

    public void initCurriculums() {
        curriculum.child = curriculums;
        nonCurriculum.child = nonCurriculums;
    }

    public List<Score> callRandomCurriculumsScores() {
        return createRandomScores(curriculums);
    }

    public List<Score> callRandomNonCurriculumsScores() {
        return createRandomScores(nonCurriculums);
    }

    public List<Score> callAllRandomScores() {
        initCurriculums();
        List<Score> rs = new ArrayList<>();
        rs.addAll(callRandomCurriculumsScores());
        rs.addAll(callRandomNonCurriculumsScores());
        return rs;
    }

    public List<Score> createRandomScores(List<Title> titles) {
        initCurriculums();
        List<Score> randTitles = new ArrayList<>();
        AtomicLong index = new AtomicLong();
        Random random = new Random();
        for (Title title : titles) {
            randTitles.add(new Score(index.getAndIncrement(), title, new BigDecimal(random.nextInt(5)+1), null));
        }
        return randTitles;
    }
}

