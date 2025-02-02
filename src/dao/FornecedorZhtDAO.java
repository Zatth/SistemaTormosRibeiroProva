/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FornecedorZht;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u08439411111
 */
public class FornecedorZhtDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush(); // 
        session.clear(); // ta limpando
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) { //aqui o parâmetro
       session.beginTransaction(); // comecei uma transaçao
        Criteria criteria = session.createCriteria(FornecedorZht.class); // Criteria é uma classe do hibernate para fazer consultas, to criando ela
        // basicamente um Select * from Usuarios
        criteria.add(Restrictions.eq("idclientes", id)); // o ID vem do parâmetro, essa linha é tipo um where
        ArrayList lista = (ArrayList) criteria.list(); // é um bean
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FornecedorZht.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
}
