package atividade;

import java.io.*;
import java.util.Arrays;

public class questao1 {
    public static void main(String args[]) throws IOException {

        FileInputStream stream = new FileInputStream("/home/alisson/activity_java/datas.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        
        String [] input = new String[3];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        String[] TamanhoSeparado = input[2].split(" ");

        
        int media = 0;
        int resultado = 0;
        for(int k=0; k < TamanhoSeparado.length; k++) {
        	media += Integer.parseInt(TamanhoSeparado[k]); 
        }
        media = media / Integer.parseInt(input[0]);
        
        while(media > 0) {
        	for(int k=0; k < TamanhoSeparado.length; k++) {
            	resultado += Integer.parseInt(TamanhoSeparado[k]) / media;
        	}
        	if(resultado == Integer.parseInt(input[0])) {
        		System.out.println(media);
        		break;
        	}
        	else {
        		media = media - 1;
        		resultado = 0;
        	}
        }
    }
}