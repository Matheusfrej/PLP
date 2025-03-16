package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

/**
 * Um objeto desta classe representa uma Expressao de ordem da tabela ascii.
 */
public class ExpOrd extends ExpUnaria {

	/**
	 * Controi uma Expressao de ordem da tabela ascii com a expressao especificada
	 * assume-se que <code>exp</code> é uma expressao cuja avaliacao
	 * resulta num <code>ValorChar</code>
	 */
	public ExpOrd(Expressao exp) {
		super(exp, "ord");
	}

	/**
	 * Retorna o valor da Expressao de ordem da tabela ascii.
	 * 
	 * @param amb
	 *            o ambiente de execu��o.
	 */
	public Valor avaliar(AmbienteExecucao amb) {
		return new ValorInteiro ((int) ((ValorChar) getExp().avaliar(amb)).valor());
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
		return (getExp().getTipo(amb).eChar());
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
		return TipoPrimitivo.INTEIRO;
	}

}
