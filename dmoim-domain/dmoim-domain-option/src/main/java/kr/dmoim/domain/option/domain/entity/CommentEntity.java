package kr.dmoim.domain.option.domain.entity;

import kr.dmoim.domain.option.domain.BaseEntity;
import kr.dmoim.domain.option.domain.code.CommentGroupType;
import kr.dmoim.domain.option.domain.vo.TargetId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_COMMENT_TB")
public class CommentEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long commentId;

    @Column(name = "COMMENT_GROUP_TYPE")
    @Enumerated(EnumType.STRING)
    private CommentGroupType commentGroupType;

    @AttributeOverride(name = "value", column = @Column(name = "TARGET_ID"))
    private TargetId targetId;

    @Column(name = "UPPER_COMMENT_ID")
    private Long upperCommentId;

    @Column(name = "CONTENT")
    private String content;
}
