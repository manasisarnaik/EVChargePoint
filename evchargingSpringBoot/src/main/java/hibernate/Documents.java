package hibernate;

import javax.persistence.*;

@Entity(name="documents")
@Table(name="documents")
public class Documents 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String type;
	
	@Column(unique=true)
	private String filepath;
	
	@ManyToOne
	private Users user;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	
	public DocumentsP toPOJO()
	{
		DocumentsP d = new DocumentsP();
		d.setFilepath(filepath);
		d.setId(id);
		d.setType(type);
		return d;
	}
	
}
