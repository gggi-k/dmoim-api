package kr.dmoim.domain.user.domain.entity;

import kr.dmoim.domain.vo.Email;
import kr.dmoim.domain.vo.Password;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@Table("USER_TB")
public class UserEntity {

    @Id
    @Column(value = "USER_ID")
    private final Long userId;

    @Column(value = "EMAIL")
    private Email email;

    @Column(value = "PASSWORD")
    private Password password;

    @Column(value = "NICK_NAME")
    private String nickName;

    @Version
    @Column(value = "VERSION")
    private Long version;

    @Column(value = "DELETED")
    private Boolean deleted;

    @CreatedBy
    @Column(value = "CREATED_BY")
    private Long createdBy;

    @CreatedDate
    @Column(value = "CREATED_AT")
    private LocalDateTime createdAt;

    @LastModifiedBy
    @Column(value = "UPDATED_BY")
    private Long updatedBy;

    @LastModifiedDate
    @Column(value = "UPDATED_AT")
    private LocalDateTime updatedAt;



}
