package dev.mission.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.mission.entite.Mission;
@Repository
public interface MissionRepository extends JpaRepository<Mission, Integer>{
	List<Mission> findAll();
}
