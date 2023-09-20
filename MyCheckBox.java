import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyCheckBox extends JFrame {
 
 private JCheckBox java, php, csharp, c;
 private JLabel linguagens = new JLabel("Linguagens selecionadas: ");
 
 public MyCheckBox(){
  super("Que Linguagens Deseja Aprender ?");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(400,100);
  setLayout( new FlowLayout() );

  //Criando os JCheckBox
  java = new JCheckBox("Java");
  php = new JCheckBox("PHP");
  csharp = new JCheckBox("C#");
  c = new JCheckBox("C");
  
  //Criando e adicionando o handler
  CheckBoxHandler tratador = new CheckBoxHandler();
  java.addItemListener(tratador);
  php.addItemListener(tratador);
  csharp.addItemListener(tratador);
  c.addItemListener(tratador);
  
  //Adicionando os JCheckBox no Layout
  add(java);
  add(php);
  add(csharp);
  add(c);
  add(linguagens);

  setVisible(true);

  System.out.println(java);
 }
 
 public class CheckBoxHandler implements ItemListener{
  private String texto = ""; 
  
  @Override
  public void itemStateChanged(ItemEvent evento) {
   texto = ""; 
   if(java.isSelected())
    texto += "Java ";
   
   if(php.isSelected())
    texto += "PHP ";
   
   if(csharp.isSelected())
    texto += "C# ";
   
   if(c.isSelected())
    texto += "C ";

   linguagens.setText("Linguagens selecionadas: "+texto);
  }
 }
}