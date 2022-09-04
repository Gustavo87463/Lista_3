public class ConversorMoeda {
    
    
        private double dolar;
        private double quantidade;
    
        public ConversorMoeda(double dolar, double quantidade) {
            this.dolar = dolar;
            this.quantidade = quantidade;
        }
    
    
        public void Imposto(double dolar, double quantidade){ 
    
            double total = (dolar*quantidade)*6/100;
            double total2 = (dolar*quantidade)+total;
            System.out.println("Funcionário: Valor a ser pago em reais = " + total2);
        }
}

