package com.devspring.SpringBootWeb1;

public class Alien {
    private int aid;
    private String aname;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alien{");
        sb.append("aid=").append(aid);
        sb.append(", aname=").append(aname);
        sb.append('}');
        return sb.toString();
    }
    
}
