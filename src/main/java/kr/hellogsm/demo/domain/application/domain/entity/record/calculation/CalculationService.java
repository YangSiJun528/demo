package kr.hellogsm.demo.domain.application.domain.entity.record.calculation;

import jakarta.annotation.PostConstruct;
import kr.hellogsm.demo.domain.application.domain.entity.application.school.AcademicRecord;

import java.math.BigDecimal;

public class CalculationService {
    private final CalculationFactory calculationFactory;

    public CalculationService(CalculationFactory calculationFactory) {
        this.calculationFactory = calculationFactory;
    }

    public BigDecimal calculate(AcademicRecord academicRecord) {
        return calculationFactory.getCalculation(academicRecord).calculate();
    }

    /** https://github.com/kurular4/medium-spring-factory/blob/master/src/main/java/com/omer/medium/factorypattern/service/ViewerService.java
     * 여기 있긴 한데, 왜 사용하는건지 모르겠음..
    @PostConstruct
    public void test() {
        calculation(AcademicRecord.CANDIDATE, new Video());
        calculation(AcademicRecord.GRADUATE, new Document());
        calculation(AcademicRecord.GED, new Image());
    }
    */
}
