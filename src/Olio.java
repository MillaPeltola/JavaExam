public class Olio {
    int id;
    String kysymys;
    String v1;
    String v2;
    String v3;
    String v4;
    String vastaus;

    public Olio(int id, String kysymys, String v1, String v2, String v3, String v4, String v41, String vastaus) {
        this.id = id;
        this.kysymys = kysymys;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v4 = v41;
        this.vastaus = vastaus;
    }

    public Olio(int id, String kysymys, String v1, String v2, String v3, String v4, String v41) {
        this.id = id;
        this.kysymys = kysymys;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v4 = v41;}

    public Olio (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    public String getV4() {
        return v4;
    }

    public void setV4(String v4) {
        this.v4 = v4;
    }

    public String getVastaus() {
        return vastaus;
    }

    public void setVastaus(String vastaus) {
        this.vastaus = vastaus;
    }

    @Override
    public String toString() {
        return  kysymys + '\n' + '\n' +
                v1 + '\n' +
                v2 + '\n' +
                v3 + '\n' +
                v4 + '\n' + '\n' + "Answer: " + '\n';
    }
}
