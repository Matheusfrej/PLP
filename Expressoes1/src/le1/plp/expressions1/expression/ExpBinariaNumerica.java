package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Um objeto desta classe representa uma Expressao de Menor Que.
 */
public abstract class ExpBinariaNumerica extends ExpBinaria {

	/**
	 * Controi uma Expressao de Menor Que com as sub-expressoes especificadas.
	 * Assume-se que estas sub-expressoes resultam em <code>ValorInteiro</code> 
	 * quando avaliadas.
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpBinariaNumerica(Expressao esq, Expressao dir, String op) {
		super(esq, dir, op);
	}
	
	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @param amb
	 *            o ambiente de compila��o.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *         <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb) {
		return eNumerico(getEsq().getTipo(amb)) && eNumerico(getDir().getTipo(amb));
	}

	private boolean eNumerico(Tipo tp) {
		return tp.eInteiro() || tp.eReal();
	}

}
