
public class Context {
	private final Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void arrange(TableauTest input) {
		strategy.sort(input);
		for(int i=0;i<input.length();i++) {
			System.out.print(input.tableau[i]+ " ");
		}
	}
}
