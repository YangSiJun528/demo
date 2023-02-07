package kr.hellogsm.demo.domain.record.domain.entity.calculation;

import com.example.demo.application.entity.domain.score.AcademicRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class CalculationFactory {

    private Map<AcademicRecord, Calculation> calculationMap;

    @Autowired
    public CalculationFactory(List<Calculation> calculations) {
        calculationMap = calculations.stream()
                .collect(Collectors.toUnmodifiableMap(Calculation::getAcademicRecord, Function.identity()));
        // Function.identity() -> 람다에 들어온 요소 자체를 반환 함
    }

    public Calculation getCalculation(AcademicRecord academicRecord) {
        return Optional.ofNullable(calculationMap.get(academicRecord)).orElseThrow(IllegalArgumentException::new);
    }


    @Component
    public interface Calculation {
        BigDecimal calculate();
        AcademicRecord getAcademicRecord();
    }

    @Component
    private class CandidateCalculation implements Calculation {
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

    @Component
    private class GraduateCalculation implements Calculation {
        @Override
        public BigDecimal calculate() {
            return null;
        }

        @Override
        public AcademicRecord getAcademicRecord() {
            return AcademicRecord.GRADUATE;
        }
    }

    @Component
    private class GedCalculation implements Calculation {
        @Override
        public BigDecimal calculate() {
            return null;
        }

        @Override
        public AcademicRecord getAcademicRecord() {
            return AcademicRecord.GED;
        }
    }
}
