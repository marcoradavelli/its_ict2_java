package org.fondazionejac.figure.service;

import java.util.List;

import org.fondazionejac.figure.entities.Figura;
import org.fondazionejac.figure.repository.FiguraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FiguraServiceImpl implements FiguraService {

	@Autowired
	FiguraRepository figuraRepository;
	
	@Override
	public List<Figura> SelTutti() {
		return figuraRepository.findAll();
	}

	@Override
	public Figura SelByIdFigure(String idfigure) {
		return figuraRepository.findByIdfigure(idfigure);
	}

	@Override
	public void InsFigura(Figura figura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DelFigura(Figura figura) {
		// TODO Auto-generated method stub
		
	}

}
