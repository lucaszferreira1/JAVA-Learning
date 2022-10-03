
public class CalculadoraComplexos implements IOperacoesbasicas<Complexo>{

	@Override
	public Complexo soma(Complexo operador1, Complexo operador2) {
		// TODO Auto-generated method stub
		return new Complexo(operador1.getReal() + operador2.getReal(), operador1.getImaginaria() + operador2.getImaginaria());
	}

	@Override
	public Complexo subtrair(Complexo operador1, Complexo operador2) {
		// TODO Auto-generated method stub
		return new Complexo(operador1.getReal() - operador2.getReal(), operador1.getImaginaria() -
				operador2.getImaginaria());
	}

}
