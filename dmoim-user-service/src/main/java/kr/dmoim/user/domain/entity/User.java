package kr.dmoim.user.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@Table("USER_TB")
public class User {

    @Id
    private Long userId;

    private String password;

    private String nickName;

    private LocalDateTime regDt;

    private LocalDateTime updDt;
}
