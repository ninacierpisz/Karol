import javakarol.*;

/** 
 * Hinweis: Einige Methoden der Klasse Roboter wurden wegen der besseren Übersicht versteckt. 
 * Sie sind aber noch vorhanden und über die Codeergänzung sichtbar.
 * Dazu einfach die Codeergänzung (Strg+Leertaste) verwenden.
 */

public class Robot extends Roboter {
    public Robot()
    {        
        super(1, 1, 'S', new Welt(12,12,10));
        this.VerzoegerungSetzen(10);
    }

    void Umdrehen(){
        LinksDrehen();
        LinksDrehen();
    }

    void Zurueck() {
        Umdrehen();
        Schritt();
        Umdrehen();
    }

    void SchrittLinks (){
        LinksDrehen();
        Schritt();
        RechtsDrehen();
    }
    void Hinlegen(int Anzahl){
        
        for(int i=0;i<Anzahl;i++){
            Hinlegen();
        }
    }
    void SchrittRechts (){
        RechtsDrehen();
        Schritt();
        LinksDrehen();
    }
    //******* Hier eigene Methoden ergänzen *******

    //Der Roboter legt eine 7ener Reihe
    void Aufgabe2a(){
        for(int i=0;i<7;i++){
            Schritt();
        }
        for(int i=0;i<7;i++){
            Zurueck();
            Hinlegen();
        }

    }

    //Der Roboter legt ein 7x7 Feld 
    void Aufgabe2b(){
       for(int k=0;k<7;k++){ 
        Aufgabe2a();
        SchrittLinks(); 
        }
    }
    
    //Der Roboter legt einen 7x7x7 Quader 
    void Aufgabe2c(){
       for(int i=0;i<7;i++){
            Schritt();
        }
        Umdrehen();
        
       for(int n=0;n<7;n++){
        for(int m=0;m<4;m++){
           for(int i=0;i<6;i++){
            Hinlegen();
            Schritt();
            }
            RechtsDrehen();
        }
      }
        for(int a=0;a<5;a++){
           SchrittRechts();
           for(int x=0;x<7;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittRechts();
        for(int a=0;a<5;a++){
           SchrittLinks();
           for(int x=0;x<7;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittLinks();
        for(int a=0;a<5;a++){
           SchrittRechts();
           for(int x=0;x<7;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittRechts();
        for(int a=0;a<5;a++){
           SchrittLinks();
           for(int x=0;x<7;x++){
              Hinlegen();
           }
        }
      Schritt();
      SchrittLinks();
        for(int a=0;a<5;a++){
           SchrittRechts();
           for(int x=0;x<7;x++){
               Hinlegen();
           }
        }
      
      Schritt();
      Schritt();
      SchrittRechts();
      RechtsDrehen();
      
      Hinlegen(6);
      Schritt();
      Hinlegen(5);
      for(int e=0;e<5;e++){
         Schritt();
         Umdrehen();
         Aufheben();
         Aufheben();
      }
      Schritt();
      Umdrehen();
      Aufheben();
      LinksDrehen();
      Schritt();
      Umdrehen();
      
    }
      
    

    

    

    //Der Roboter legt einen 7x7x7 Quader 
    void Aufgabe2d(){

    }

    //Aufgabe 2f)
    void QuaderLegen(int l, int b, int h){

    }
}
