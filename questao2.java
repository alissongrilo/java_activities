package atividade;

import java.io.*;
import java.util.Arrays;

public class questao2 {
    public static void main(String args[]) throws IOException {

        FileInputStream stream = new FileInputStream("/home/alisson/activity_java/datas.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        
        String input1 = linha;
        linha = br.readLine();
        String [] input1Separado = input1.split(" ");
        String [] input = new String[Integer.parseInt(input1Separado[1])];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        
        
        int [] vendedores = new int [Integer.parseInt(input1Separado[0])];
        int [] resultadovendedores = new int [Integer.parseInt(input1Separado[0])];
        int fim = 1;
        
        for(int j = 0; j < vendedores.length; j++) {
        	try {
        	vendedores[j] = Integer.parseInt(input[j]);
        	input[j] = "0";
        	} catch (Exception e) {
        	      System.out.println("Não é possível!");
            }
        }
        
        while(fim == 1) {
        	fim = 0;
        	
        	for(int j = 0; j < vendedores.length; j++) {
            	vendedores[j] = vendedores[j]-1;
            	if(vendedores[j] == 0) {
            		resultadovendedores[j] = resultadovendedores[j] + 1;
            	}
            }
        	
            for(int j = 0; j < vendedores.length; j++) {
            	for(int k = 0; k < input.length; k++) {
            		if(vendedores[j] == 0 && Integer.parseInt(input[k])!=0) {
            			try {
            			vendedores[j] = Integer.parseInt(input[k]);
            			input[k] = "0";
            			} catch (Exception e) {
                  	      System.out.println("Não é possível!");
                        }
            		}
            	}
            }
        
            for(int j = 0; j < vendedores.length; j++) {
            	if(vendedores[j]>0) {
            		fim = 1;
            	}
            }
        }

        for(int j = 0; j < vendedores.length; j++) {
        	System.out.println(j + 1 + " " + resultadovendedores[j]);
        }
	}
}
