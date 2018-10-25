package tp6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LectureMot {
	Map<String,Integer> mots = new HashMap<>();
	String symbol = "[,\\s\\-:\\?.!]";
	String texte;
	
	public LectureMot(String texte) {
		this.texte = texte;
	}
	
	public void motParMot() {
		BufferedReader fluxEntree=null;
		try {
			fluxEntree = new BufferedReader(new FileReader(texte));
			String ligneLue = fluxEntree.readLine();
			while(ligneLue!=null){
				String[] mots = ligneLue.split(symbol);
				for(int i =0;i<mots.length;i++) {
					System.out.println(mots[i]+"  "+i);	
				}
				ligneLue = fluxEntree.readLine();
			}
		}
		catch(IOException exc){
			exc.printStackTrace();
		}
		finally{
			try{
				if(fluxEntree!=null){
					/* Fermeture du flux vers le fichier */
					fluxEntree.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		LectureMot lm = new LectureMot("./ressources/texte1.txt");
		lm.motParMot();
	}
}
