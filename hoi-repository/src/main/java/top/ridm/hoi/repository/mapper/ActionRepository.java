package top.ridm.hoi.repository.mapper;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import top.ridm.hoi.repository.domain.Action;

@Repository
public interface ActionRepository extends CrudRepository<Action, Long> {

}