public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private double porcentagemBonificacao;
    private double porcentagemImposto;

    public Funcionario(String nome, double salarioPorHora, double porcentagemBonificacao, double porcentagemImposto) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.porcentagemBonificacao = porcentagemBonificacao;
        this.porcentagemImposto = porcentagemImposto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double getPorcentagemBonificacao() {
        return porcentagemBonificacao;
    }

    public double getPorcentagemImposto() {
        return porcentagemImposto;
    }

    public double calcularSalario(double horasTrabalhadas) {
        return CalculoSalario.calcular(this, horasTrabalhadas);
    }
}
