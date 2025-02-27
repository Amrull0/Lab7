import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Patient[] patients = new Patient[5];
        patients[0] = new Patient("Иванов", "Иван", "Иванович", "Москва, ул. Ленина, 10", 12345, "Грипп");
        patients[1] = new Patient("Петров", "Петр", "Петрович", "Пенза, пр. Строителей, 5", 67890, "Диабет");
        patients[2] = new Patient("Сидоров", "Алексей", "Алексеевич", "Казань, ул. Баумана, 3", 11223, "Грипп");
        patients[3] = new Patient("Козлова", "Анна", "Сергеевна", "Пенза, ул, Пушкина, 103", 24523, "Ангина");
        patients[4] = new Patient("Козлова", "Ольга", "Васильевна", "Казань, ул. Победы, 67", 73487, "Рак");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите диагноз для поиска: ");
        String searchDiagnos = scanner.nextLine();

        System.out.println("Пациенты с диагнозом: " + searchDiagnos);
        boolean found = false;

        for (Patient patient : patients) {
            if (patient.getDiagnos().equalsIgnoreCase(searchDiagnos)) {
                System.out.println(patient);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Пациенты с таким диагнозом не найдены.");
        }

        scanner.close();
    }
}
        class Patient {
            String name;
            String surname;
            String otchestvo;
            String address;
            int medCard;
            String diagnos;

            public Patient(String name, String surname, String otchestvo, String address, int medCard, String diagnos) {
                this.name = name;
                this.surname = surname;
                this.otchestvo = otchestvo;
                this.address = address;
                this.medCard = medCard;
                this.diagnos = diagnos;
            }

            public String getDiagnos() {
                return diagnos;
            }

            @Override
            public String toString() {
                return name + " " + surname + " " + otchestvo + ", Адрес: " + address + ", № карты: " + medCard + ", Диагноз: " + diagnos;
            }
        }

