package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Objetos desta classe encapsulam valor numerico.
 */
public abstract class ValorNumerico<T extends Number> extends ValorConcreto<T> {

  private Tipo tp;
	
	public ValorNumerico(T valor, Tipo tp) {
		super(valor);
    this.tp = tp;
	}

  @Override
	public Tipo getTipo(AmbienteCompilacao amb) {
		return this.tp;
	}

}
