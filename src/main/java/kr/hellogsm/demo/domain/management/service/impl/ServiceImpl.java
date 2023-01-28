package kr.hellogsm.demo.domain.management.service.impl;

import kr.hellogsm.demo.domain.management.service.Service;
import kr.hellogsm.demo.domain.user.domain.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceImpl implements Service {

    @Override
    public List<User> findAllUser() {
        return new ArrayList<>(Arrays.asList(new User(1L,"info1"), new User(2L,"info2")));
    }
}
