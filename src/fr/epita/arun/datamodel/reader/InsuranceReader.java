package fr.epita.arun.datamodel.reader;

import fr.epita.arun.datamodel.Insurance;
import fr.epita.arun.datamodel.Patient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InsuranceReader {
    public static void ReadAll() throws IOException {
        Path currentFilePath = Path.of("data/insurances.csv");
        System.out.println("looking for file at this location:" + currentFilePath.toFile().getAbsolutePath());
        List<String> lines = Files.readAllLines(currentFilePath);
        System.out.println(lines);

        List<Insurance> insurances = new ArrayList<>();
        lines.remove(0);
        //data mapping
        //pat_num_HC;pat_lastname;pat_firstname;pat_address;pat_tel;pat_insurance_id;pat_subscription_date
        //"1256987452365";Martin;Bernard;Chatillon;"0106060606";2;01/10/2010
        for (String line : lines) {
            String[] parts = line.split(";");
            Insurance insurance = extractInsurance(parts);
            insurances.add(insurance);
        }

        List<Insurance> insuranceWithStream = lines.stream()
                .map(s -> extractInsurance(s.split(";")))
                .toList();

//        System.out.println(insuranceWithStream);

    }

    private static Insurance extractInsurance(String[] row) {
        Insurance insurance = new Insurance();
        insurance.setInsurance_id(Integer.parseInt(row[0]));
        insurance.setInsurance_name(row[1]);
        return insurance;
    }
}
