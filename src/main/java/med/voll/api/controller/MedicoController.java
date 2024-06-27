package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // o Spring carrega nossa classe
@RequestMapping("/medicos") // mapear a URL /medicos
public class MedicoController {

    @PostMapping // é para voce chamar o metodo cadastrar da classe medicoController
    public void cadastrar(@RequestBody DadosCadastroMedico dados ) { //@RequestBody é para puxar do corpo da requisição.
        System.out.println(dados);

    }


}
