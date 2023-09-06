package com.engine.notifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engine.notifications.models.SlackConfig;
@Repository
public interface SlackConfigRepository extends JpaRepository<SlackConfig,Long> {

}
