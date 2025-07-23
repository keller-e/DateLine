package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static String PERSISTENCE_UNIT = "dateline-PU";

    private static EntityManager manager; // gerente de entidade
    private static EntityManagerFactory factory; // fabrica de entidades

    public static EntityManager conectar() {
        if (factory == null || !factory.isOpen()) {

            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (manager == null || !manager.isOpen()) {

            manager = factory.createEntityManager();
        }
        return manager;
    }

    public static void desconctar() {
        if (manager.isOpen() && manager != null) {

            manager.close();
            factory.close();
        }
    }
}
