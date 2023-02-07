package kr.hellogsm.demo.record.domain.entity;

// TODO 일단 만들긴 했는데 사용안하는 중
public enum Semester {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    ONETOONE("1-1"),
    ONETOTWO("1-2"),
    TWOTOONE("2-1"),
    TWOTOTWO("2-2"),
    THREETOONE("3-1"),
    THREETOTWO("3-2");

    private final String value;

    Semester(String value) { this.value = value; }

    public String getValue() { return value; }
}
