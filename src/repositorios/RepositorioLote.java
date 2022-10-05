package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Lote;

public class RepositorioLote {
	private List<Lote> lotes = new ArrayList<Lote>();

	public RepositorioLote() {
	}
	public void addLote(Lote l) {
		lotes.add(l);
	}
	

}
