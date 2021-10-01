package hibernate;

import java.util.List;

public class BrandsP 
{
	private int id;
	
	private String name;
	
	private List<DealersP> dealers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DealersP> getDealers() {
		return dealers;
	}

	public void setDealers(List<DealersP> dealers) {
		this.dealers = dealers;
	}
	
	
}
