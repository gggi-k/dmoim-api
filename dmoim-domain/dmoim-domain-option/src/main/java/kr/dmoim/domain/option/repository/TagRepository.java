package kr.dmoim.domain.option.repository;

import kr.dmoim.domain.option.domain.entity.FileEntity;
import kr.dmoim.domain.option.domain.entity.TagEntity;
import kr.dmoim.domain.option.domain.vo.TagId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, TagId> {
}
