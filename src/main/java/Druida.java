public class Druida {
    IMetamorfose metamorfose;
    MetamorfoseAdapter persistencia;

    public Druida(){
        metamorfose = new DruidaForma();
        persistencia = new MetamorfoseAdapter(metamorfose);
    }

    public void setMetamorfose(String forma){
        metamorfose.setMetamorfose(forma);
        persistencia.manterMetamorfose();
    }

    public String getMetamorfose(){
        return persistencia.usarMetamorfose();
    }

    public String getSituacao(){
        return persistencia.getSituacao();
    }
}
