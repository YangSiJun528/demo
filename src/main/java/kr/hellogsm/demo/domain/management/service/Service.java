package kr.hellogsm.demo.domain.management.service;

import kr.hellogsm.demo.domain.user.domain.entity.User;

import java.util.List;

public interface Service {
    List<User> findAllUser();
}
