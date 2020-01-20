package dev.mission.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dev.mission.entite.Mission;
@Repository
public interface MissionRepository extends JpaRepository<Mission, Integer>{
	List<Mission> findAll();
	
	@Query("Select m from Mission m where m.dateDebut=:dateDebut")
	List<Mission> findByDateDebut(@Param("dateDebut") LocalDate dateDebut);
}
