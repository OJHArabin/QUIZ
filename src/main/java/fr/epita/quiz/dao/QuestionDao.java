package fr.epita.quiz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.epita.quiz.entity.Question;
import fr.epita.quiz.entity.Register;


	@Repository
	public class QuestionDao
	{
		@Autowired
		SessionFactory sessionFactory;
		
		@Transactional
		public void saveQuestion(Question q) 
		{
			Session session = sessionFactory.getCurrentSession();
			session.save(q);
		}

		@Transactional
		public List<Question> getQuestions() {
			
			Session session = sessionFactory.getCurrentSession();
			// not sql... it is Hql
			org.hibernate.query.Query<Question> q= session.createQuery("from Question", Question.class);
			List<Question> questions = q.list();
			
				
			return questions;
		}

		@Transactional
		public List<Question> getTestQuestions() {
			
			Session session = sessionFactory.getCurrentSession();
			NativeQuery<Question> query = session.createNativeQuery("select * from question order by rand() limit 5",Question.class);
			List<Question> questions = query.list();
			return questions;
			}
		
		@Transactional
		public void saveUser(Register r) {
			Session session = sessionFactory.getCurrentSession();
			session.save(r);
			}


		
		
}
