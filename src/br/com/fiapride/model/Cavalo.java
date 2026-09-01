package br.com.fiapride.model;

public class Cavalo {

    private String raca;
    private char sexo;
    private boolean selvagem = true; //cavalo selvagem por padrão (caso não seja definido na criação do objeto)
    private boolean cansado = false; //cavalo descansado por padrão (caso não seja definido na criação do objeto)

    public Cavalo (String raca, char sexo, boolean selvagem, boolean cansado) {
        this.setRaca(raca);
        this.setSexo(sexo);
        this.setSelvagem(selvagem);
        this.setCansado(cansado);
    }

    public String getRaca() {
        return raca; //todo: validar a entrada entre F e M, para conseguir fazer feature de cansado(a) em galopar()
    }

    private void setRaca(String raca) {
        this.raca = raca;
    }

    public char getSexo() {
        return sexo;
    }

    private void setSexo(char sexo) {
        sexo = Character.toUpperCase(sexo);

        if (sexo != 'M' && sexo != 'F') {
            System.out.println("Erro: sexo do cavalo não reconhecido.");
        }
        else {
            this.sexo = sexo;
        }
    }

    public boolean isSelvagem() {
        return selvagem;
    }

    private void setSelvagem(boolean selvagem) {
        this.selvagem = selvagem;
    }

    public boolean isCansado() {
        return cansado;
    }

    private void setCansado(boolean cansado) {
        this.cansado = cansado; //todo: mudar de false/true para int com ranges de classificação(descansado-ofegante-exausto)?
    }

    public void galopar() {
        if (!isCansado()) {
            this.cansado = true;
            System.out.println("pocotó, pocotó, pocotó... até cansar!");
        }
        else {
            System.out.println("*cof* *cof* preciso *cof* relinchar *cof* muito cansado..."); //todo: validar a entrada entre F e M, para conseguir fazer feature de cansado(a) em galopar()
        }
    }

    public void relinchar() {
        if (isCansado()) {
            this.cansado = false;
            System.out.println("*sons intensos de cavalo RELAXADO*");
        }
        else {
            System.out.println("*sons intensos de cavalo*");
        }
    }

}
