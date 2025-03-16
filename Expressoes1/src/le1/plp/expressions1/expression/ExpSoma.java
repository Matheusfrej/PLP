package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

/**
 * Um objeto desta classe representa uma Expressao de Soma.
 */
public class ExpSoma extends ExpBinariaNumerica {

	/**
	 * Controi uma Expressao de Soma com as sub-expressoes especificadas.
	 * Assume-se que estas sub-expressoes resultam em <code>ValorInteiro</code> 
	 * quando avaliadas.
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpSoma(Expressao esq, Expressao dir) {
		super(esq, dir, "+");
	}

	/**
	 * Retorna o valor da Expressao de Soma
	 * 
	 * @param amb
	 *            o ambiente de execu��o.
	 */
	public Valor avaliar(AmbienteExecucao amb) {
		Valor vEsq = getEsq().avaliar(amb);
		Valor vDir = getDir().avaliar(amb);

		double resultado = ((ValorNumerico<?>) vEsq).valor().doubleValue() + ((ValorNumerico<?>) vDir).valor().doubleValue();
		
		if (vEsq instanceof ValorInteiro && vDir instanceof ValorInteiro) {
			return new ValorInteiro((int) resultado);
		} else {
			return new ValorReal(resultado);
		}
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
		return getEsq().getTipo(amb).eInteiro() && getDir().getTipo(amb).eInteiro() ? TipoPrimitivo.INTEIRO : TipoPrimitivo.REAL;
	}

}
