
public class BubbleSort implements Strategy{
	
	@Override
	public void sort(TableauTest tableau) {
		int[] tab = tableau.tableau; 
		boolean noSwap = true;
		while(noSwap) {
			noSwap = false;
			for(int i=0;i<tableau.length()-1;i++) {
				if(tab[i]>tab[i+1]) {
					tableau.swap(i,i+1);
					noSwap = true;
				}
			}
		}
			
	}
}
