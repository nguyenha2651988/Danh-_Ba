public class NguoiDung {
    private String ten;
    private String diaChi;
    private String sdt;

    public NguoiDung() {
    }

    public NguoiDung(String ten, String diaChi, String sdt) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
