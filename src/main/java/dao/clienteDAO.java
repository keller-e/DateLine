package dao;

import model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import jpa.JPAUtil;

public class clienteDAO {

    //CADASTRO DE CLIENTE NOVO
    public void cadastrarCliente(Cliente cliente) {

        EntityManager em = JPAUtil.conectar();

        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;

        } finally {
            JPAUtil.desconctar();
        }
    }

    //LISTA DE CLIENTES
    public List<Cliente> listar() {

        EntityManager em = JPAUtil.conectar();

        //resultado será devolvido nesta lista
        List<Cliente> cliente = new ArrayList<Cliente>();

        try {
            Query consulta = em.createQuery("SELECT c FROM cliente c");

            cliente = consulta.getResultList();

        } catch (Exception e) {

            em.getTransaction().rollback();
            throw e;

        } finally {
            JPAUtil.desconctar();
        }

        return cliente;
    }

}
