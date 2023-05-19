import java.util.Calendar;

public class Moto extends Veiculo {

    public Moto(String nomeCondutor, String marca, String modelo, String matricula, String cor, Calendar data) {
        super(nomeCondutor, marca, modelo, matricula, cor, data);
    }

    @Override
    public String toString() {
        return super.toString()+" E e uma moto";
    }
}
