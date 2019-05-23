package hello.dao;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import hello.model.PreguntaRespuesta;

@Repository
public class PreguntaldosMemoryDAO implements PreguntaldosDAO {

	private HashMap<Integer, PreguntaRespuesta> preguntas = new HashMap<>();
	private AtomicLong counter = new AtomicLong(0);
	
	@Override
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr) {
		Integer id = (int)counter.getAndIncrement();
		pr.setId(id);
		preguntas.put(id, pr);
		return id;
				
	}

	@Override
	public Boolean deletePreguntaRespuesta(Integer id) {
		if (preguntas.containsKey(id)) {
			preguntas.remove(id); 
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	@Override
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta pr) {
		return Boolean.TRUE;
	}

	@Override
	public PreguntaRespuesta getPreguntaRespuesta(Integer id) {
		
		return preguntas.get(id);
	}
	

}
