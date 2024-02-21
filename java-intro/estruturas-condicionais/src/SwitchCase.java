public class SwitchCase {

    float calcSalarioCargo(String cargo, float salarioBase) {
        switch (cargo) {
            case "gerente":
                return salarioBase * 1.5f;
            case "analista":
                return salarioBase * 1.15f;
            default:
                return salarioBase;
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        SwitchCase calculadora = new SwitchCase();
        float salarioGerente = calculadora.calcSalarioCargo("gerente", 5000);
        float salarioAnalista = calculadora.calcSalarioCargo("analista", 5000);

        System.out.println("Salário do Gerente: " + salarioGerente);
        System.out.println("Salário do Analista: " + salarioAnalista);
    }
}
