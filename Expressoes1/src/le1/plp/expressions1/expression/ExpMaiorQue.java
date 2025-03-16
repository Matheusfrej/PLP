package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

/**
 * Um objeto desta classe representa uma Expressao de Maior Que.
 */
public class ExpMaiorQue extends ExpBinariaNumerica {

	/**
	 * Controi uma Expressao de Maior Que com as sub-expressoes especificadas.
	 * Assume-se que estas sub-expressoes resultam em <code>ValorInteiro</code> 
	 * quando avaliadas.
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpMaiorQue(Expressao esq, Expressao dir) {
		super(esq, dir, ">");
	}

	/**
	 * Retorna o valor da Expressao de Menor Que
	 * 
	 * @param amb
	 *            o ambiente de execu��o.
	 */
	public Valor avaliar(AmbienteExecucao amb) {
		return new ValorBooleano(
			((ValorNumerico<?>) getEsq().avaliar(amb)).valor().doubleValue() >
			((ValorNumerico<?>) getDir().avaliar(amb)).valor().doubleValue() );
	}
	
	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * 
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.BOOLEANO;
	}

}
