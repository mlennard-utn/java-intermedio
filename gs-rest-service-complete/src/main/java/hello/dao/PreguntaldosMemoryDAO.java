package hello.dao;

import org.springframework.stereotype.Repository;

import hello.model.PreguntaRespuesta;

@Repository
public class PreguntaldosMemoryDAO implements PreguntaldosDAO {

	@Override
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletePreguntaRespuesta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		PreguntaRespuesta pr = new PreguntaRespuesta();
		pr.setId(id);
		pr.setPregunta("Como se llama?");
		pr.setRespuesta("Ud sabe");
		return pr;
	}

}
