package kr.hellogsm.demo.domain.application.domain.entity.record;

import kr.hellogsm.demo.domain.application.repository.DummyRecodeRepo;

public class CalculationService {

    final private DummyRecodeRepo dummyRecodeRepo = new DummyRecodeRepo();

    // 일반교과 -> 학년 별로 묶기 -> 등급 합/과목 수 -> 학년 별로 점수 반영 비율 다르게 -> 점수 더해서 합계

    //예체능 -> 등급 합/과목 수 -> 합계

    //비교과 -> 출결 점수 구하기 -> 봉사 점수 구하기

}
