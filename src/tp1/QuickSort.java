package tp1;

public class QuickSort {
		
	//RETOURNE UN INDICE
	public static int partition(int[] tab,int deb,int fin,int pivot) {
		int d = deb+1;
		int f = fin;
		int[] tabo = tab;
		while (d < f) {
	        while(d < f && tab[f] >= pivot) {
	        	f--;
	        }
	        while(d < f && tab[d] <= pivot) {
	        	d++;
	        }
	        swap(tabo,d,f);
	    }
	    if (tab[d] > pivot) d--;
	    tab[deb] = tab[d];
	    tab[d] = pivot;
	    return d;
		
	}

	public static void quikSort(int [] tab,int deb,int fin) {
		if(deb<fin) {
			int valpiv = partition(tab,deb,fin,tab[deb]);
			quikSort(tab, deb, valpiv-1);
			quikSort(tab, valpiv+1, fin);
		}
	}
	
	public static void swap(int [] tab, int idx, int idx2){
    	int save;
    	save = tab[idx];
    	tab[idx] = tab[idx2];
    	tab[idx2] = save;
    	
    }
	
	
	public static void affiche(int [] tab) {
		for(int i = 0;i<tab.length;i++) {
			System.out.print(" - "+tab[i] );
		}
	}
	
	public static void main(String[] args) {
		int[] unSorted = new int[]{22,11,8,17,47,98,25,34,69,52};
		affiche(unSorted);
		quikSort(unSorted,0,9);
		System.out.println();
		affiche(unSorted);
		
	}
	
	
}
