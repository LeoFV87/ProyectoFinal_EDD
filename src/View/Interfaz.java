package View;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.*;
import Controller.Controlador;

public class Interfaz  extends Frame implements ActionListener {

    public Button btnBFS;
    public Button btnDFS;
    public Button btnA;
    public Button btnRESETEAR;
    public Controlador controlador;

    public Interfaz (){

    controlador= new Controlador();
    
    setTitle("Laberinto Resoluciones");
    setSize(500,500);

    Panel pnl= new Panel();

    btnBFS= new Button("Realizar con BFS");    
    btnDFS= new Button("Realizar con DFS");
    btnA= new Button("Realizar con A*");
    btnRESETEAR= new Button("RESETEAR");



     addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
               
            e.getWindow().dispose();
        }
     });


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando= e.getActionCommand();

       if(comando.equals("Realizar con BFS")){
        //COMANDO PARA PONER EL METODO QUE TIENE EL CONTROLADOR

        //controlador.toggleCelda();
          controlador.modelo.metodoA();

       } else if(comando.equals("Realizar con DFS")){

       } else if(comando.equals("Realizar con A*")){

       } else if(comando.equals("RESETEAR")){

       }


    }














    
}
