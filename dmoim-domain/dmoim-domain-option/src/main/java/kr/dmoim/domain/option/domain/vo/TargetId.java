package kr.dmoim.domain.option.domain.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(staticName = "of")
@EqualsAndHashCode
@ToString
@Embeddable
public class TargetId implements Serializable{

    private static final long serialVersionUID = -2585190214979037228L;

    private String value;
}
