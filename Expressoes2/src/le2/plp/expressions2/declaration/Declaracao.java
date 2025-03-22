package le2.plp.expressions2.declaration;

import le2.plp.expressions2.memory.AmbienteCompilacao;
import le2.plp.expressions2.memory.AmbienteExecucao;
import le2.plp.expressions2.memory.VariavelJaDeclaradaException;
import le2.plp.expressions2.memory.VariavelNaoDeclaradaException;

public interface Declaracao {
	public void elabora(AmbienteExecucao amb) throws VariavelJaDeclaradaException;
	public void elabora(AmbienteCompilacao amb) throws VariavelJaDeclaradaException;
	public boolean checaTipo(AmbienteCompilacao amb) throws VariavelJaDeclaradaException, VariavelNaoDeclaradaException;
	public void reduzir(AmbienteExecucao amb);
}
