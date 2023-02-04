package kr.hellogsm.demo.domain.application.repository;

import kr.hellogsm.demo.domain.application.domain.entity.record.Category;
import kr.hellogsm.demo.domain.application.domain.entity.record.Rating;
import kr.hellogsm.demo.domain.application.domain.entity.record.Season;
import kr.hellogsm.demo.domain.application.domain.entity.record.Subject;

import java.util.ArrayList;
import java.util.List;

public class DummyRecodeRepo {
    
    // 예네들 따로 분리해야 함
    private List<Season> seasons = new ArrayList<Season>(List.of(new Season("1-1"), new Season("1-2"),
            new Season("2-1"), new Season("2-2"), new Season("3-1"), new Season("3-2")));

    private List<Season> grades = new ArrayList<Season>(List.of(new Season("1"), new Season("2"), new Season("3")));

    //환산점은 꼭 있어야 함
    private List<Subject> 일반subjects = new ArrayList<>(List.of(
            new Subject(null, "국어", Category.GeneralSubject),
            new Subject(null, "도덕", Category.GeneralSubject),
            new Subject(null, "사회", Category.GeneralSubject),
            new Subject(null, "역사", Category.GeneralSubject),
            new Subject(null, "수학", Category.GeneralSubject),
            new Subject(null, "과학", Category.GeneralSubject),
            new Subject(null, "기술가정", Category.GeneralSubject),
            new Subject(null, "영어", Category.GeneralSubject),
            new Subject(null, "환산점", Category.GeneralSubject)));

    private List<Subject> 예체능subjects = new ArrayList<>(List.of(
            new Subject(null, "체육", Category.ArtSportSubject),
            new Subject(null, "미술", Category.ArtSportSubject),
            new Subject(null, "음악", Category.ArtSportSubject),
            new Subject(null, "환산점", Category.ArtSportSubject)));

    private Subject 출결 = new Subject(null, "출결", Category.NonSubject);
    private Subject 봉사 = new Subject(null, "봉사", Category.NonSubject);
    private List<Subject> 비교과subjects = new ArrayList<>(List.of(
            new Subject(출결, "결석", Category.NonSubject),
            new Subject(출결, "지각", Category.NonSubject),
            new Subject(출결, "조퇴", Category.NonSubject),
            new Subject(출결, "결과", Category.NonSubject),
//            new Subject(출결, "환산일수", Category.NonSubject),
//            new Subject(출결, "환산점", Category.NonSubject),
            new Subject(봉사, "시간", Category.NonSubject)
    //        new Subject(봉사, "환산점", Category.NonSubject) 비교과 환산점/일수는 모든 학년 당 하나 뿐임
    ));

    public List<Season> getSeasons() {
        return seasons;
    }

    public List<Season> getGrades() { return grades; }

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
        return Rating.createRandomRatings(getSeasons(), get일반subjects());
    }

    public List<Rating> callRandom예체능Ratings() {
        return Rating.createRandomRatings(getSeasons(), get예체능subjects());
    }

    public List<Rating> callRandom비교과Ratings() {
        return Rating.createRandomRatings(getGrades(), get비교과subjects());
    }

    // 정확히 따지면 비교과 부분은 형식이 달라서 올바른 메서드는 아님, 테스트 용도
    public List<Rating> callRandomAllRatings() {
        List<Rating> rs = new ArrayList<>();
        rs.addAll(callRandom일반Ratings());
        rs.addAll(callRandom예체능Ratings());
        rs.addAll(callRandom비교과Ratings());
        return rs;
    }
}
