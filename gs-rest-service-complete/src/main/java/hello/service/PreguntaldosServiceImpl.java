package hello.service;

import org.springframework.stereotype.Service;

import hello.dao.PreguntaldosDAO;
import hello.dao.PreguntaldosMemoryDAO;
import hello.model.PreguntaRespuesta;

@Service
public class PreguntaldosServiceImpl implements PreguntaldosService {

	@Override
	public String getPregunta(Integer id) {
		PreguntaldosDAO dao = new PreguntaldosMemoryDAO();
		PreguntaRespuesta pr = dao.getPreguntaRespuesta(id);
		pr = new PreguntaRespuesta();
		pr.setId(id);
		pr.setPregunta("Como se llama?");
		pr.setRespuesta("Ud sabe");
		return pr.getPregunta();
	}

	@Override
	public String getRespuesta(Integer id) {
		PreguntaRespuesta pr = new PreguntaRespuesta();
		pr.setId(id);
		pr.setPregunta("Como se llama?");
		pr.setRespuesta("Ud sabe");
		return pr.getRespuesta();
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		PreguntaRespuesta pr = new PreguntaRespuesta();
		pr.setId(id);
		pr.setPregunta("Como se llama?");
		pr.setRespuesta("Ud sabe");
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
