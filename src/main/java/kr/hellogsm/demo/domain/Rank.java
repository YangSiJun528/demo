package kr.hellogsm.demo.domain;

//TODO 비교과 DTO에만 사용하기
public enum Rank {
    A(5),
    B(4),
    C(3),
    D(2),
    E(1),
    F(0); // 원서에는 E까지 밖에 없는데 일단 냅둠

    private final int value;

    Rank(int val) { this.value = val; }

    public int getValue() { return value; }

    }
