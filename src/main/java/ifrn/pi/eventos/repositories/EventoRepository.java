package ifrn.pi.eventos.repositories;

import antlr.collections.List;
import ifrn.pi.eventos.models.Evento;

public interface EventoRepository {

	void save(Evento evento);

	List findAll();

}
