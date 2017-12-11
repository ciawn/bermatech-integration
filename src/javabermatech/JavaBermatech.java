/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabermatech;

import java.io.IOException;
import javabermatech.Send;
import javabermatech.ImpressaoNaoFiscal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import javax.swing.Timer;

/**
 *
 * @author reginaldo
 */
public class JavaBermatech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException, TimeoutException {
        boolean repeat = true;
        
        while (repeat) {
            Thread.currentThread().sleep(10000);        

            ImpressaoNaoFiscal ImpressaoNaoFiscalObj = new ImpressaoNaoFiscal();

            List<String> listaImpressoras = ImpressaoNaoFiscalObj.retornaImpressoras();

            System.out.println(listaImpressoras.get(2));

            ImpressaoNaoFiscalObj.detectaImpressoras(listaImpressoras.get(2));

            System.out.println(ImpressaoNaoFiscalObj.imprime("Ei"));
        }
    }
    
}
