package kr.hellogsm.demo.domain.application.domain.repository;

import kr.hellogsm.demo.domain.application.domain.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repostitory extends JpaRepository<Application, Long> {

    @Override
    List<Application> findAll();

    List<Application> findAllById();
}
