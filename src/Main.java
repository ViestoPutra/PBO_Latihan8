class HealthRecord {
    private String recordNumber;
    private String creationDate;

    public HealthRecord(String recordNumber, String creationDate) {
        this.recordNumber = recordNumber;
        this.creationDate = creationDate;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public String getCreationDate() {
        return creationDate;
    }
}

class Animal {
    protected HealthRecord healthRecord;

    public Animal(String recordNumber, String creationDate) {
        this.healthRecord = new HealthRecord(recordNumber, creationDate);
    }

    public void makeSound() {
        System.out.println("suara hewan tidak diketahui.");
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }
}

class Dog extends Animal {
    public Dog(String recordNumber, String creationDate) {
        super(recordNumber, creationDate);
    }

    @Override
    public void makeSound() {
        System.out.println("guk-guk!");
    }
}

class Cat extends Animal {
    public Cat(String recordNumber, String creationDate) {
        super(recordNumber, creationDate);
    }

    public void makeSound() {
        System.out.println("meong!");
    }
}

class Owner {
    private String name;
    private Animal pet;

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void showPetInfo() {
        System.out.println(("nama pemilik: " + name).toLowerCase());
        System.out.print("suara hewan peliharaan: ");
        pet.makeSound();

        if (pet instanceof Dog) {
            System.out.println("jenis hewan: dog");
        } else if (pet instanceof Cat) {
            System.out.println("jenis hewan: cat");
        } else {
            System.out.println("jenis hewan: tidak diketahui");
        }

        System.out.println("nomor rekam medis: " + pet.getHealthRecord().getRecordNumber());
        System.out.println("tanggal rekam medis: " + pet.getHealthRecord().getCreationDate());
        System.out.println("-------------------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Toby", "15-05-2025");
        Cat cat = new Cat("Michiko", "15-05-2025");

        Owner owner1 = new Owner("Viesto", dog);
        Owner owner2 = new Owner("Ardya", cat);

        owner1.showPetInfo();
        owner2.showPetInfo();
    }
}
