package kr.hellogsm.demo.domain.record.domain.entity.calculation;

import kr.hellogsm.demo.domain.record.domain.entity.AcademicRecord;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CandidateCalculation implements Calculation {
    @Override
    public BigDecimal calculate() {
        //일반교과 -> 학년 별로 묶기 -> 등급 합/과목 수 -> 학년 별로 점수 반영 비율 다르게 -> 점수 더해서 합계
        //예체능 -> 등급 합/과목 수 -> 합계
        //비교과 -> 출결 점수 구하기 -> 봉사 점수 구하기

        return null;
    }

    @Override
    public AcademicRecord getAcademicRecord() {
        return AcademicRecord.CANDIDATE;
    }
}
