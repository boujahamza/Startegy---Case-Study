
public class QuickSort implements Strategy{
	
	private void mergeSort(TableauTest tableau, int l,int r) {
		
		if(l<r){
			int indexPivot = r;
			int i = l;
			while(i<=indexPivot) {
				if(tableau.tableau[indexPivot]<tableau.tableau[i] && i<indexPivot) {
					for(int j = i;j<indexPivot;j++) {
						tableau.swap(j, j+1);
					}
					indexPivot--;
					continue;
				}
				i++;
			}
			mergeSort(tableau,l,indexPivot-1);
			mergeSort(tableau,indexPivot+1,r);
		}
	}
	
	@Override
	public void sort(TableauTest tableau) {
		mergeSort(tableau,0,tableau.length()-1);
	}
	
}
