package hello.dao;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import hello.model.PreguntaRespuesta;

@Repository
public class PreguntaldosMemoryDAO implements PreguntaldosDAO {

	@Override
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr) {
		AtomicLong counter = new AtomicLong();
		return (int)counter.getAndIncrement();
	}

	@Override
	public Boolean deletePreguntaRespuesta(Integer id) {
		return Boolean.FALSE;
	}

	@Override
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta pr) {
		return Boolean.TRUE;
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
