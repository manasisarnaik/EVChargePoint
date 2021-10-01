package hibernate;

import java.util.*;

import javax.persistence.*;

@Entity(name="brands")
@Table(name="brands")
public class Brands 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, unique=true)
	private String name;
	
	@ManyToMany(mappedBy="brands")
	private List<Dealers> dealers;

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Dealers> getDealers() 
	{
		return dealers;
	}

		
	public void addDealers(Dealers dealer) 
	{
		if(dealers==null)
		{
			dealers = new ArrayList();
		}
		this.dealers.add(dealer);
	}

	public int getId() {
		return id;
	}
	
	
	public BrandsP toPOJO()
	{
		BrandsP b = new BrandsP();
		b.setId(id);
		b.setName(name);
		List<DealersP> dp = new ArrayList();
		for(Dealers dealer:dealers)
		{
			dp.add(dealer.toPOJO());
		}
		b.setDealers(dp);
		return b;
	}
}

/*
 * 1	tata	
 * 
 * 
 * 1	1
 * 1	3
 * 1	4
 */