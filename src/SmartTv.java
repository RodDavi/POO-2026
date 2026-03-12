public class SmartTv{
    private String marca,modelo;
    private int volume;
    private boolean internet;

    public SmartTv(String marca, String modelo, int volume, boolean internet){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = internet;
    }

    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        } else {
            System.out.println("Volume inválido");
        }
    }

    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        if (marca.length() <= 30){
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        if (Character.isUpperCase(modelo.charAt(0))){
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido");
        }
    }

    public String getModelo(){
        return this.modelo;
    }

    public void aumentarVolume(int x){
        this.setVolume(this.volume + x);
    }

    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

    public void abrirYouTube(){
        // conecta Internet
    }

    private boolean conectaInternet(){
        System.out.println("Veruficando conexões disponíveis");
        System.out.println("Consultando as credenciais");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5){
            System.out.println("IP gerado com sucesso");
            return true;
        }
        else {
            System.out.println("Falha na conexão");
            return false;
        }
    }
}