package tp1;

import java.util.Random;

public class Sort {
	static boolean nonTrie;
	public static Compteur comptor = new Compteur();
	
	public static int [] generateRdmIntArray(int n, int min, int max){
			int[] tab = new int[n];
			Random rand = new Random();
			for ( int i = 0; i < n; i++) {
				tab[i] = rand.nextInt(max-min)+min;
			}
			return tab;
	    }
	 
	 public static int minimum(int[] tab,int beg,int end){
			int mini = beg;
			for(int i = beg+1;i<end;i++) {
				if(tab[mini]>tab[i]) {
					mini = i;
				}
				comptor.incComp();
			}
			return mini;
		}
	 
	 	public static void sort(int[] tab, int val) {
	 		for(int i = val ; i > 0 ; i--){	
	 			comptor.incComp();
	 			if(tab[i] < tab[i-1]){
	 				swap(tab,i,i-1);
	 			}
	 		}
	 	}

	    public static void insertSort(int [] tab) {
	    	for (int i = 1; i < tab.length; i++) {
				 sort(tab, i);
			 }
	    	System.out.println("INSERT : "+comptor.toString());
	    	 comptor.reset();
	    }

	    public static void selectSort(int [] tab){
	    	for(int i =0;i<tab.length-1;i++) {
	    		
				swap(tab,i,minimum(tab,i,tab.length));	
			}
	    	System.out.println("SELECT : "+comptor.toString());
	    	 comptor.reset();
	    }

	    public static void printArray(int [] tab){
	    	for ( int cpt =0; cpt<tab.length; cpt++) {
	    		System.out.println(tab[cpt]);
	    	}
	    }

	    public static void swap(int [] tab, int idx, int idx2){
	    	int save;
	    	save = tab[idx];
	    	tab[idx] = tab[idx2];
	    	tab[idx2] = save;
	    	comptor.incPerm();
	    }

	    public static void bubbleSort(int [] tab){
	    	 int fin = tab.length - 1;
			 for (int i=fin ;i >= 1;i--) {
				    for (int j=1;j <= i;j++) { 
				    	if (tab[j-1] > tab[j] ){ swap(tab,j-1,j);}
				    	comptor.incComp();
				    }
			 }
			 System.out.println("BUBBLE : "+comptor.toString());
			 comptor.reset();
	    }

}
