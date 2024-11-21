public class DescriptionLivre {
    private String presentation;
    private Livre livre;

    public DescriptionLivre(Livre livre, String presentation){
        this.presentation = presentation;
        this.livre = livre;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public String toString(){
        return "Description for book" + livre + " is " + presentation;
    }
}
