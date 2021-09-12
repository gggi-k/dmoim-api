package kr.dmoim.domain.option.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_TAG_TB")
public class TagEntity {

    private Long createdBy;
    private LocalDateTime createAt;
}
