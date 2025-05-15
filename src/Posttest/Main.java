package week09.Posttest;

class SuratMengemudi {
    String nomorLisensi;
    String tanggalBerlaku;

    public SuratMengemudi(String nomorLisensi, String tanggalBerlaku) {
        this.nomorLisensi = nomorLisensi;
        this.tanggalBerlaku = tanggalBerlaku;
    }

    public void cetakLisensi() {
        System.out.println("Lisensi: " + nomorLisensi);
        System.out.println("Berlaku sampai: " + tanggalBerlaku);
    }
}

class Kendaraan {
    public void hidupkanMesin() {
        System.out.println("Kendaraan dihidupkan...");
    }
}

class Mobil extends Kendaraan {
    public void hidupkanMesin() {
        System.out.println("Mesin mobil menyala!");
    }
}

class Motor extends Kendaraan {
    public void hidupkanMesin() {
        System.out.println("Mesin motor menyala!");
    }
}

class Pengendara {
    String name;
    Kendaraan vehicle;
    SuratMengemudi license;

    public Pengendara(String name, Kendaraan vehicle, String nomorLisensi, String tanggalBerlaku) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new SuratMengemudi(nomorLisensi, tanggalBerlaku);
    }

    public void cetakData() {
        System.out.println("== Data Pengendara ==");
        System.out.println("Nama       : " + name);

        if (vehicle instanceof Mobil) {
            System.out.println("Kendaraan  : Mobil");
        } else if (vehicle instanceof Motor) {
            System.out.println("Kendaraan  : Motor");
        } else {
            System.out.println("Kendaraan  : Tidak diketahui");
        }

        vehicle.hidupkanMesin();
        license.cetakLisensi();
    }
}

public class Main {
    public static void main(String[] args) {
        Pengendara viesto = new Pengendara("Viesto", new Mobil(), "VI001", "31 Desember 2025");
        Pengendara ardya = new Pengendara("Ardya", new Motor(), "AR002", "15 Mei 2026");

        viesto.cetakData();
        System.out.println("------------");
        ardya.cetakData();
    }
}
