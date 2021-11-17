package atividade;

import java.io.*;
import java.util.Arrays;

public class questao3 {
    public static void main(String args[]) throws IOException {

        FileInputStream stream = new FileInputStream("/home/alisson/activity_java/datas.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        String [] input = new String[2];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        String[] input1Sep = input[0].split(" ");
        String[] input2Sep = input[1].split(" ");
        int [] input1Separado = new int [input1Sep.length];
        int [] input2Separado = new int [input2Sep.length];
        for(int j=0; j<input1Sep.length; j++) {
        	input1Separado[j] = Integer.parseInt(input1Sep[j]);
        	input2Separado[j] = Integer.parseInt(input2Sep[j]);
        }
        
        if(input2Separado[0] >= input1Separado[0] && input2Separado[0] <= input1Separado[2] && input2Separado[1] >= input1Separado[1] && input2Separado[1] <= input1Separado[3]) {
        	System.out.println("1");        	
        } else {
        	if(input2Separado[2] >= input1Separado[0] && input2Separado[2] <= input1Separado[2] && input2Separado[3] >= input1Separado[1] && input2Separado[3] <= input1Separado[3]) {        	
        		System.out.println("1");
        	} else {
        		System.out.println("0");
        	}
        }
	}
}
