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
    void Schritt(int Länge){
        for(int i=0;i<Länge;i++){
            Schritt();
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
        
        int num = 4;
       for(int k=0;k<num;k++){
            Schritt();
        }
        Umdrehen();
        
        //chinesische mauer
       for(int n=0;n<num;n++){
        for(int m=0;m<4;m++){
           for(int i=0;i<num-1;i++){
            Hinlegen();
            Schritt();
            }
            RechtsDrehen();
        }
      }
        for(int a=0;a<num-2;a++){
           SchrittRechts();
           for(int x=0;x<num;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittRechts();
        for(int a=0;a<num-2;a++){
           SchrittLinks();
           for(int x=0;x<num;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittLinks();
        for(int a=0;a<num-2;a++){
           SchrittRechts();
           for(int x=0;x<num;x++){
               Hinlegen();
           }
        }
      Schritt();
      SchrittRechts();
        for(int a=0;a<num-2;a++){
           SchrittLinks();
           for(int x=0;x<num;x++){
              Hinlegen();
           }
        }
      Schritt();
      SchrittLinks();
        for(int a=0;a<num-2;a++){
           SchrittRechts();
           for(int x=0;x<num;x++){
               Hinlegen();
           }
        }
      
      Schritt();
      Schritt();
      SchrittRechts();
      RechtsDrehen();
      
      Hinlegen(num-1);
      Schritt();
      Hinlegen(num-2);
      for(int e=0;e<num-2;e++){
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
       if (b==1){
           GeheZuBauposition(b);
           Zurueck();
           Hinlegen();
           Schritt();
           RechtsDrehen();
           for (int m=0;m<h;m++){
              BesondrerReihe(l);
              Umdrehen();
              Schritt();
              Umdrehen();
              Hinlegen();
              Schritt();
              Umdrehen();
           }
           Schritt();
           Umdrehen();
           Aufheben();
           GeheZuStartposition();
           return;
       }
        for (int n=0;n<h;n++){
           GeheZuBauposition(b);
           Reihe(b-1);
           Reihe(l-1);
           Reihe(b-1);
           Reihe(l-1);
           GeheZuPosition(l, b, h);
           Füllung(l, b, h);
           GeheZuStartposition();
       }
    }
    void BesondrerReihe(int l){
        for ( int n=0;n<l-1;n++){
        Hinlegen();
        Schritt();
       }
    }
    void Reihe(int s){
        for (int i=0;i<s;i++){
            Hinlegen();
            Schritt();
        }
        RechtsDrehen();
    }
    void GeheZuPosition(int l,int b,int h){
        RechtsDrehen();
        Schritt(l-2);
        LinksDrehen();
    }
    void Füllung(int l, int b, int h){
        for(int n=0;n<b-2;n++){
            for(int i=0;i<l-2;i++){
               Hinlegen();
               SchrittLinks();
            }
            GeheZuPosition(l, b, h);
            Schritt();
       }
    }
    
    //HimmelsRichtungen
    void Sueden(){
        if (IstBlickSueden()){
            return;
        }
        if (IstBlickNorden()){
            Umdrehen();
        }
        if (IstBlickWesten()){
            LinksDrehen();
        }
        if (IstBlickOsten()){
            RechtsDrehen();
        }
    }  
    void Osten(){
        if (IstBlickOsten()){
            return;
        }
        if (IstBlickWesten()){
            Umdrehen();
        }
        if (IstBlickNorden()){
            RechtsDrehen();
        }
        if (IstBlickSueden()){
            LinksDrehen();
        }
    }
    void Westen(){
        if (IstBlickWesten()){
            return;
        }
        if (IstBlickOsten()){
            Umdrehen();
        }
        if (IstBlickSueden()){
            RechtsDrehen();
        }
        if (IstBlickNorden()){
            LinksDrehen();
        }
     }
    void Norden(){
        if (IstBlickNorden()){
            return;
        }
        if (IstBlickSueden()){
            Umdrehen();
        }
        if (IstBlickOsten()){
            LinksDrehen();
        }
        if (IstBlickWesten()){
            RechtsDrehen();
        }
    }
    void GeheZuStartposition(){
        Westen();
        while (! IstWand()){
            Schritt();
        }
        
        Norden();
        while (! IstWand()){
            Schritt();
        }
       
        Sueden();
    }
    void GeheZuBauposition(int Länge){
        Schritt(Länge-1);
        Umdrehen();
        MarkeSetzen();
    }
       void Mauer(int Länge){
       if (Länge==1){
            Umdrehen();
            Schritt();
            Umdrehen();
            Hinlegen();
            return;
        }
       //for (int m=0;m<Länge/2;m++){
             for (int n=0;n<4;n++){
                 for(int i=0;i<Länge-1;i++){
                    
                    Hinlegen();
                    Schritt();
                 }
            RechtsDrehen();
           }
           //SchrittRechts();
           //Schritt();
       //}
    }
    void Aufgabe2c1(){
        int Länge=8;
        int Höhe=4;
        //GeheZuStartposition();
        GeheZuBauposition(Länge);
        
        // Mauer(Länge);
        // SchrittRechts();
        // Schritt();
        // Mauer(Länge-2);
        // SchrittRechts();
        // Schritt();
        // Mauer(Länge-4);
        
        for (int h=0; h<Höhe; h++) {
        
           for (int i=0;i<Länge/2+1;i++){
               Mauer(Länge-i*2);
               SchrittRechts();
               Schritt();
           }
           GeheZuStartposition();
           GeheZuBauposition(Länge);
        }
    
    }
}