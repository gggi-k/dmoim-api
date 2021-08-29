package kr.dmoim.domain.user.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.*;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@Table("USER_TB")
public class User {

    @Id
    @Column(value = "USER_ID")
    private final Long userId;

    @Column(value = "EMAIL")
    private String email;

    @Column(value = "PASSWORD")
    private String password;

    @Column(value = "NICK_NAME")
    private String nickName;

    @Version
    @Column(value = "VERSION")
    private Long version;

    @Column(value = "DELETE_YN")
    private Boolean deleteYn;

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
