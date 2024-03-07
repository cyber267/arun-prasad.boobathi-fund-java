package fr.epita.arun.launcher;

import java.lang.NumberFormatException;


import fr.epita.arun.datamodel.reader.InsuranceReader;
import fr.epita.arun.datamodel.reader.PatientReader;

import java.io.IOException;

public class TestOOP2 {
    public static void main(String[] args) throws IOException {
        PatientReader.ReadAll();
        InsuranceReader.ReadAll();
    }

}
