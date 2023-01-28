package kr.hellogsm.demo.domain.application.sevice.impl;

import kr.hellogsm.demo.domain.application.domain.entity.Department;
import kr.hellogsm.demo.domain.application.sevice.Service;

import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service {
    @Override
    public Optional<Department> derive(List<Department> desiredDepartments) {
        return desiredDepartments.stream()
                .filter((department) -> { String s = "isRemainThisDepartment"; return true; }).findFirst();
    }
}
