package services;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import hibernate.Documents;
import hibernate.Users;

public class DBDocuments {
	public boolean createDocument(Session s, Documents document, Users user)
	{
		try
		{
			Transaction t = s.beginTransaction();
			document.setUser(user);
			s.save(document);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Documents readDocumentById(Session s, int id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from documents as a where a.id=:c");
			query.setParameter("c", id);
			List<Documents> list = query.list();
			t.commit();
			for(Documents p:list)
			{
				return p;
			}
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Documents> readDocumentByUserId(Session s, int user_id)
	{
		try
		{
			Transaction t = s.beginTransaction();
			Query query=s.createQuery("from documents as a where a.user.id=:c");
			query.setParameter("c", user_id);
			List<Documents> list = query.list();
			t.commit();
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
