package kr.dmoim.domain.option.domain;

import lombok.Getter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Version
    @Column(name = "VERSION")
    private int version;

    @Type(type = "yes_no")
    @Column(name = "USE_YN")
    private boolean useYn;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
}
