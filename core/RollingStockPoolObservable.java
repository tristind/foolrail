package core;

public interface RollingStockPoolObservable
{
	public void attach(RollingStockPoolObserver observer);

	public void detach(RollingStockPoolObserver observer);
}
