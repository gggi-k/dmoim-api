package kr.dmoim.domain.user.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@Table("USER_TB")
@AccessType(AccessType.Type.FIELD)
public class User {

    @Id
    private final Long userId;

    private String password;

    private String nickName;

    private Boolean deleteYn;

    @Version
    private Long version;

    @CreatedBy
    private String createBy;

    @CreatedDate
    private LocalDateTime createDateTime;

    @LastModifiedBy
    private String updateBy;

    @LastModifiedDate
    private LocalDateTime updateDateTime;

}
