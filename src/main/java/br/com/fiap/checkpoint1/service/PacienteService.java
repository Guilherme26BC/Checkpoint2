package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.dto.paciente.PacienteRequestCreate;
import br.com.fiap.checkpoint1.dto.paciente.PacienteRequestUpdate;
import br.com.fiap.checkpoint1.model.Pacientes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    //lista auxiliar
    private List<Pacientes> pacientes = new ArrayList<>();
    //sequence para id
    private Long sequence =1L;

    public Pacientes createPaciente(PacienteRequestCreate dto){
        Pacientes pacientes = new Pacientes();
        pacientes.setId(sequence++);
        //instanciando os atributos do paciente pelo dto
        pacientes.setNome(dto.getNome());
        pacientes.setEndereco(dto.getEndereco());
        pacientes.setBairro(dto.getBairro());
        pacientes.setEmail(dto.getEmail());
        pacientes.setTelefone_completo(dto.getTelefone_completo());

        this.pacientes.add(pacientes);
        return pacientes;
    }
    public Optional<Pacientes> updatePaciente(Long id, PacienteRequestUpdate dto){
        //percorre a lista e procura o id que corresponde ao digitado
        return pacientes.stream().filter(p->p.getId().equals(id))
                .findFirst()
                .map(p->{
                    //atualiza os dados do paciente e atualiza com o dto
                   p.setNome(dto.getNome());
                   p.setEndereco(dto.getEndereco());
                   p.setBairro(dto.getBairro());
                   p.setEmail(dto.getEmail());
                   p.setTelefone_completo(dto.getTelefone_completo());
                    return p;
                });
    }

    public boolean deletePaciente(Long id){
        return pacientes.removeIf(p->p.getId().equals(id));
    }

    public Optional<Pacientes> getById(Long id){
        //retorna o primeiro elemento que corresponde
        return pacientes.stream()
                .filter(p-> p.getId().equals(id))
                .findFirst();
    }
    public List<Pacientes> getAllPacientes(){
        return pacientes;
    }
}
