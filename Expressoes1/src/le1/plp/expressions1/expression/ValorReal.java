package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.TipoPrimitivo;

/**
 * Objetos desta classe encapsulam valor inteiro.
 */
public class ValorReal extends ValorNumerico<Double> {
	
	public ValorReal(double valor) {
		super(valor, TipoPrimitivo.REAL);
	}

}
