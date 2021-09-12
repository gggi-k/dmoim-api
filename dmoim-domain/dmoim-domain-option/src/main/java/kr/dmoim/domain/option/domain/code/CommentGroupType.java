package kr.dmoim.domain.option.domain.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommentGroupType {

    NOTICE("공지사항 댓글", 3);

    private String commentGroupName;
    private int limitLevel;
}
