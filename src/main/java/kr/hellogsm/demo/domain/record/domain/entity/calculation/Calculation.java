package kr.hellogsm.demo.domain.record.domain.entity.calculation;

import kr.hellogsm.demo.domain.record.domain.entity.AcademicRecord;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface Calculation {
    BigDecimal calculate();

    AcademicRecord getAcademicRecord();

}
