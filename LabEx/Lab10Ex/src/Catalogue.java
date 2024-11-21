import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Catalogue {
    public ArrayList<DescriptionLivre> descriptionLivre;

    public Catalogue(){
        descriptionLivre = new ArrayList<>();
    }

    public void ajouterDescription(){
        for (int i  = 0; i < descriptionLivre.size(); i++){
            if (descriptionLivre.get(i).getPresentation().equals("")){
                String titre = descriptionLivre.get(i).getLivre().getTitre();
                @SuppressWarnings("unused")
                String nom = descriptionLivre.get(i).getLivre().getAuteurs().get(0).getNom();
                String presentation = JOptionPane.showInputDialog("Livre: " + titre);
                descriptionLivre.get(i).setPresentation(presentation);
            }
        }
    }

    public void afficerContenu(){
        for (int i = 0; i < descriptionLivre.size(); i++) {
            System.out.println(descriptionLivre.get(i));
        }
    }
}
