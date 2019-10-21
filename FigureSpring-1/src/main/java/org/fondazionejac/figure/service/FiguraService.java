package org.fondazionejac.figure.service;
import java.util.List;

import org.fondazionejac.figure.entities.Figura;

public interface FiguraService 
{
	public List<Figura> SelTutti();
	
	public Figura SelByIdFigure(String idfigure);
	
	public void InsFigura(Figura figure);
	
	public void DelFigura(Figura figure);
}
