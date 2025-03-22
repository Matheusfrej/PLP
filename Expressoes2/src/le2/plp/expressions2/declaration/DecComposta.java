package le2.plp.expressions2.declaration;

import le2.plp.expressions2.memory.AmbienteCompilacao;
import le2.plp.expressions2.memory.AmbienteExecucao;
import le2.plp.expressions2.memory.VariavelJaDeclaradaException;

public class DecComposta implements Declaracao {
	private Declaracao d1;
	private Declaracao d2;
	
	public DecComposta(Declaracao d1, Declaracao d2){
		this.d1=d1;
		this.d2=d2;
	}
	
	public void elabora(AmbienteExecucao amb) throws VariavelJaDeclaradaException {
		d1.elabora(amb);
		d2.elabora(amb);
	}
	
	public void elabora(AmbienteCompilacao amb) throws VariavelJaDeclaradaException {
		d1.elabora(amb);
		d2.elabora(amb);
	}
	
	public boolean checaTipo(AmbienteCompilacao amb){
		return (d1.checaTipo(amb) && d2.checaTipo(amb));
	}
	
	public void reduzir(AmbienteExecucao amb){
		d1.reduzir(amb);
		d2.reduzir(amb);
	}
}
