package tn.esprit.hamza_rekik_arctic10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.hamza_rekik_arctic10.entities.Project;

public interface IProjectRepository extends JpaRepository<Project, Long> {
}
