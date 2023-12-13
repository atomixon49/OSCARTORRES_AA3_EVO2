public class main {

    public static void main(String[] args) {
        ControladorRegistro controlador = new ControladorRegistro();

        // Crear un nuevo usuario con datos de ejemplo
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan Pérez");
        usuario.setCorreoElectronico("juanperez@ejemplo.com");
        usuario.setContraseña("contraseña123");

        // Registrar el usuario
        if (controlador.registrarUsuario(usuario)) {
            System.out.println("Usuario creado y registrado con éxito!");
        } else {
            System.out.println("Error al registrar el usuario.");
        }
    }
}
