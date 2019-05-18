package hello.service;

import hello.model.PreguntaRespuesta;

public interface PreguntaldosService {
	public String getPregunta(Integer id);
	public String getRespuesta(Integer id);
	public PreguntaRespuesta getPreguntaRespuesta(Integer id);
	public Boolean addPreguntaRespuesta(PreguntaRespuesta pr);
	public Boolean removePreguntaRespuesta(Integer id);
	public Boolean updatePreguntaRespuesta(Integer id, PreguntaRespuesta pr);
}
