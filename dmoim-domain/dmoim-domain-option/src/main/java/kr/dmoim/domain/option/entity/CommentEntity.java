package kr.dmoim.domain.option.entity;

import kr.dmoim.domain.option.code.CommentGroupType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_COMMENT_TB")
public class CommentEntity {

    @Id
    @Column(name = "COMMENT_GROUP_TYPE")
    @Enumerated(EnumType.STRING)
    private CommentGroupType commentGroupType;

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
