package kr.hellogsm.demo.domain.record.domain.entity.calculation;

import kr.hellogsm.demo.domain.record.domain.entity.AcademicRecord;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GedCalculation implements Calculation {
    @Override
    public BigDecimal calculate() {
        return null;
    }

    @Override
    public AcademicRecord getAcademicRecord() {
        return AcademicRecord.GED;
    }
}