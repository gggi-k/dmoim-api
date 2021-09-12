package kr.dmoim.domain.option.domain.vo;

import kr.dmoim.domain.option.domain.code.GoodGroupType;
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
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
@ToString
@Embeddable
public class GoodId implements Serializable {

    private static final long serialVersionUID = 8693333399597427911L;

    @Enumerated(EnumType.STRING)
    @Column(name = "GOOD_GROUP_TYPE")
    private GoodGroupType goodGroupType;

    @AttributeOverride(name = "value", column = @Column(name = "TARGET_ID"))
    private TargetId targetId;

    @Column(name = "CREATED_BY")
    private Long createdBy;
}
