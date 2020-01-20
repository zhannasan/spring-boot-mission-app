package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
public class InsererMission implements Runnable {
	@Autowired
	private MissionRepository missionRepository;

	/**
	 * @param missionRepository
	 */
	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Transactional
	@Override
	public void run() {
		Mission mission = new Mission();
		mission.setLibelle("Mission 1");
		mission.setTauxJournalier(new BigDecimal("100.90"));
		mission.setDateDebut(LocalDate.of(2019,1,1));
		mission.setDateFin(LocalDate.of(2019,3,4));
		
		this.missionRepository.save(mission);
	}

}
