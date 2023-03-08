package com.zupedu.bancodigital.transferencia;

import com.zupedu.bancodigital.conta.ContaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Autowired
    private ContaRepository contaRepository;

    @PostMapping
    public TransferenciaResponse inserir(@Valid @RequestBody TransferenciaRequest request){
        var transferencia = request.toModel(contaRepository);

        transferenciaRepository.save(transferencia);

        logger.info("Tranferencia da conta de origem {} para conta de destino {} com valor {} realizada",
                transferencia.getContaOrigem().getNumero(),
                transferencia.getContaDestino().getNumero(),
                transferencia.getValor());
        return TransferenciaResponse.from(transferencia);
    }
}
