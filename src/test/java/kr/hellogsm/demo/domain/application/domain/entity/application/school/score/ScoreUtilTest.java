package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import kr.hellogsm.demo.domain.application.domain.entity.application.school.Score;
import kr.hellogsm.demo.domain.application.domain.entity.application.school.ScoreUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

class ScoreUtilTest {

    ScoreUtil scoreUtil = new ScoreUtil();

    @Test
    void callAllRandomScores() {
        List<Score> rs = scoreUtil.callAllRandomScores();
        for (Score s : rs) {
            String parents = null;
            if(s.getTitle().getParents() != null)
                parents = String.valueOf(s.getTitle().getParents().getValue());
            System.out.println(s.getId() + " " + parents + " " + s.getTitle().getValue() + " " + s.getValue());
        System.out.println("------------------------------");
        }
    }
}