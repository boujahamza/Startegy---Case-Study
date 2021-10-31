
public class InsertSort implements Strategy{

	@Override
	public void sort(TableauTest tableau) {
		int[] tab = tableau.tableau;
		for(int i=0;i<tableau.length()-1;i++) {
			if(tab[i]>tab[i+1]) {
				for(int j=i+1;j>0;j--) {
					if(tab[j-1]>tab[j]) {
						tableau.swap(j-1,j);
					}
				}
			}
		}
	}

}
