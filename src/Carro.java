import java.util.Calendar;

public class Carro extends Veiculo{
    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    

    public Carro(String nomeCondutor, String marca, String modelo, String matricula, String cor, Calendar data, int numPortas) {
        super(nomeCondutor, marca, modelo, matricula, cor, data);
        this.numPortas = numPortas;
    }
    @Override
    public String toString() {
        return super.toString()+" com um numero de portas "+getNumPortas();
    }
}
