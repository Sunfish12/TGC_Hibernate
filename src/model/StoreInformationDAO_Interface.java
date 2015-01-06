package model;

import java.util.List;

public interface StoreInformationDAO_Interface {
	public abstract StoreInformation findByPrimeKey(Integer storeId);

	public abstract List<StoreInformation> getAll();

	public abstract void insert(StoreInformation bean);

	public abstract void update(StoreInformation bean);

	public abstract void delete(Integer storeId);
}
