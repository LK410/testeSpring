package br.edu.ifrs.restinga.dev1.lucas.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class ImcController {
    @RequestMapping("/imc/{peso}{altura}")
    @ResponseBody
//1) Escreva um controller em spring que receba o peso e a altura de uma pessoa a partir de uma url e gere o seu
// IMC (Índice de Massa Corporal). O IMC é calculado através da equação:


    public String imc(@PathVariable  double peso,@RequestParam("altura") double altura   ) {

        double imc=0.0;
        imc =peso/(altura*altura);

       if (imc<18.5)
           return "Status: Magreza  Valor IMC: "+imc+" !";
       else if (imc > 18.5 && imc < 24.9)
           return  "Status: Saudável Valor IMC: "+imc+" !";
       else
           return  "Status: Obesidade GrauIII Valor IMC: "+imc+"!";


    }

}


