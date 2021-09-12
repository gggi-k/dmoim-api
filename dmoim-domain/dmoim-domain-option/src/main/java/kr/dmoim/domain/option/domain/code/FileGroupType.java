package kr.dmoim.domain.option.domain.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.net.MalformedURLException;
import java.net.URL;

@Getter
@AllArgsConstructor
public enum FileGroupType {

    USER_PROFILE("사용자 프로필", null, "/files/user/profile", 1, 10),
    NOTICE("공지사항 파일", null, "/files/notice", 5, 10);

    private final String fileGroupName;
    private final Class targetEntity;
    private final String basePath;
    private final int limitCount;
    private final int limitSize;

    public URL getBasePath() {
        try {
            return new URL(this.basePath);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public int getLimitSizeToMB() {
        return this.limitSize * 1024 * 1024;
    }
}
