import javax.swing.JOptionPane;

public class TesteLivros {
    public static void main(String[] args) {

        MyCheckBox myCheckBox = new MyCheckBox();
        
        String inserirCurso;
        String nome1;
        String verificar;
        int cont = 0;
        
        while (cont != 1) {
            nome1 = JOptionPane.showInputDialog("Seu Nome: ");
            inserirCurso = JOptionPane.showInputDialog("Seu Curso: ");

            LivroNotas livroNotas = new LivroNotas();
            livroNotas.setNomeCurso(inserirCurso);

            JOptionPane.showMessageDialog(
                null,
                "Seu Nome é " + nome1 + " e o seu Curso é: " + livroNotas.getNomeCurso(),
                "Informação dos Cursos",
                JOptionPane.INFORMATION_MESSAGE
            );

            verificar = JOptionPane.showInputDialog("Quer constinuar?");
            if (
                verificar.equalsIgnoreCase("sim") || 
                verificar.equalsIgnoreCase("s")) {
                cont = 0;
            } else {
                cont = 1;
            }
        }        
    }
}
