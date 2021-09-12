package kr.dmoim.domain.option.domain.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GoodGroupType {

    USER("사용자 태그", null);

    private final String goodGroupName;
    private final Class targetEntity;
}
