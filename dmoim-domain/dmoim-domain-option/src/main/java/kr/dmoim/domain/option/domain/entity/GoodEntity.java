package kr.dmoim.domain.option.domain.entity;

import kr.dmoim.domain.option.domain.vo.GoodId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_GOOD_TB")
public class GoodEntity {

    @EmbeddedId
    private GoodId goodId;

    @Column(name = "GOOD_YN")
    private boolean goodYn;

    @Column(name = "CREATED_AT")
    private LocalDateTime createAt;
}
