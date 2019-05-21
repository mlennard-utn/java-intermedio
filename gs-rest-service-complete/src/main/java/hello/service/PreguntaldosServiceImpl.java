package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.dao.PreguntaldosMemoryDAO;
import hello.model.PreguntaRespuesta;

@Service
public class PreguntaldosServiceImpl implements PreguntaldosService {

	@Autowired
	PreguntaldosMemoryDAO dao;
	
	@Override
	public String getPregunta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr.getPregunta();
	}

	@Override
	public String getRespuesta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr.getRespuesta();
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr;
	}

	@Override
	public Boolean addPreguntaRespuesta(PreguntaRespuesta pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removePreguntaRespuesta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePreguntaRespuesta(Integer id, PreguntaRespuesta pr) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
