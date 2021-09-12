package kr.dmoim.domain.option.domain.vo;

import kr.dmoim.domain.option.domain.code.TagGroupType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
@ToString
@Embeddable
public class TagId implements Serializable {

    private static final long serialVersionUID = 2913322013597510002L;

    @Enumerated(EnumType.STRING)
    @Column(name = "TAG_GROUP_TYPE")
    private TagGroupType tagGroupType;

    @AttributeOverride(name = "value", column = @Column(name = "TARGET_ID"))
    private TargetId targetId;

    @Column(name = "TAG_NAME")
    private String tagName;
}
