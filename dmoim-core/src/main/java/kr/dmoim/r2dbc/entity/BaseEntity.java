package kr.dmoim.r2dbc.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public class BaseEntity {

    @Version
    @Column(value = "VERSION")
    private Long version;

    @Builder.Default
    @Column(value = "DELETED")
    private Boolean deleted = false;

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
