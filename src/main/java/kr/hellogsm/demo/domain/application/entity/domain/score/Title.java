package kr.hellogsm.demo.domain.application.entity.domain.score;

import jakarta.persistence.*;
import kr.hellogsm.demo.domain.application.entity.domain.Application;
import kr.hellogsm.demo.domain.record.domain.entity.Record;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


//TODO 일단 재귀 해결하긴 했는데, JPA를 잘 몰라서 구글링 복붙함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Embeddable
@Entity
@Table(name = "title")
public class Title {

    @Id
    @Column(name = "title_id")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
//    @AttributeOverride(name = "parents", column = @Column(name = "parent_id"))
    Title parents;

//    @OneToMany
//    @JoinColumn(name = "title_id")
    @OneToMany(mappedBy = "parents")
    List<Title> child = new ArrayList<>();

    @Column(name = "title_name")
    String value;
}
