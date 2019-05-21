package hello.service;

import org.springframework.stereotype.Service;

import hello.model.PreguntaRespuesta;

@Service
public interface PreguntaldosService {
	public String getPregunta(Integer id);
	public String getRespuesta(Integer id);
	public PreguntaRespuesta getPreguntaRespuesta(Integer id);
	public Boolean addPreguntaRespuesta(PreguntaRespuesta pr);
	public Boolean removePreguntaRespuesta(Integer id);
	public Boolean updatePreguntaRespuesta(Integer id, PreguntaRespuesta pr);
}
