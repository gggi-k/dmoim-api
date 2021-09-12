package kr.dmoim.domain.option.entity;

import kr.dmoim.domain.option.code.FileGroupType;
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
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_FILE_TB")
public class FileEntity {

    @Id
    @Column(name = "FILE_GROUP_TYPE")
    @Enumerated(EnumType.STRING)
    private FileGroupType fileGroupType;

    @Column(name = "FILE_ORIGIN_NAME")
    private String fileOriginName;

    @Column(name = "FILE_SERVER_NAME")
    private String fileServerName;

    @Column(name = "ABSOLUTE_PATH")
    private String absolutePath;

    @Column(name = "EXTENSION")
    private String extension;

    @Column(name = "SIZE")
    private long size;

    @Column(name = "DOWN_COUNT")
    private int downCount;

    @Type(type = "yes_no")
    @Column(name = "USE_YN")
    private boolean useYn;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

}
