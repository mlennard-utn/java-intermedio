package hello.service;

import hello.dao.PreguntaldosDAO;
import hello.dao.PreguntaldosMemoryDAO;
import hello.model.PreguntaRespuesta;

public class PreguntaldosServiceImpl implements PreguntaldosService {

	@Override
	public String getPregunta(Integer id) {
		PreguntaldosDAO dao = new PreguntaldosMemoryDAO();
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		
		return pr.getPregunta();
	}

	@Override
	public String getRespuesta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
