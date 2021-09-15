public class MetamorfoseAdapter extends DruidaSituacao {

    private IMetamorfose metamorfoseForma;

    public MetamorfoseAdapter(IMetamorfose metamorfoseForma){
        this.metamorfoseForma = metamorfoseForma;
    }

    public String usarMetamorfose(){
        if (this.getSituacao() == "Viajar pelo céu"){
            metamorfoseForma.setMetamorfose("Coruja");
        }else if(this.getSituacao() == "Viajar pelo chão"){
            metamorfoseForma.setMetamorfose("Cervo");
        }else if(this.getSituacao() == "Bater em inimigos"){
            metamorfoseForma.setMetamorfose("Gato");
        }else if(this.getSituacao() == "Tankar inimigos"){
            metamorfoseForma.setMetamorfose("Urso");
        }else if(this.getSituacao() == "Curar aliados"){
            metamorfoseForma.setMetamorfose("Arvore");
        }else{
            metamorfoseForma.setMetamorfose("Fica normal");
        }
        return metamorfoseForma.getMetamorfose();
    }

    public void manterMetamorfose(){
        if (metamorfoseForma.getMetamorfose().equals("Coruja")){
            this.setSituacao("Viajar pelo céu");
        }else if(metamorfoseForma.getMetamorfose().equals("Cervo")){
            this.setSituacao("Viajar pelo chão");
        }else if(metamorfoseForma.getMetamorfose().equals("Gato")){
            this.setSituacao("Bater em inimigos");
        }else if(metamorfoseForma.getMetamorfose().equals("Urso")){
            this.setSituacao("Tankar inimigos");
        }else if(metamorfoseForma.getMetamorfose().equals("Arvore")){
            this.setSituacao("Curar aliados");
        }else{
            this.setSituacao("Sem necessidade");
        }

    }
}
