package entity;

import java.time.LocalDate;

public class Certificate {
    private int cerId;
    private String cerName;
    private LocalDate cerDate;
    private String cerRank;

    public Certificate(int cerId, String cerName, LocalDate cerDate, String cerRank) {
        this.cerId = cerId;
        this.cerName = cerName;
        this.cerDate = cerDate;
        this.cerRank = cerRank;
    }

    public int getCerId() {
        return cerId;
    }

    public void setCerId(int cerId) {
        this.cerId = cerId;
    }

    public String getCerName() {
        return cerName;
    }

    public void setCerName(String cerName) {
        this.cerName = cerName;
    }

    public LocalDate getCerDate() {
        return cerDate;
    }

    public void setCerDate(LocalDate cerDate) {
        this.cerDate = cerDate;
    }

    public String getCerRank() {
        return cerRank;
    }

    public void setCerRank(String cerRank) {
        this.cerRank = cerRank;
    }
}
