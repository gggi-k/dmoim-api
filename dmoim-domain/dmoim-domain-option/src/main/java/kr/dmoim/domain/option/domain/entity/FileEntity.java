package kr.dmoim.domain.option.domain.entity;

import kr.dmoim.domain.option.domain.code.FileGroupType;
import kr.dmoim.domain.option.domain.vo.TargetId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "OPTION_FILE_TB")
public class FileEntity {

    @Id
    @GeneratedValue
    @Column(name = "FILE_ID")
    private Long fileId;

    @Enumerated(EnumType.STRING)
    @Column(name = "FILE_GROUP_TYPE")
    private FileGroupType fileGroupType;

    @AttributeOverride(name = "value", column = @Column(name = "TARGET_ID"))
    private TargetId targetId;

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
