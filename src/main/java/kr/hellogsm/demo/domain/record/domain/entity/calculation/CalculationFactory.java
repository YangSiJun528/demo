package kr.hellogsm.demo.domain.record.domain.entity.calculation;

import kr.hellogsm.demo.domain.record.domain.entity.AcademicRecord;
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
}
