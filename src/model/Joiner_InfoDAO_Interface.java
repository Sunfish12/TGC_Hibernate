package model;

import java.util.List;

public interface Joiner_InfoDAO_Interface {
	public abstract Joiner_Info findByPrimeKey(String groupSerialNumber);

	public abstract List<Joiner_Info> getAll();

	public abstract void insert(Joiner_Info bean);

	public abstract void update(Joiner_Info bean);

	public abstract void delete(Integer joiner_InfoSerialNumber);
}
