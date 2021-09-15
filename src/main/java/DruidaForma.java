public class DruidaForma implements IMetamorfose{
    private String forma;

    @Override
    public String getMetamorfose(){
        return this.forma;
    }

    @Override
    public void setMetamorfose(String forma){
        this.forma = forma;
    }
}
