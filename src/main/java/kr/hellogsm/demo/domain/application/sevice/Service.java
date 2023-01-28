package kr.hellogsm.demo.domain.application.sevice;

import kr.hellogsm.demo.domain.application.domain.entity.Department;

import java.util.List;
import java.util.Optional;

public interface Service {

    Optional<Department> derive(List<Department> desiredDepartments);  //TODO 올바르게 동작했다는 전체 하에 깂이 null 일 수 없는데 Optional을 쓰는게 맞나?

}
