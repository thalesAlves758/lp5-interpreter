public class CalculoSalario {
    public static String formula = "porcentagemBonificacao - porcentagemImposto / 100 + 1 * salarioPorHora * horasTrabalhadas";

    public static double calcular(Funcionario funcionario, double horasTrabalhadas) {
        String expressao;
        expressao = formula.replace("porcentagemBonificacao", Double.toString(funcionario.getPorcentagemBonificacao()));
        expressao = expressao.replace("porcentagemImposto", Double.toString(funcionario.getPorcentagemImposto()));
        expressao = expressao.replace("salarioPorHora", Double.toString(funcionario.getSalarioPorHora()));
        expressao = expressao.replace("horasTrabalhadas", Double.toString(horasTrabalhadas));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
