package zestawviii;

import java.util.ArrayList;
import java.util.List;

public class TrasaPrzewozu {
    private String trasaPoczatek;
    private String trasaKoniec;
    private int km;
    private String kierowca;
    private List<String> towary;
    
    public String getTrasaPoczatek(){
        return trasaPoczatek;
    }
    public String getTrasaKoniec(){
        return trasaKoniec;
    }
    public String getKierowca(){
        return kierowca;
    }
    public int getKm(){
        return km;
    }   
    public List<String> getTowary(){
        return towary;
    }
    public void setTrasaPoczatek(String poczatek){
        this.trasaPoczatek=poczatek;
    }
    public void setTrasaKoniec(String koniec){
        this.trasaKoniec=koniec;
    }
    public void setKm(int km){
        this.km=km;
    }
    public void setKierowca(String kierowca){
        this.kierowca=kierowca;
    }
    public void setTowary(List<String> towary){
        this.towary=towary;
    }
    public void dodajTowar(String Towar){
        towary.add(Towar);      
    }

    public TrasaPrzewozu(String trasaPoczatek, String trasaKoniec, int km, String kierowca, List<String> towary) {
        this.trasaPoczatek = trasaPoczatek;
        this.trasaKoniec = trasaKoniec;
        this.km = km;
        this.kierowca = kierowca;
        this.towary = towary;
    }
    public TrasaPrzewozu(String trasaPoczatek, String trasaKoniec, int km, String kierowca) {
        this.trasaPoczatek = trasaPoczatek;
        this.trasaKoniec = trasaKoniec;
        this.km = km;
        this.kierowca = kierowca;
        this.towary=new ArrayList<>();
    }
    
    
    
}
