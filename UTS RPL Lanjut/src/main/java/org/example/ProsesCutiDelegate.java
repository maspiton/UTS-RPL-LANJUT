package org.example;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("prosesCutiDelegate")
public class ProsesCutiDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("=========================================");
        System.out.println("STATUS: Pengajuan Cuti telah di-APPROVE oleh Manajer.");
        System.out.println("SISTEM: Update sisa cuti karyawan di database (Simulasi)... SUCCESS!");
        System.out.println("=========================================");
    }
}