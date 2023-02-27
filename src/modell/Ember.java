
package modell;


public class Ember {
    public static final String LANY_NEM="L";
    public static final String FIU_NEM="F";
    
    private String nev;
    private int kor;
    private String nem;
    private int munkToltEv;

    public Ember(String sor, String sep) {
        String[] adat = sor.split("\\"+sep);
        String nev=adat[0];
        int kor=Integer.parseInt(adat[1]);
        String nem=adat[2];
        int munkToltEv;
        
        if (adat.length<4) {
            munkToltEv=0;
        }else{
            munkToltEv=Integer.parseInt(adat[3]);
        }
        
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.munkToltEv = munkToltEv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNem() {
        return nem;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", kor=" + kor + ", nem=" + nem + ", munkToltEv=" + munkToltEv + '}';
    }
    
    
    
}
