package fr.formation.inti.dao;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import fr.formation.inti.model.User2;

@Service
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User2, Integer> implements UserDao {

	public User2 findbylog(String Email, String Password) {
		String hql = "from User2 where Email = :email and Password= :password";
		@SuppressWarnings("rawtypes")
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("email", Email);
		query.setParameter("password", Password);
		User2 User2 = (User2) query.uniqueResult();
		return User2;
	}

	public User2 findbyemail(String Email) {
		String hql = "from User2 where Email = :email";
		@SuppressWarnings("rawtypes")
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("email", Email);
		User2 User2 = (User2) query.uniqueResult();
		return User2;
	}

	public Integer save2(User2 user) {
		getSessionFactory().getCurrentSession().saveOrUpdate(user);
		return user.getIduser();
	}

//	public List<String> getRoles(String email) {
//		System.out.println("Début");
//		String hql = "from Roles where Email = :email";
//		System.out.println("Je suis 2");
//		Query<Roles> query = getSessionFactory().getCurrentSession().createQuery(hql);
//		System.out.println("Je suis 3");
//		query.setParameter("email", email);
//		System.out.println("Je suis 4");
//		List<Roles> roles = (List<Roles>) query.getResultList();
//		System.out.println("roles : " + roles);
//		List<String> list = new ArrayList<>();
//		for (Roles ur : roles) {
//			System.out.println(ur);
//			list.add(ur.getRole_user());
//		}
//		return list;
//	}

}
