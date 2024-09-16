package br.com.financeira;

public class PrevisaoFaturamento {
    public static void main(String[] args) {
        // Dados iniciais
        double faturamentoAtual = 1000000.00; // Exemplo: faturamento em setembro de 2024
        double taxaCrescimentoMensal = 0.02; // Exemplo: crescimento de 2% ao mês

        // Número de meses até dezembro de 2024
        int mesesRestantes = 3;

        // Calcula a previsão de faturamento para dezembro de 2024
        double faturamentoPrevisto = calcularFaturamento(faturamentoAtual, taxaCrescimentoMensal, mesesRestantes);

        // Exibe o resultado
        System.out.printf("Previsão de faturamento para dezembro de 2024: R$ %.2f%n", faturamentoPrevisto);
    }

    /**
     * Calcula o faturamento previsto com base no crescimento percentual mensal.
     * @param faturamentoAtual Faturamento atual
     * @param taxaCrescimentoMensal Taxa de crescimento mensal (como fração, ex: 0.02 para 2%)
     * @param mesesRestantes Número de meses até a previsão
     * @return Faturamento previsto
     */
    public static double calcularFaturamento(double faturamentoAtual, double taxaCrescimentoMensal, int mesesRestantes) {
        double faturamentoPrevisto = faturamentoAtual;
        for (int i = 0; i < mesesRestantes; i++) {
            faturamentoPrevisto += faturamentoPrevisto * taxaCrescimentoMensal;
        }
        return faturamentoPrevisto;
    }
}
