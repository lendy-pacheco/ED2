package TAD.Carro;
public class Carro{
    private String marca;
    private String modelo;
    private String placa;

    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void exibirDados(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Placa: " + placa;
    }


}