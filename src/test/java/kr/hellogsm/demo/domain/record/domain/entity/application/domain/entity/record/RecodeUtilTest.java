package kr.hellogsm.demo.domain.record.domain.entity.application.domain.entity.record;

import kr.hellogsm.demo.domain.record.domain.entity.Category;
import kr.hellogsm.demo.domain.record.domain.entity.Rating;
import kr.hellogsm.demo.domain.record.domain.entity.RecodeUtil;
import kr.hellogsm.demo.domain.record.domain.entity.Semester;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class RecodeUtilTest {

    RecodeUtil recodeUtil = new RecodeUtil();

    @Test
    void callRandomRatings() {
        List<Rating> sl = recodeUtil.callRandom일반Ratings();
        for(Rating s : sl)
            System.out.print(s.getSemester().getValue().toString() + " : " + s.getSubject().getName().toString() + " : " + s.getValue().toString() + " \n"  );
    }

    @Test
    void 교과그룹() {
        Map<Category, List<Rating>> rs = recodeUtil.callRandomAllRatings().stream()
                .collect(Collectors.groupingBy(rating -> rating.getSubject().getCategory()));
        for (List<Rating> sl : rs.values()) {
            for (Rating s : sl) {
                String parents = String.valueOf(s.getSubject().getParents());
                if(s.getSubject().getParents() != null)
                    parents = s.getSubject().getParents().getName();
                System.out.println(s.getId() + " " + parents + " " + s.getSubject().getName() + " " + s.getSubject().getCategory() + " " + s.getSemester().getValue() + " " + s.getValue());
            }
            System.out.println("------------------------------");
        }
    }

    @Test
    void 학기그룹() {
        Map<Semester, List<Rating>> rs = recodeUtil.callRandomAllRatings().stream()
                .collect(Collectors.groupingBy(rating -> rating.getSemester()));
        for (List<Rating> sl : rs.values()) {
            for (Rating s : sl) {
                String parents = String.valueOf(s.getSubject().getParents());
                if(s.getSubject().getParents() != null)
                    parents = s.getSubject().getParents().getName();
                System.out.println(s.getId() + " " + parents + " " + s.getSubject().getName() + " " + s.getSubject().getCategory() + " " + s.getSemester().getValue() + " " + s.getValue());
            }
            System.out.println("------------------------------");
        }
    }
}