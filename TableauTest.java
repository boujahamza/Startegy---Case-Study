public class TableauTest {
	int[] tableau;
	
	public TableauTest(int[] tableau) {
		this.tableau = tableau;
	}
	
	public int length() {
		return tableau.length;
	}
	
	public void swap(int index1, int index2) {
		int x;
		x = tableau[index1];
		tableau[index1] = tableau[index2];
		tableau[index2] = x;
	}
}
