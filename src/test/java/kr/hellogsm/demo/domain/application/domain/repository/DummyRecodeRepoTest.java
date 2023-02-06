package kr.hellogsm.demo.domain.application.domain.repository;

import kr.hellogsm.demo.domain.application.domain.entity.record.Category;
import kr.hellogsm.demo.domain.application.domain.entity.record.Rating;
import kr.hellogsm.demo.domain.application.domain.entity.record.Season;
import kr.hellogsm.demo.domain.application.domain.entity.record.RecodeUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class DummyRecodeRepoTest {

    RecodeUtil dummyRecodeRepo = new RecodeUtil();

    @Test
    void callRandomRatings() {
        List<Rating> sl = dummyRecodeRepo.callRandom일반Ratings();
        for(Rating s : sl)
            System.out.print(s.getSeason().getSeason().toString() + " : " + s.getSubject().getSubject().toString() + " : " + s.getValue().toString() + " \n"  );
    }

    @Test
    void 교과그룹() {
        Map<Category, List<Rating>> rs = dummyRecodeRepo.callRandomAllRatings().stream()
                .collect(Collectors.groupingBy(rating -> rating.getSubject().getCategory()));
        for (List<Rating> sl : rs.values()) {
            for (Rating s : sl) {
                String parents = String.valueOf(s.getSubject().getParents());
                if(s.getSubject().getParents() != null)
                    parents = s.getSubject().getParents().getSubject();
                System.out.println(s.getId() + " " + parents + " " + s.getSubject().getSubject() + " " + s.getSubject().getCategory() + " " + s.getSeason().getSeason() + " " + s.getValue());
            }
            System.out.println("------------------------------");
        }
    }

    @Test
    void 학기그룹() {
        Map<Season, List<Rating>> rs = dummyRecodeRepo.callRandomAllRatings().stream()
                .collect(Collectors.groupingBy(rating -> rating.getSeason()));
        for (List<Rating> sl : rs.values()) {
            for (Rating s : sl) {
                String parents = String.valueOf(s.getSubject().getParents());
                if(s.getSubject().getParents() != null)
                    parents = s.getSubject().getParents().getSubject();
                System.out.println(s.getId() + " " + parents + " " + s.getSubject().getSubject() + " " + s.getSubject().getCategory() + " " + s.getSeason().getSeason() + " " + s.getValue());
            }
            System.out.println("------------------------------");
        }
    }
}