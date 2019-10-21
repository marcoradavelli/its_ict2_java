package org.fondazionejac.figure.repository;

import org.fondazionejac.figure.entities.Figura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiguraRepository extends JpaRepository<Figura, Long> {
	Figura findByIdfigure(String idfigure);
}
