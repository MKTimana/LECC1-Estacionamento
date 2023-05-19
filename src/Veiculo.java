import java.util.Calendar;
import java.util.Date;

abstract class Veiculo {
    private String nomeCondutor, marca, modelo,matricula,cor;
    private Calendar data;

    public Veiculo(String nomeCondutor, String marca, String modelo, String matricula, String cor, Calendar data) {
        this.nomeCondutor = nomeCondutor;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cor = cor;
        this.data = data;
    }

    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Veiculo da marca "+getMarca()+" do modelo "+getModelo()+" lançado no ano de "+data.get(Calendar.DAY_OF_MONTH)+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR)+" com uma cor "+getCor()+" e tem como condutor o "+getNomeCondutor();
    }
}
