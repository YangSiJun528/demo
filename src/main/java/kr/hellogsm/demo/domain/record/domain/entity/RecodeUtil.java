package kr.hellogsm.demo.domain.record.domain.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class RecodeUtil {

    private Record dummy_record = null;

    private List<Semester> semesters = new ArrayList<>(List.of(Semester.ONETOONE, Semester.ONETOTWO, Semester.TWOTOONE, Semester.TWOTOTWO, Semester.THREETOONE));

    private List<Semester> grades = new ArrayList<>(List.of(Semester.ONE, Semester.TWO, Semester.THREE));


    //환산점은 꼭 있어야 함
    private List<Subject> 일반subjects = new ArrayList<>(List.of(
            new Subject(1L,null, new ArrayList<>(), "국어", Category.GeneralSubject, dummy_record),
            new Subject(2L, null, new ArrayList<>(), "도덕", Category.GeneralSubject, dummy_record),
            new Subject(3L, null, new ArrayList<>(), "사회", Category.GeneralSubject, dummy_record),
            new Subject(4L, null, new ArrayList<>(), "역사", Category.GeneralSubject, dummy_record),
            new Subject(5L, null, new ArrayList<>(), "수학", Category.GeneralSubject, dummy_record),
            new Subject(6L, null, new ArrayList<>(), "과학", Category.GeneralSubject, dummy_record),
            new Subject(7L, null, new ArrayList<>(), "기술가정", Category.GeneralSubject, dummy_record),
            new Subject(8L, null, new ArrayList<>(), "영어", Category.GeneralSubject, dummy_record),
            new Subject(9L, null, new ArrayList<>(), "환산점", Category.GeneralSubject, dummy_record)));

    private List<Subject> 예체능subjects = new ArrayList<>(List.of(
            new Subject(10L, null, new ArrayList<>(), "체육", Category.ArtSportSubject, dummy_record),
            new Subject(11L, null, new ArrayList<>(), "미술", Category.ArtSportSubject, dummy_record),
            new Subject(12L, null, new ArrayList<>(), "음악", Category.ArtSportSubject, dummy_record),
            new Subject(13L, null, new ArrayList<>(), "환산점", Category.ArtSportSubject, dummy_record)));

    private Subject 출결 = new Subject(14L, null, new ArrayList<>(), "출결", Category.NonSubject, dummy_record);
    private Subject 봉사 = new Subject(15L, null, new ArrayList<>(), "봉사", Category.NonSubject, dummy_record);
    private List<Subject> 비교과subjects = new ArrayList<>(List.of(
            new Subject(15L, 출결, new ArrayList<>(), "결석", Category.NonSubject, dummy_record),
            new Subject(16L, 출결, new ArrayList<>(), "지각", Category.NonSubject, dummy_record),
            new Subject(17L, 출결, new ArrayList<>(), "조퇴", Category.NonSubject, dummy_record),
            new Subject(18L, 출결, new ArrayList<>(), "결과", Category.NonSubject, dummy_record),
//            new Subject(출결, "환산일수", Category.NonSubject),
//            new Subject(출결, "환산점", Category.NonSubject),
            new Subject(19L, 봉사, new ArrayList<>(), "시간", Category.NonSubject, dummy_record)
            //        new Subject(봉사, "환산점", Category.NonSubject) 비교과 환산점/일수는 모든 학년 당 하나 뿐임
    ));

    public List<Semester> getSeasons() {
        return semesters;
    }

    public List<Semester> getGrades() { return grades; }

    public List<Subject> get비교과subjects() {
        return 비교과subjects;
    }

    public List<Subject> get예체능subjects() {
        return 예체능subjects;
    }

    public List<Subject> get일반subjects() {
        return 일반subjects;
    }

    public List<Subject> getAllSubjects() {
        List<Subject> rs = new ArrayList<>();
        rs.addAll(일반subjects);
        rs.addAll(비교과subjects);
        rs.addAll(예체능subjects);
        return rs;
    }

    // 클래스 안인데 굳이 getter 써야함? -> getter에 어떤 기능이 추가될지 모르니까 쓰는게 낫지 않나?
    public List<Rating> callRandom일반Ratings() {
        return this.createRandomRatings(getSeasons(), get일반subjects());
    }

    public List<Rating> callRandom예체능Ratings() {
        return this.createRandomRatings(getSeasons(), get예체능subjects());
    }

    public List<Rating> callRandom비교과Ratings() {
        return this.createRandomRatings(getGrades(), get비교과subjects());
    }

    // 정확히 따지면 비교과 부분은 형식이 달라서 올바른 메서드는 아님, 테스트 용도
    public List<Rating> callRandomAllRatings() {
        List<Rating> rs = new ArrayList<>();
        rs.addAll(callRandom일반Ratings());
        rs.addAll(callRandom예체능Ratings());
        rs.addAll(callRandom비교과Ratings());
        return rs;
    }

    public List<Rating> createRandomRatings(List<Semester> semesters, List<Subject> subjects) {
        List<Rating> randRatings = new ArrayList<>();
        AtomicLong index = new AtomicLong();
        Random random = new Random();
        for (Semester semester : semesters) {
            for (Subject subject : subjects) {
                randRatings.add(new Rating(index.getAndIncrement(), semester, subject, new BigDecimal(random.nextInt(5)+1), null));
            }
        }
        return randRatings;
    }
}
