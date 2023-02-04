package kr.hellogsm.demo.domain.application.domain.entity.record;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Rating {
    Long id;
    Season season;
    Subject subject;
    BigDecimal value;

    static public List<Rating> createRandomRatings(List<Season> seasons, List<Subject> subjects) {
        List<Rating> randRatings = new ArrayList<>();
        AtomicLong index = new AtomicLong();
        Random random = new Random();
        for (Season season : seasons) {
            for (Subject subject : subjects) {
                randRatings.add(new Rating(index.getAndIncrement(), season, subject, new BigDecimal(random.nextInt(5)+1)));
            }
        }
        return randRatings;
    }
}
