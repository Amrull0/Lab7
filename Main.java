import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Иванов", "Иван", "Иванович", "Москва, ул. Ленина, 10", 12345, "Грипп"));
        patients.add(new Patient("Петров", "Петр", "Петрович", "Пенза, пр. Строителей, 5", 67890, "Диабет"));
        patients.add(new Patient("Сидоров", "Алексей", "Алексеевич", "Казань, ул. Баумана, 3", 11223, "Грипп"));

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

