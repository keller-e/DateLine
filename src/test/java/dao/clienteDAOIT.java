package dao;

import java.util.List;
import model.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class clienteDAOIT {

    @Mock
    private clienteDAO clienteDao;

    public clienteDAOIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCadastrarCliente() {
        System.out.println("Cadastrar Cliente");
        Cliente clienteTeste = new Cliente(10, "Nome Teste", "11/11/1111", "teste", "09343092380", "Rua teste", "51 12345678", "email@hotmial.com", "Nenhuma", "Nenhuma", "Nenhuma", "Nenhuma", "Nenhuma");

        //Cadastrar o cliente
        clienteDao.cadastrarCliente(clienteTeste);

        //Listar
        List<Cliente> clientes = clienteDao.listar();

        assertNotNull("A lista de clientes não pode ser nula", clientes);
        assertFalse("A lista de clientes não pode estar vazia após inserção", clientes.isEmpty());

        //Procurar o cliente na lista
        Cliente encontrado = clientes.stream()
                .filter(c -> c.getId() == 10)
                .findFirst()
                .orElse(null);

        assertNotNull("O cliente cadastrado deveria estar presente na lista", encontrado);
        assertEquals("Nome Teste", encontrado.getNome());
        assertEquals("09343092380", encontrado.getCpf());
    }

}
