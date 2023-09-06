package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.SlackConfig;
@Repository
public interface SlackConfigRepository extends JpaRepository<SlackConfig,Long> {

}
