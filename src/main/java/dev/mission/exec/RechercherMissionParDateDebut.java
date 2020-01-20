package dev.mission.exec;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;
@Controller
public class RechercherMissionParDateDebut implements Runnable{
	private MissionRepository missionRepository;
	
	/**
	 * @param missionRepository
	 */
	public RechercherMissionParDateDebut(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
		List<Mission> missions = missionRepository.findByDateDebut(dateDebutRecherche);
		for(Mission m : missions){
			System.out.println(m.toString());
		}
	}

}
