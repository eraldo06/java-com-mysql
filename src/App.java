import DAO.DAO;
import entity.Usuario;
//

public class App {
    public static void main(String[] args) throws Exception {

        // criando usuario
        Usuario u = new Usuario();
        u.setNome("eraldo");
        u.setLogin("eraldo01");
        u.setSenha("1234");
        u.setEmail("eraldo@@");

        new DAO().cadastrarUsuario(u);
    }
}
