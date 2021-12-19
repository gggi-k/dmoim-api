package kr.dmoim.domain.user.domain.entity;

import kr.dmoim.core.domain.vo.Email;
import kr.dmoim.core.domain.vo.Password;
import kr.dmoim.r2dbc.entity.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("USER_TB")
public class UserEntity extends BaseEntity {

    @Id
    @Column(value = "USER_ID")
    private Long userId;

    @Column(value = "EMAIL")
    private Email email;

    @Column(value = "PASSWORD")
    private Password password;

    @Column(value = "NICK_NAME")
    private String nickName;

}
