
public class MergeSort implements Strategy{
	
	private void merge(TableauTest tableau,int l,int m,int r) {
		int n1 = m-l+1;//Capacité du tableau gauche
		int n2 = r-m;//Capacité du tableau droit
		
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0;i<m-l+1;i++) {
			L[i] = tableau.tableau[l+i];
		}
		for(int i = 0;i<r-m;i++) {
			R[i] = tableau.tableau[m+1+i];
		}
		
		int indexL = 0,indexR = 0;
		for(int i = l;i<=r;i++) {
			if(indexL == n1) {
				System.out.println("indexR:"+indexR);
				indexR++;
			}else if(indexR == n2){
				tableau.tableau[i] = L[indexL];
				indexL++;
			}else{
				if(L[indexL]<R[indexR]) {
					tableau.tableau[i] = L[indexL];
					indexL++;
				}else {
					tableau.tableau[i] = R[indexR]; 
					indexR++;
				}
			}
		}
	}
	
	private void mergeSort(TableauTest tableau,int l,int r) {
		if(l<r){
			int m = (l+r)/2;
		
			mergeSort(tableau, l,m);
			mergeSort(tableau, m+1,r);
		
			merge(tableau,l,m,r);
		}
	}
	
	@Override
	public void sort(TableauTest tableau) {
		mergeSort(tableau,0,tableau.length()-1);
	}

}
