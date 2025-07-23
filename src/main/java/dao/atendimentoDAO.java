package dao;

import model.Atendimento;
import model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import jpa.JPAUtil;

public class atendimentoDAO {

    //CADASTRO DE ATENDIMENTO NOVO
    public void cadastrarAtendimento(Atendimento atendimento) {

        EntityManager em = JPAUtil.conectar();

        try {
            em.getTransaction().begin();
            em.persist(atendimento);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;

        } finally {
            JPAUtil.desconctar();
        }
    }

    //LISTA DE ATENDIMENTOS
    public List<Atendimento> listarAtendimento() {

        EntityManager em = JPAUtil.conectar();

        //resultado será devolvido nesta lista
        List<Atendimento> atendimento = new ArrayList<Atendimento>();

        try {
            Query consulta = em.createQuery("SELECT c FROM atendimento c JOIN cliente");

            atendimento = consulta.getResultList();

        } catch (Exception e) {

            em.getTransaction().rollback();
            throw e;

        } finally {
            JPAUtil.desconctar();
        }

        return atendimento;
    }

}
