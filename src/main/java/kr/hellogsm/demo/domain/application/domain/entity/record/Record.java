package kr.hellogsm.demo.domain.application.domain.entity.record;

import java.util.List;

public class Record {

    final private RecodeUtil dummyRepo = new RecodeUtil();

    List<Season> seasons = dummyRepo.getSeasons();

    // TODO DB 추가하면 findby
    List<Subject> 일반subjects = dummyRepo.get일반subjects();

    List<Subject> 예체능subjects = dummyRepo.get예체능subjects();

    List<Subject> 비교과subjects = dummyRepo.get비교과subjects();


    // DTO.stream().일반교과 filter -> for season -> for subject (2중 loop) -> 항목 추가
    // -> DTO는 배열 형식이나 map에 id를 붙이는 것처럼 순서가 보장되서 오거나, season과 subject를 사용해서 특정 셀의 값을 읻을 수 있어야 함
    // DB.일반교과만 -> 성적 계산 -> 산출 점수 리턴
    // DB.비교과만 -> 출결상황 -> 출결상항 하위 교과? 처리 -> 산출 점수 리턴
}
