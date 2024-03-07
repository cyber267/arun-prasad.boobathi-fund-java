package fr.epita.arun.datamodel.reader;

import fr.epita.arun.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) throws IOException {
    Path currentFilePath = Path.of("");
    System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
    List<String> lines = Files.readAllLines(currentFilePath);
    System.out.println(lines);

    List<Patient> patients = new ArrayList<>();
    lines.remove(0);
    //data mapping
    //pat_num_HC;pat_lastname;pat_firstname;pat_address;pat_tel;pat_insurance_id;pat_subscription_date
    //"1256987452365";Martin;Bernard;Chatillon;"0106060606";2;01/10/2010
    for (String line : lines){
        String[] parts = line.split(";");
        Patient patient = extractPatient(parts);
        patients.add(patient);
    }

    List<Patient> patientsWithStream = lines.stream()
            .map(s -> extractPatient(s.split(";")))
            .toList();

    System.out.println(patientsWithStream);

}

public class PatientReader {
}


private static Patient extractPerson(String[] row)  {
    Patient patient = new Patient();
    patient.setPatNum(row[0]);
    patient.setPatLastname(row[1]);
    patient.setPatFirstname(row[2]);
    patient.setPatAddress(row[3]);
    patient.setPatTel(row[4]);
    patient.setPatInsuranceId(row[5]);
}
