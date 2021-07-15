package br.edu.ifrs.restinga.dev1.lucas.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class CalculadoraController {
    @RequestMapping("/imc/{n1}{n2}")
    @ResponseBody


    public String imc(@PathVariable  double peso,@RequestParam("n1") int n1,@RequestParam("n1") int n2   ) {


        int n1;
        int n2;

        int adicao=n1+n2;
        int subtracao=n1-n2;
        int multiplicacao=n1*n2;
        int divisao=n1/n2;


        if ()
            return "Valor da soma é : "+imc+" !";
        else if ()
            return  "Status: Saudável Valor IMC: "+imc+" !";
        else
            return  "Status: Obesidade GrauIII Valor IMC: "+imc+"!";


    }

}


