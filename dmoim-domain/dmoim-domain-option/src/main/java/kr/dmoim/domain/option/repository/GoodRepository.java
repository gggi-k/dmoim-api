package kr.dmoim.domain.option.repository;

import kr.dmoim.domain.option.domain.entity.FileEntity;
import kr.dmoim.domain.option.domain.entity.GoodEntity;
import kr.dmoim.domain.option.domain.vo.GoodId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<GoodEntity, GoodId> {
}
