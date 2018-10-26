package tp6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LectureMot {
	Map<String,Integer> mottxte = new HashMap<String,Integer>();
//	String symbol = "[ ,\\s\\-:\\?.!\n]";
	String texte;
	
	public LectureMot(String texte) {
		this.texte = texte;
	}
	
	public void motParMot() {
		BufferedReader fluxEntree=null;
		try {
			fluxEntree = new BufferedReader(new FileReader(texte));
			//FileWriter fichier = new FileWriter("./ressources/texte2.txt");
			String ligneLue = fluxEntree.readLine();
			while(ligneLue!=null){
				String[] mots = ligneLue.split(" ");
				for(int i =0;i<mots.length;i++) {
				//	fichier.write(mots[i]+"\n");
					if(!mottxte.containsKey(mots[i])) {
						mottxte.put(mots[i], 1);
					}else {
					mottxte.put(mots[i], mottxte.get(mots[i]).intValue()+1);
					}
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
	
	public String[] plusPrensent() {
		int i = 0;
		int occu=0;
		String result[]=new String[5];
		while(i<5) {
			Set cles = mottxte.keySet();
			Iterator it = cles.iterator();
			while (it.hasNext()){
			   String cle = (String) it.next(); 
			   int valeur = mottxte.get(cle);
			   if(occu<Math.max(occu, mottxte.get(cle))){
				   result[i]=cle;
				   occu=Math.max(occu, mottxte.get(cle));
			   }
			
			}
			mottxte.remove(result[i]);
			i++;
			occu=0;
		}
		return result;
	}
	public static void main(String[] args) {
		LectureMot lm = new LectureMot("./ressources/texte1.txt");
		lm.motParMot();
		 String[] plusPrens=lm.plusPrensent();
		 lm = new LectureMot("./ressources/texte1.txt");
			lm.motParMot();
		for(int i =0;i<plusPrens.length;i++) {
			System.out.println(plusPrens[i]+"  "+lm.mottxte.get(plusPrens[i]));
		}
		
	}
}
