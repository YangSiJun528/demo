package kr.hellogsm.demo.domain.application.domain.entity.record;

import java.util.ArrayList;
import java.util.List;

public class Record { // 기본으로 있는 표 형식

    List<Semester> semesters = new ArrayList<Semester>(List.of(new Semester("1-1"), new Semester("1-2"),
            new Semester("2-1"), new Semester("2-2"), new Semester("3-1")));

    //TODO Subject 라는 이름에 환산점은 어울리지 않음, Subject 클래스 명 변경 필요
    List<Subject> generalSubjects = new ArrayList<Subject>(List.of(new Subject("국어"), new Subject("도덕"),
            new Subject("사회"), new Subject("역사"), new Subject("수학"), new Subject("과학"), 
            new Subject("기술가정"), new Subject("영어"), new Subject("환산점")));

    List<Subject> artAndSportSubjects = new ArrayList<Subject>(List.of(new Subject("체육"), new Subject("미술"),
            new Subject("음악"), new Subject("환산점")));

}
