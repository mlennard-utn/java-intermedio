package hello.dao;

import hello.model.PreguntaRespuesta;

public interface PreguntaldosDAO {
	public Integer insertPreguntaRespuesta(PreguntaRespuesta pr);
	public Boolean deletePreguntaRespuesta(Integer id);
	public Boolean updatePreguntaRespuesta(PreguntaRespuesta pr);
	public PreguntaRespuesta getPreguntaRespuesta(Integer id);
}
