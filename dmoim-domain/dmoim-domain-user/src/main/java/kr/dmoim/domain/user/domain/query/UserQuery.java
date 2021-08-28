package kr.dmoim.domain.user.domain.query;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class UserQuery {

    private String nickName;
}
