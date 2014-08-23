package prescriptions.domain.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import prescriptions.domain.entity.Alfabeta;

@Repository
public class HibernateAlfabetaRepo extends AbstractHibernateRepo implements AlfabetaRepo{

	@Autowired
	public HibernateAlfabetaRepo(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public Alfabeta getByBarras(String barras) {
		return super.findOne("from Alfabeta where barras = ?", barras);
	}

	public Alfabeta getByTroquel(String troquel) {
		return super.findOne("from Alfabeta where troquel = ?", troquel);
	}

	public List<Alfabeta> getByName(String name) {
		return super.find("from Alfabeta where nombre like '%" + name + "%'");
	}

}
