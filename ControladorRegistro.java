public class controladorRegistro {
    public boolean registrarUsuario(Usuario usuario) {
        // Validar datos de entrada (nombre, email, contraseña no vacíos)
        if (usuario.getNombre().isEmpty() || usuario.getCorreoElectronico().isEmpty() || usuario.getContraseña().isEmpty()) {
            System.err.println("Error: Algunos campos están vacíos.");
            return false;
        }

        // Simular almacenamiento en base de datos (archivo "usuarios.txt")
        try (FileWriter writer = new FileWriter("usuarios.txt", true)) {
            writer.write(usuario.getNombre() + "," + usuario.getCorreoElectronico() + "," + usuario.getContraseña() + "\n");
            System.out.println("Usuario registrado con éxito!");
            return true;
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            return false;
        }
    }
}
